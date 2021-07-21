package com.GS.BlueDart.Models;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Shipment {
    @XmlElement
    private String Prodcode;

    @XmlElement(name = "Service")
    private String Service;

    @XmlElement
    private String PickUpDate;

    @XmlElement
    private String PickUpTime;

    @XmlElement
    private String Origin;

    @XmlElement
    private String OriginAreaCode;

    @XmlElement
    private String Destination;

    @XmlElement
    private String DestinationAreaCode;

    @XmlElement
    private String ProductType;

    @XmlElement
    private String SenderName;

    @XmlElement
    private String ToAttention;

    @XmlElement
    private String Weight;

    @XmlElement
    private String Status;

    @XmlElement
    private String StatusType;

    @XmlElement
    private String ExpectedDeliveryDate;

    @XmlElement
    private String StatusDate;

    @XmlElement
    private String StatusTime;

    @XmlElement
    private String ReceivedBy;

    @XmlElement
    private String Instructions;

    @XmlElement(name = "Scans")
    private Scans ScansObject;

    @XmlAttribute(name = "WaybillNo")
    private String WaybillNo;


    // Getter Methods

    public String getProdcode() {
        return Prodcode;
    }

    public String getService() {
        return Service;
    }

    public String getPickUpDate() {
        return PickUpDate;
    }

    public String getPickUpTime() {
        return PickUpTime;
    }

    public String getOrigin() {
        return Origin;
    }

    public String getOriginAreaCode() {
        return OriginAreaCode;
    }

    public String getDestination() {
        return Destination;
    }

    public String getDestinationAreaCode() {
        return DestinationAreaCode;
    }

    public String getProductType() {
        return ProductType;
    }

    public String getSenderName() {
        return SenderName;
    }

    public String getToAttention() {
        return ToAttention;
    }

    public String getWeight() {
        return Weight;
    }

    public String getStatus() {
        return Status;
    }

    public String getStatusType() {
        return StatusType;
    }

    public String getExpectedDeliveryDate() {
        return ExpectedDeliveryDate;
    }

    public String getStatusDate() {
        return StatusDate;
    }

    public String getStatusTime() {
        return StatusTime;
    }

    public String getReceivedBy() {
        return ReceivedBy;
    }

    public String getInstructions() {
        return Instructions;
    }

    public Scans getScans() {
        return ScansObject;
    }

    public String get_WaybillNo() {
        return WaybillNo;
    }

    // Setter Methods

    public void setProdcode(String Prodcode) {
        this.Prodcode = Prodcode;
    }

    public void setService(String Service) {
        this.Service = Service;
    }

    public void setPickUpDate(String PickUpDate) {
        this.PickUpDate = PickUpDate;
    }

    public void setPickUpTime(String PickUpTime) {
        this.PickUpTime = PickUpTime;
    }

    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    public void setOriginAreaCode(String OriginAreaCode) {
        this.OriginAreaCode = OriginAreaCode;
    }

    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    public void setDestinationAreaCode(String DestinationAreaCode) {
        this.DestinationAreaCode = DestinationAreaCode;
    }

    public void setProductType(String ProductType) {
        this.ProductType = ProductType;
    }

    public void setSenderName(String SenderName) {
        this.SenderName = SenderName;
    }

    public void setToAttention(String ToAttention) {
        this.ToAttention = ToAttention;
    }

    public void setWeight(String Weight) {
        this.Weight = Weight;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public void setStatusType(String StatusType) {
        this.StatusType = StatusType;
    }

    public void setExpectedDeliveryDate(String ExpectedDeliveryDate) {
        this.ExpectedDeliveryDate = ExpectedDeliveryDate;
    }

    public void setStatusDate(String StatusDate) {
        this.StatusDate = StatusDate;
    }

    public void setStatusTime(String StatusTime) {
        this.StatusTime = StatusTime;
    }

    public void setReceivedBy(String ReceivedBy) {
        this.ReceivedBy = ReceivedBy;
    }

    public void setInstructions(String Instructions) {
        this.Instructions = Instructions;
    }

    public void setScans(Scans ScansObject) {
        this.ScansObject = ScansObject;
    }

    public void set_WaybillNo(String _WaybillNo) {
        this.WaybillNo = _WaybillNo;
    }
}