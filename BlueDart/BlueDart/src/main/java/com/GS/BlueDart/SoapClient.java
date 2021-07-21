package com.GS.BlueDart;
import com.GS.BlueDart.stub.CancelWaybillResponse;
import com.GS.BlueDart.stub.GenerateWayBillResponse;
import com.GS.BlueDart.Models.BDTrackResponse;
import com.GS.BlueDart.Models.ShipmentData;
import org.springframework.http.ResponseEntity;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.client.RestTemplate;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapHeaderElement;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import org.springframework.ws.soap.saaj.SaajSoapMessage;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPException;
import java.io.StringReader;

public class SoapClient extends WebServiceGatewaySupport {

    public CancelWaybillResponse cancelWaybill (String url, Object request) throws SOAPException {

        MessageFactory msgFactory = MessageFactory.newInstance(SOAPConstants.SOAP_1_2_PROTOCOL);
        SaajSoapMessageFactory saajSoapMessageFactory = new SaajSoapMessageFactory(msgFactory);
        WebServiceTemplate wsTemplate = getWebServiceTemplate();
        wsTemplate.setMessageFactory(saajSoapMessageFactory);

        String action = "http://tempuri.org/IWayBillGeneration/CancelWaybill";
        String uri = "https://netconnect.bluedart.com/Ver1.9/ShippingAPI/WayBill/WayBillGeneration.svc";

        SoapActionCallback requestCallback = new SoapActionCallback(action) {
            public void doWithMessage(WebServiceMessage message) {
                SaajSoapMessage soapMessage = (SaajSoapMessage) message;
                SoapHeader soapHeader = soapMessage.getSoapHeader();

                QName wsaToQName = new QName("http://www.w3.org/2005/08/addressing", "To", "wsa");
                SoapHeaderElement wsaTo =  soapHeader.addHeaderElement(wsaToQName);
                wsaTo.setText(uri);

                QName wsaActionQName = new QName("http://www.w3.org/2005/08/addressing", "Action", "wsa");
                SoapHeaderElement wsaAction =  soapHeader.addHeaderElement(wsaActionQName);
                wsaAction.setText(action);
            }
        };
        CancelWaybillResponse res = (CancelWaybillResponse) wsTemplate.marshalSendAndReceive(url, request, requestCallback);
        return res;
    }

    public GenerateWayBillResponse generateWaybill (String url, Object request) throws SOAPException {

        MessageFactory msgFactory = MessageFactory.newInstance(SOAPConstants.SOAP_1_2_PROTOCOL);
        SaajSoapMessageFactory saajSoapMessageFactory = new SaajSoapMessageFactory(msgFactory);
        WebServiceTemplate wsTemplate = getWebServiceTemplate();
        wsTemplate.setMessageFactory(saajSoapMessageFactory);

        String action = "http://tempuri.org/IWayBillGeneration/GenerateWayBill";
        String uri = "https://netconnect.bluedart.com/Ver1.9/ShippingAPI/WayBill/WayBillGeneration.svc";

        SoapActionCallback requestCallback = new SoapActionCallback(action) {
            public void doWithMessage(WebServiceMessage message) {
                SaajSoapMessage soapMessage = (SaajSoapMessage) message;
                SoapHeader soapHeader = soapMessage.getSoapHeader();

                QName wsaToQName = new QName("http://www.w3.org/2005/08/addressing", "To", "wsa");
                SoapHeaderElement wsaTo =  soapHeader.addHeaderElement(wsaToQName);
                wsaTo.setText(uri);

                QName wsaActionQName = new QName("http://www.w3.org/2005/08/addressing", "Action", "wsa");
                SoapHeaderElement wsaAction =  soapHeader.addHeaderElement(wsaActionQName);
                wsaAction.setText(action);
            }
        };
        GenerateWayBillResponse res = (GenerateWayBillResponse) wsTemplate.marshalSendAndReceive(url, request, requestCallback);
        return res;
    }

    public BDTrackResponse trackOrder (String url) throws SOAPException, JAXBException {

        MessageFactory msgFactory = MessageFactory.newInstance(SOAPConstants.SOAP_1_2_PROTOCOL);
        SaajSoapMessageFactory saajSoapMessageFactory = new SaajSoapMessageFactory(msgFactory);
        WebServiceTemplate wsTemplate = getWebServiceTemplate();
        wsTemplate.setMessageFactory(saajSoapMessageFactory);

        String action = "http://tempuri.org/IWayBillGeneration/GenerateWayBill";
        String uri = "https://netconnect.bluedart.com/Ver1.9/ShippingAPI/WayBill/WayBillGeneration.svc";

        SoapActionCallback requestCallback = new SoapActionCallback(action) {
            public void doWithMessage(WebServiceMessage message) {
                SaajSoapMessage soapMessage = (SaajSoapMessage) message;
                SoapHeader soapHeader = soapMessage.getSoapHeader();

                QName wsaToQName = new QName("http://www.w3.org/2005/08/addressing", "To", "wsa");
                SoapHeaderElement wsaTo =  soapHeader.addHeaderElement(wsaToQName);
                wsaTo.setText(uri);

                QName wsaActionQName = new QName("http://www.w3.org/2005/08/addressing", "Action", "wsa");
                SoapHeaderElement wsaAction =  soapHeader.addHeaderElement(wsaActionQName);
                wsaAction.setText(action);
            }
        };
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> xmlString = restTemplate.getForEntity(url,  String.class);
        StringReader sr = new StringReader(xmlString.getBody());
        JAXBContext jaxbContext = JAXBContext.newInstance(BDTrackResponse.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        ShipmentData response = (ShipmentData) unmarshaller.unmarshal(sr);
        BDTrackResponse response1 = (BDTrackResponse) unmarshaller.unmarshal(sr);

//        BDTrackResponse res = (BDTrackResponse) wsTemplate.marshalSendAndReceive(url, "",  requestCallback);
        return response1;
    }

}