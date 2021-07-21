package com.GS.BlueDart.Service;

import com.GS.BlueDart.Models.*;
import com.GS.BlueDart.SoapClient;
import com.GS.BlueDart.stub.*;
import com.GS.BlueDart.EntityModels.OrderPlacementResponse;
import com.GS.BlueDart.Models.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.client.RestTemplate;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.soap.SOAPException;
import java.io.StringReader;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class BlueDartImpl {

    public static UserProfile profile = new UserProfile();
    static {
        profile.setLoginID("NBM39617");
        profile.setLicenceKey("fsqplghphfigilsfkqhkqjiignumu8kj");
        profile.setApiType("S");
        profile.setVersion("1.9");
    }

    public static Profile restProfile = new Profile();
    static {
        restProfile.setLoginID("NBM39617");
        restProfile.setLicenceKey("fsqplghphfigilsfkqhkqjiignumu8kj");
        restProfile.setApi_type("S");
        restProfile.setVersion("1.9");
    }

    public static String customerCode = "119545";

    RestTemplate restTemplate = new RestTemplate();

//    @Autowired
    private SoapClient soapClient = new SoapClient();

    private static final Logger logger = LoggerFactory.getLogger(BlueDartImpl.class);

    public OrderPlacementResponse bdCreateOrder(PlaceOrderRequest placeOrderRequest, String orgID) throws DatatypeConfigurationException {
        OrderPlacementResponse orderPlacementResponse = new OrderPlacementResponse();
        GenerateWayBillResponse generateWayBillResponse =  createWaybill(placeOrderRequest);
        String shipperStatus = null;
        if (generateWayBillResponse != null) {
            if (!generateWayBillResponse.getGenerateWayBillResult().isIsError()) {
                shipperStatus = "Success";
                String awb = generateWayBillResponse.getGenerateWayBillResult().getAWBNo();
                placeOrderRequest.setAwb(awb);
                orderPlacementResponse.setAwbNumber(awb);
            }
            else {
                shipperStatus = "Failed";
                logger.info("BlueDart order placement fwd failed due to: " + generateWayBillResponse.getGenerateWayBillResult().getStatus().getWayBillGenerationStatus().get(0).getStatusInformation());
            }
        }
        orderPlacementResponse.setShipperStatus(shipperStatus);
        return orderPlacementResponse;
    }

    public GenerateWayBillResponse createWaybill (PlaceOrderRequest placeOrderRequest) throws DatatypeConfigurationException {
//        WayBillGenerationResponse wayBillGenerationResponse = new WayBillGenerationResponse();
        ObjectFactory factory = new ObjectFactory();
        WayBillGenerationRequest wayBillGenerationRequest = new WayBillGenerationRequest();
        GenerateWayBill generateWayBill = new GenerateWayBill();
        GenerateWayBill request = factory.createGenerateWayBill();

        //Creating WayBillGenerationRequest
        Shipper shipper = factory.createShipper();
        Consignee consignee = factory.createConsignee();
        Services services = factory.createServices();

        //Setting Shipper values
        String originAreaCode = placeOrderRequest.getOrigin_code().substring(0, placeOrderRequest.getOrigin_code().indexOf("/"));
        shipper.setOriginArea(originAreaCode);
        shipper.setCustomerCode(customerCode);
        shipper.setCustomerName(placeOrderRequest.getPickupDetails().getName());
        shipper.setCustomerAddress1(placeOrderRequest.getPickupDetails().getAddress());
        shipper.setCustomerPincode(placeOrderRequest.getPickupDetails().getPinCode());
        shipper.setIsToPayCustomer(true);

        //Setting Consignee values
        consignee.setConsigneeName(placeOrderRequest.getShippingDetails().getName());
        consignee.setConsigneeAddress1(placeOrderRequest.getShippingDetails().getAddress());
        consignee.setConsigneePincode(placeOrderRequest.getShippingDetails().getPinCode());
        consignee.setConsigneeMobile(placeOrderRequest.getShippingDetails().getMsisdn());

        //Setting Services values
        services.setProductCode("A");
        services.setProductType(ProductType.DUTIABLES);
        services.setPieceCount(placeOrderRequest.getSubOrderdetail().size());
        if (placeOrderRequest.getPaymentType().equals("COD")) {
            services.setSubProductCode("C");
            services.setCollectableAmount(Double.parseDouble(placeOrderRequest.getTotalAmount()));
        } else {
            services.setSubProductCode("P");
        }
        double totalWeight = 0;
        for (OrderDetails orderDetails : placeOrderRequest.getSubOrderdetail()) {
            totalWeight += (double) orderDetails.getDeadWeight()/1000;
        }
        services.setActualWeight(totalWeight);
        services.setCreditReferenceNo(placeOrderRequest.getShopOrderNo());
        Calendar cal = Calendar.getInstance();

        GregorianCalendar c = new GregorianCalendar(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DATE) + 1);
        XMLGregorianCalendar pickupDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
        services.setPickupDate(pickupDate);
        services.setPickupTime("1200");
        services.setDeclaredValue(Double.parseDouble(placeOrderRequest.getTotalAmount()));
            //Setting Dimensions
        Dimension dimension = new Dimension();
        dimension.setBreadth(Double.parseDouble(placeOrderRequest.getShipmentWidth()));
        dimension.setHeight(Double.parseDouble(placeOrderRequest.getShipmentHeight()));
        dimension.setLength(Double.parseDouble(placeOrderRequest.getShipmentLength()));
        dimension.setCount(1);
        ArrayOfDimension arrayOfDimension = new ArrayOfDimension();
        arrayOfDimension.getDimension().add(dimension);
        services.setDimensions(arrayOfDimension);

        wayBillGenerationRequest.setConsignee(consignee);
        wayBillGenerationRequest.setShipper(shipper);
        wayBillGenerationRequest.setServices(services);

        generateWayBill.setRequest(wayBillGenerationRequest);
        generateWayBill.setProfile(profile);

        try {
            Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
            marshaller.setContextPath("com.GS.BlueDart.stub");
            SoapClient client = new SoapClient();
            client.setMarshaller(marshaller);
            client.setUnmarshaller(marshaller);
            GenerateWayBillResponse response = client.generateWaybill("https://netconnect.bluedart.com/Ver1.9/ShippingAPI/WayBill/WayBillGeneration.svc",
                    generateWayBill);
            return response;
        } catch (Exception e) {
            logger.error("BlueDart generate waybill failed due to: " + e);
        }
        return new GenerateWayBillResponse();
    }

    public CancelWaybillResponse cancelWaybill (String awb) throws SOAPException {
        ObjectFactory factory = new ObjectFactory();
        CancelWaybill cancelWaybillRequest = factory.createCancelWaybill();
        AWBCancelationResponse cancelWaybillResponse = factory.createAWBCancelationResponse();
        //Creating AWBCancelationRequest
        AWBCancelationRequest awbCancelationRequest = new AWBCancelationRequest();
        awbCancelationRequest.setAWBNo(awb);
        cancelWaybillRequest.setRequest(awbCancelationRequest);
        cancelWaybillRequest.setProfile(profile);
        try {
            Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
            marshaller.setContextPath("com.GS.BlueDart.stub");
            SoapClient client = new SoapClient();
            client.setMarshaller(marshaller);
            client.setUnmarshaller(marshaller);
            CancelWaybillResponse response = client.cancelWaybill("https://netconnect.bluedart.com/Ver1.9/ShippingAPI/WayBill/WayBillGeneration.svc",
                    cancelWaybillRequest);
            return response;
        } catch (Exception e) {
            logger.error("BlueDart cancel order failed due to : " + e);
        }
        return new CancelWaybillResponse();
    }

    public NDRResponse initiateRTO(ArrayList<String> awbs, OrderPlacementResponse shipmentDetails) throws JsonProcessingException, SOAPException, ParseException {
        NDRResponse ndrResponse = new NDRResponse();
        for (String awb : awbs) {

            CancelWaybillResponse response = cancelWaybill(awb);

            if (response == null || response.getCancelWaybillResult().isIsError()) {

                //To do : Logic to handle AWB's if Shipment Fails
                String msg = "null response from shipper";
                String awbNo = response.getCancelWaybillResult().getAWBNo();
                if (response != null) {
                    msg = response.getCancelWaybillResult().getStatus().getWayBillGenerationStatus().get(0).getStatusInformation();
                }
                NDRResponse.NdrResponse eachNdrResponse = new NDRResponse.NdrResponse();
                eachNdrResponse.setMessage(msg);
                eachNdrResponse.setAwbNumber(awbNo);
                eachNdrResponse.setCode("400");
                ArrayList<NDRResponse.NdrResponse> eachResponseList = new ArrayList<>();
                eachResponseList.add(eachNdrResponse);
                ndrResponse.setNDRResponse(eachResponseList);
                return ndrResponse;
            }
        }

        ArrayList<NDRResponse.NdrResponse> ndrResponseList = new ArrayList<>();
        if (!shipmentDetails.isPickedFormWareHouse()) {
            for (String eachAwb : awbs) {
                NDRResponse.NdrResponse eachNdr = new NDRResponse.NdrResponse();
                eachNdr.setAwbNumber(eachAwb);
                eachNdr.setMessage("Test Passed");
                eachNdr.setCode("200");
                eachNdr.setShipperId(5);
                ndrResponseList.add(eachNdr);
            }
            ndrResponse.setNDRResponse(ndrResponseList);
        } else {
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.setContentType(MediaType.APPLICATION_JSON);ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);

            String url = "http://netconnect.bluedart.com/Ver1.9/ShippingAPI/ALTInstruction/ALTInstructionUpdate.svc/rest/CustALTInstructionUpdate";

            ResponseEntity<AltInstructionResponse> responseEntity = null;
            for (String eachAwb : awbs) {
                AltInstructionRequest altInstructionRequest = new AltInstructionRequest();
                AltInstructionSubRequest altInstructionSubRequest = new AltInstructionSubRequest();

                altInstructionSubRequest.setAltInstructionType("RTO");
                altInstructionSubRequest.setAwb(eachAwb);
                String jsonNewDate;
                SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);

                String newDateString = formatter.format(new Date());
                Calendar c = Calendar.getInstance();
                c.setTime(formatter.parse(newDateString));
                c.add(Calendar.DATE, 1);  // number of days to add
                newDateString = formatter.format(c.getTime());
                Date newDateObj =  formatter.parse(newDateString);
                jsonNewDate = mapper.writeValueAsString(newDateObj);
                jsonNewDate = "/Date(" + jsonNewDate + ")/";
                altInstructionSubRequest.setPreferDate(jsonNewDate);

                altInstructionRequest.setProfile(restProfile);
                altInstructionRequest.setAltreq(altInstructionSubRequest);
                String json = mapper.writeValueAsString(altInstructionRequest);
                logger.info("json : " + json.toString());

                HttpEntity<String> entity = new HttpEntity<>(json, httpHeaders);
                logger.info("entity : " + entity.toString());
                AltInstructionResponse bdResponse = new AltInstructionResponse();
                try {
                    long inTime = System.currentTimeMillis();
                    responseEntity = restTemplate.exchange(url, HttpMethod.POST, entity, AltInstructionResponse.class);
                    bdResponse = responseEntity.getBody();
//            responseStatus = FedExResponseEntity.getStatusCodeValue();
                    long outTime = System.currentTimeMillis();
                    logger.info("Latency of Rest : " + (outTime - inTime));
                    if (bdResponse != null) {
                        NDRResponse.NdrResponse eachNdr = new NDRResponse.NdrResponse();
                        eachNdr.setAwbNumber(bdResponse.getCustAltInstructionUpdate().getAwb());
                        eachNdr.setMessage("Test Passed");
                        eachNdr.setCode("200");
                        eachNdr.setShipperId(5);
                        ndrResponseList.add(eachNdr);

                        ndrResponse.setNDRResponse(ndrResponseList);
                    }
                } catch (Exception e) {
                    logger.error("BlueDart RTO failed due to: " + e);
                    return  ndrResponse;
                }
            }

        }
        return ndrResponse;
    }
        public NDRResponse.NdrResponse initiateNDR (AltInstructionRequest bdNDRRequest) throws JsonProcessingException {

//        NDRResponse ndrResponse = new NDRResponse();
//        ArrayList<String> awbList = new ArrayList<>();
        NDRResponse.NdrResponse ndrResponse = new NDRResponse.NdrResponse();

        ndrResponse.setAwbNumber(bdNDRRequest.getAltreq().getAwb());
//        for (SfxNDRRequest.SfxNdrRequest request : sfxNDRRequest.getSfxNdrRequests()){
//            awbList.add(request.getAwb());
//        }

//        ArrayList<NDRResponse.NdrResponse> responseList = new ArrayList<>();
//
//        for (String awb : awbList){
//            NDRResponse.NdrResponse response = new NDRResponse.NdrResponse();
//            response.setAwbNumber(awb);
//            responseList.add(response);
//        }
//        ndrResponse.setNDRResponse(responseList);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        String json = mapper.writeValueAsString(bdNDRRequest);

        String url = "http://netconnect.bluedart.com/Ver1.9/ShippingAPI/ALTInstruction/ALTInstructionUpdate.svc/rest/CustALTInstructionUpdate";

        logger.info("json : " + json.toString());

        HttpEntity<String> entity = new HttpEntity<>(json, httpHeaders);

        logger.info("entity : " + entity.toString());
        ResponseEntity<AltInstructionResponse> responseEntity = null;
        ThirdPartyResponse<AltInstructionResponse> thirdPartyResponse = new ThirdPartyResponse<>();

        try {
            long inTime = System.currentTimeMillis();
            responseEntity = restTemplate.exchange(url, HttpMethod.POST, entity, AltInstructionResponse.class);
//            responseStatus = FedExResponseEntity.getStatusCodeValue();
            long outTime = System.currentTimeMillis();
            logger.info("Latency of Rest : " + (outTime - inTime));
        } catch (Exception e) {

            logger.error("Order NDR of BlueDart failed Due to " + e + "for awb " + bdNDRRequest.getAltreq().getAwb()); //TODO
            thirdPartyResponse.setIsSuccess(false);
            thirdPartyResponse.setMessage("Order NDR of BlueDart failed Due to " + e + "for awb " + bdNDRRequest.getAltreq().getAwb()); //TODO

            if (thirdPartyResponse.getResult() != null)
                //cancelOrderResponse.setResult(responseEntity.getBody());
                logger.info(thirdPartyResponse.toString());

            ndrResponse.setSuccess(Boolean.FALSE);
            ndrResponse.setMessage("Order NDR of BlueDart failed Due to " + e);
            return ndrResponse;
        }

        if (responseEntity!=null){
            AltInstructionResponse bdNDRResponse = responseEntity.getBody();
            ArrayList<NDRResponse.NdrResponse> ndrResponseList = new ArrayList<>();

//            for(SfxNDRResponse.SfxNdrResponse response : sfxNDRResponse.getSfxNdrResponse()){
//                String awb = response.getAwb_number();
//                NDRResponse.NdrResponse eachNdrResponse = findResponseByAwb(awb, ndrResponse);
////                    eachNdrResponse.setAwbNumber(response.getAwb_number());
//                eachNdrResponse.setMessage(response.getMessage());
//                eachNdrResponse.setShipperId(1);
//
//                if (response.getMessage().equalsIgnoreCase("Successfully registered.")){
//                    eachNdrResponse.setSuccess(Boolean.TRUE);
//                }
//                else eachNdrResponse.setSuccess(Boolean.FALSE);
//                ndrResponseList.add(eachNdrResponse);
//            }
//            ndrResponse.setNDRResponse(ndrResponseList);
            ndrResponse.setMessage(bdNDRResponse.getCustAltInstructionUpdate().getStatus().get(0).getStatusInfo());
            ndrResponse.setShipmentId(5);
        }


        return ndrResponse;
    }

    public ArrayList<TrackOrderResponse.EachShipment> orderTrackingFwd (ArrayList<String> awbs) throws JAXBException {
        ArrayList<TrackOrderResponse.EachShipment> bdTrackingResponse = new ArrayList<>();

        for (String awb : awbs) {
            ShipmentData trackingResponse = trackOrder(awb);
            logger.info("BlueDart Track Order Response for awb:" + awb + " is " + trackingResponse.toString());

            if (trackingResponse != null && trackingResponse.getError() == null && (trackingResponse.getShipment().getScans() != null)) {
                String awbEachShipment = trackingResponse.getShipment().get_WaybillNo();
                for (ScanDetails scanEvent : trackingResponse.getShipment().getScans().getScanDetail()) {
                    TrackOrderResponse.EachShipment eachTrackResponse = new TrackOrderResponse.EachShipment();
                    eachTrackResponse.setShipperStatus(scanEvent.getScanType());
                    eachTrackResponse.setIsSuccess(true);
                    eachTrackResponse.setShipmentLocation(scanEvent.getScannedLocation());
                    eachTrackResponse.setShipperId(5);
                    eachTrackResponse.setRemark(scanEvent.getScan());
                    eachTrackResponse.setAwb(awbEachShipment);
                    String dateTime = scanEvent.getScanDate() + " " + scanEvent.getScanTime();
                    DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("d-MMM-yyyy HH:mm");
                    LocalDateTime localDateTime = LocalDateTime.from(formatDateTime.parse(dateTime));
                    Timestamp ts = Timestamp.valueOf(localDateTime);
                    eachTrackResponse.setModifiedDate(ts);
                    bdTrackingResponse.add(eachTrackResponse);
                }
            }
            else {
                TrackOrderResponse.EachShipment trackOrderResponse = new TrackOrderResponse.EachShipment();
                if (trackingResponse.getError() != null && !trackingResponse.getError().isEmpty()) {
                    trackOrderResponse.setMessage(trackingResponse.getError());
                    logger.info("BlueDart Tracking Response error : " + trackingResponse.getError());
                } else if (trackingResponse.getShipment().getStatus() != null) {
                    trackOrderResponse.setMessage(trackingResponse.getShipment().getStatus());
                }
                trackOrderResponse.setIsSuccess(false);
//                trackOrderResponse.setMessage(trackingResponse.getErrors().get(0).getMessage());
                trackOrderResponse.setShipperId(5);
                bdTrackingResponse.add(trackOrderResponse);
            }
        }
        return bdTrackingResponse;
    }

    public ShipmentData trackOrder(String awb) throws JAXBException {
        ShipmentData response = new ShipmentData();
        String trackingLicKey = "nestrfrltmrrllhhethfvslj4jqlggtn";
        String url = "http://api.bluedart.com/servlet/RoutingServlet?handler=tnt&action=custawbquery&loginid=" +
                        profile.getLoginID() +
                        "&awb=awb&numbers=" + awb +
                        "&format=xml&lickey=" +
                        trackingLicKey +
                        "&verno=1.3f&scan=1";
        try {
            ResponseEntity<String> xmlString = restTemplate.getForEntity(url,  String.class);

            //Unmarshalling the xml string
            StringReader sr = new StringReader(xmlString.getBody());
            JAXBContext jaxbContext = JAXBContext.newInstance(ShipmentData.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            response = (ShipmentData) unmarshaller.unmarshal(sr);

            return response;
        } catch (Exception e) {
            logger.error("BlueDart tracking failed due to " + e);
        }


        return response;
    }
}
