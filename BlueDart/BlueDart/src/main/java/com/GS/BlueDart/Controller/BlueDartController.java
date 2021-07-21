package com.GS.BlueDart.Controller;

import com.GS.BlueDart.Models.*;
import com.GS.BlueDart.SoapClient;
import com.GS.BlueDart.EntityModels.OrderPlacementResponse;
import com.GS.BlueDart.Models.*;
import com.GS.BlueDart.Service.BlueDartImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.soap.SOAPException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

@RestController
public class BlueDartController {
    public static Profile profile = new Profile();
    static {
        profile.setLoginID("NBM39617");
        profile.setLicenceKey("fsqplghphfigilsfkqhkqjiignumu8kj");
        profile.setApi_type("S");
        profile.setVersion("1.9");
    }
    private static final Logger logger = LoggerFactory.getLogger(BlueDartController.class);

//    @Autowired
    private SoapClient soapClient = new SoapClient();

//    @Autowired
    private BlueDartImpl blueDart = new BlueDartImpl();

    @GetMapping("/blue")
    public OrderPlacementResponse generateWaybill(@RequestBody PlaceOrderRequest placeOrderRequest, String orgID) throws DatatypeConfigurationException, SOAPException {

//        GenerateWayBillResponse generateWayBill = blueDart.createWaybillRequest(placeOrderRequest);
//        try {
//            GenerateWayBillResponse response = soapClient.generateWaybill("https://netconnect.bluedart.com/Ver1.9/Demo/ShippingAPI/WayBill/WayBillGeneration.svc",
//                    generateWayBill);
//            return response;
//        } catch (Exception e) {
//
//        }
//        return new GenerateWayBillResponse();

        OrderPlacementResponse orderPlacementResponse = new OrderPlacementResponse();
        orderPlacementResponse.setEstimatedShippingCost(placeOrderRequest.getEstimatedShippingCost());
        if (placeOrderRequest.getShipperId() == 5) {
            orderPlacementResponse = blueDart.bdCreateOrder(placeOrderRequest, orgID);

        }
        return orderPlacementResponse;
    }

    @GetMapping("/blue/cancel")
    public NDRResponse initiateRTO (ArrayList<String> bdNDR, OrderPlacementResponse shipmentDetails) throws SOAPException, JsonProcessingException, ParseException {

//        NDRResponse ndrResponse = new NDRResponse();
//        ArrayList<NDRResponse.NdrResponse> nDRResponse = new ArrayList();
//        ndrResponse.setNDRResponse(nDRResponse);
        NDRResponse ndrResponseBD = new NDRResponse();
        if (bdNDR.size() > 0) {
            ndrResponseBD = this.blueDart.initiateRTO(bdNDR, shipmentDetails);
        }

//        if (ndrResponseBD != null && ndrResponseBD.getNDRResponse() != null && ndrResponseBD.getNDRResponse().size() > 0) {
//            ndrResponse.getNDRResponse().add(ndrResponseBD.getNDRResponse().get(0));
//        }

        return ndrResponseBD;

    }

    @PostMapping("/blue/ndr")
    public NDRResponse initiateNDR (@RequestBody NDRRequest bdNDRRequest) throws ParseException, JsonProcessingException {
        NDRResponse ndrResponse = new NDRResponse();
        ArrayList<NDRResponse.NdrResponse> ndrResponsesList = new ArrayList<>();

        for (NDRRequest.NdrRequest eachNdrReq : bdNDRRequest.getNdrRequests()) {
            AltInstructionRequest altInstructionRequest = new AltInstructionRequest();

            AltInstructionSubRequest altInstructionSubRequest = new AltInstructionSubRequest();
            altInstructionSubRequest.setAltInstructionType("DT");
            altInstructionSubRequest.setAwb(eachNdrReq.getAwbNumber());

            if (eachNdrReq.getNewContact() != null) {
                altInstructionSubRequest.setMobileNo(eachNdrReq.getNewContact());
            }

            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            String jsonNewDate;
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
            if (eachNdrReq.getNewDate() != null) {
                Date newDate = formatter.parse(eachNdrReq.getNewDate());
                jsonNewDate = mapper.writeValueAsString(newDate);
                jsonNewDate = "/Date(" + jsonNewDate + ")/";
                altInstructionSubRequest.setPreferDate(jsonNewDate);
            } else {
                String newDateString = formatter.format(new Date());
                Calendar c = Calendar.getInstance();
                c.setTime(formatter.parse(newDateString));
                c.add(Calendar.DATE, 1);  // number of days to add
                newDateString = formatter.format(c.getTime());
                Date newDateObj =  formatter.parse(newDateString);
                jsonNewDate = mapper.writeValueAsString(newDateObj);
                jsonNewDate = "/Date(" + jsonNewDate + ")/";
                altInstructionSubRequest.setPreferDate(jsonNewDate);
            }
            altInstructionRequest.setAltreq(altInstructionSubRequest);
            altInstructionRequest.setProfile(profile);

            try {
                NDRResponse.NdrResponse eachNdrResponse = new NDRResponse.NdrResponse();
                eachNdrResponse = blueDart.initiateNDR(altInstructionRequest);
                ndrResponsesList.add(eachNdrResponse);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            } catch (Exception e) {
                logger.error("BlueDart RTO failed due to: " + e);
            }

            ndrResponse.setNDRResponse(ndrResponsesList);
        }
        return ndrResponse;
    }

    @GetMapping("/track")
    public ArrayList<TrackOrderResponse.EachShipment> trackOrder(HashMap<Integer, ArrayList<String>> awbPerShipper) throws SOAPException, JAXBException {
        ArrayList<TrackOrderResponse.EachShipment> bdTrackResponse = null;

        for (int shipperID : awbPerShipper.keySet()) {
            if (shipperID == 5) {
                bdTrackResponse = blueDart.orderTrackingFwd(awbPerShipper.get(5));
//                trackOrderPerShipper.put(4, fedExTrackResponse);
            }
        }
        return bdTrackResponse;
    }

//    @GetMapping("/track1")
//    public ArrayList<TrackOrderResponse.EachShipment> trackOrder1(@RequestBody String awb) throws SOAPException, JAXBException {
//        ArrayList<TrackOrderResponse.EachShipment> bdTrackResponse = null;
//
////        for (int shipperID : awbPerShipper.keySet()) {
////            if (shipperID == 5) {
//        ArrayList<String> awbs = new ArrayList<>();
//        awbs.add(awb);
//        bdTrackResponse = blueDart.orderTrackingFwd(awbs);
//////                trackOrderPerShipper.put(4, fedExTrackResponse);
////            }
////        }
//        return bdTrackResponse;
//    }
}
