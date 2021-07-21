package com.GS.BlueDart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.GS.BlueDart.Controller", "com.GS.BlueDart.Service"})
public class BlueDartApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlueDartApplication.class, args);
	}

//	@Bean
//	public Jaxb2Marshaller marshaller()  {
//		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
//		marshaller.setContextPath("com.GrowSimplee.BlueDart.stub");
//		return marshaller;
//	}
//	@Bean
//	public SoapClient soapConnector(Jaxb2Marshaller marshaller) {
//		SoapClient client = new SoapClient();
//		client.setDefaultUri("https://netconnect.bluedart.com/Ver1.9/Demo/ShippingAPI/WayBill/WayBillGeneration.svc");
//		client.setMarshaller(marshaller);
//		client.setUnmarshaller(marshaller);
//		return client;
//	}
//
//	@Bean
//	public BlueDartImpl blueDartService () {
//		BlueDartImpl blueDart = new BlueDartImpl();
//		return blueDart;
//	}

}
