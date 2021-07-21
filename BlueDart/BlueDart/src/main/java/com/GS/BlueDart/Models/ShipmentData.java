package com.GS.BlueDart.Models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ShipmentData", namespace = "")
@XmlAccessorType(XmlAccessType.FIELD)
public class ShipmentData {

    @XmlElement(name = "Shipment")
    private Shipment ShipmentObject;

    @XmlElement(name = "Error")
    private String error;
    // Getter Methods

    public Shipment getShipment() {
        return ShipmentObject;
    }

    // Setter Methods

    public void setShipment(Shipment ShipmentObject) {
        this.ShipmentObject = ShipmentObject;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}