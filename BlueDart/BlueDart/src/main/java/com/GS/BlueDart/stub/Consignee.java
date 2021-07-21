//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.24 at 05:52:48 PM IST 
//


package com.GS.BlueDart.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Consignee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Consignee"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AvailableDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AvailableTiming" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConsigneeAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConsigneeAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConsigneeAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConsigneeAddressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConsigneeAddressinfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConsigneeAttention" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConsigneeCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConsigneeCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConsigneeEmailID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConsigneeFiscalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConsigneeFiscalIDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConsigneeFullAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConsigneeGSTNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConsigneeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConsigneeIDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConsigneeLatitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConsigneeLongitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConsigneeMaskedContactNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConsigneeMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConsigneeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConsigneePincode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConsigneeStateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConsigneeTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Consignee", propOrder = {
    "availableDays",
    "availableTiming",
    "consigneeAddress1",
    "consigneeAddress2",
    "consigneeAddress3",
    "consigneeAddressType",
    "consigneeAddressinfo",
    "consigneeAttention",
    "consigneeCityName",
    "consigneeCountryCode",
    "consigneeEmailID",
    "consigneeFiscalID",
    "consigneeFiscalIDType",
    "consigneeFullAddress",
    "consigneeGSTNumber",
    "consigneeID",
    "consigneeIDType",
    "consigneeLatitude",
    "consigneeLongitude",
    "consigneeMaskedContactNumber",
    "consigneeMobile",
    "consigneeName",
    "consigneePincode",
    "consigneeStateCode",
    "consigneeTelephone"
})
public class Consignee {

    @XmlElement(name = "AvailableDays", nillable = true)
    protected String availableDays;
    @XmlElement(name = "AvailableTiming", nillable = true)
    protected String availableTiming;
    @XmlElement(name = "ConsigneeAddress1", nillable = true)
    protected String consigneeAddress1;
    @XmlElement(name = "ConsigneeAddress2", nillable = true)
    protected String consigneeAddress2;
    @XmlElement(name = "ConsigneeAddress3", nillable = true)
    protected String consigneeAddress3;
    @XmlElement(name = "ConsigneeAddressType", nillable = true)
    protected String consigneeAddressType;
    @XmlElement(name = "ConsigneeAddressinfo", nillable = true)
    protected String consigneeAddressinfo;
    @XmlElement(name = "ConsigneeAttention", nillable = true)
    protected String consigneeAttention;
    @XmlElement(name = "ConsigneeCityName", nillable = true)
    protected String consigneeCityName;
    @XmlElement(name = "ConsigneeCountryCode", nillable = true)
    protected String consigneeCountryCode;
    @XmlElement(name = "ConsigneeEmailID", nillable = true)
    protected String consigneeEmailID;
    @XmlElement(name = "ConsigneeFiscalID", nillable = true)
    protected String consigneeFiscalID;
    @XmlElement(name = "ConsigneeFiscalIDType", nillable = true)
    protected String consigneeFiscalIDType;
    @XmlElement(name = "ConsigneeFullAddress", nillable = true)
    protected String consigneeFullAddress;
    @XmlElement(name = "ConsigneeGSTNumber", nillable = true)
    protected String consigneeGSTNumber;
    @XmlElement(name = "ConsigneeID", nillable = true)
    protected String consigneeID;
    @XmlElement(name = "ConsigneeIDType", nillable = true)
    protected String consigneeIDType;
    @XmlElement(name = "ConsigneeLatitude", nillable = true)
    protected String consigneeLatitude;
    @XmlElement(name = "ConsigneeLongitude", nillable = true)
    protected String consigneeLongitude;
    @XmlElement(name = "ConsigneeMaskedContactNumber", nillable = true)
    protected String consigneeMaskedContactNumber;
    @XmlElement(name = "ConsigneeMobile", nillable = true)
    protected String consigneeMobile;
    @XmlElement(name = "ConsigneeName", nillable = true)
    protected String consigneeName;
    @XmlElement(name = "ConsigneePincode", nillable = true)
    protected String consigneePincode;
    @XmlElement(name = "ConsigneeStateCode", nillable = true)
    protected String consigneeStateCode;
    @XmlElement(name = "ConsigneeTelephone", nillable = true)
    protected String consigneeTelephone;

    /**
     * Gets the value of the availableDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailableDays() {
        return availableDays;
    }

    /**
     * Sets the value of the availableDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailableDays(String value) {
        this.availableDays = value;
    }

    /**
     * Gets the value of the availableTiming property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailableTiming() {
        return availableTiming;
    }

    /**
     * Sets the value of the availableTiming property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailableTiming(String value) {
        this.availableTiming = value;
    }

    /**
     * Gets the value of the consigneeAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsigneeAddress1() {
        return consigneeAddress1;
    }

    /**
     * Sets the value of the consigneeAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsigneeAddress1(String value) {
        this.consigneeAddress1 = value;
    }

    /**
     * Gets the value of the consigneeAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsigneeAddress2() {
        return consigneeAddress2;
    }

    /**
     * Sets the value of the consigneeAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsigneeAddress2(String value) {
        this.consigneeAddress2 = value;
    }

    /**
     * Gets the value of the consigneeAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsigneeAddress3() {
        return consigneeAddress3;
    }

    /**
     * Sets the value of the consigneeAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsigneeAddress3(String value) {
        this.consigneeAddress3 = value;
    }

    /**
     * Gets the value of the consigneeAddressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsigneeAddressType() {
        return consigneeAddressType;
    }

    /**
     * Sets the value of the consigneeAddressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsigneeAddressType(String value) {
        this.consigneeAddressType = value;
    }

    /**
     * Gets the value of the consigneeAddressinfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsigneeAddressinfo() {
        return consigneeAddressinfo;
    }

    /**
     * Sets the value of the consigneeAddressinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsigneeAddressinfo(String value) {
        this.consigneeAddressinfo = value;
    }

    /**
     * Gets the value of the consigneeAttention property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsigneeAttention() {
        return consigneeAttention;
    }

    /**
     * Sets the value of the consigneeAttention property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsigneeAttention(String value) {
        this.consigneeAttention = value;
    }

    /**
     * Gets the value of the consigneeCityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsigneeCityName() {
        return consigneeCityName;
    }

    /**
     * Sets the value of the consigneeCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsigneeCityName(String value) {
        this.consigneeCityName = value;
    }

    /**
     * Gets the value of the consigneeCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsigneeCountryCode() {
        return consigneeCountryCode;
    }

    /**
     * Sets the value of the consigneeCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsigneeCountryCode(String value) {
        this.consigneeCountryCode = value;
    }

    /**
     * Gets the value of the consigneeEmailID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsigneeEmailID() {
        return consigneeEmailID;
    }

    /**
     * Sets the value of the consigneeEmailID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsigneeEmailID(String value) {
        this.consigneeEmailID = value;
    }

    /**
     * Gets the value of the consigneeFiscalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsigneeFiscalID() {
        return consigneeFiscalID;
    }

    /**
     * Sets the value of the consigneeFiscalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsigneeFiscalID(String value) {
        this.consigneeFiscalID = value;
    }

    /**
     * Gets the value of the consigneeFiscalIDType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsigneeFiscalIDType() {
        return consigneeFiscalIDType;
    }

    /**
     * Sets the value of the consigneeFiscalIDType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsigneeFiscalIDType(String value) {
        this.consigneeFiscalIDType = value;
    }

    /**
     * Gets the value of the consigneeFullAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsigneeFullAddress() {
        return consigneeFullAddress;
    }

    /**
     * Sets the value of the consigneeFullAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsigneeFullAddress(String value) {
        this.consigneeFullAddress = value;
    }

    /**
     * Gets the value of the consigneeGSTNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsigneeGSTNumber() {
        return consigneeGSTNumber;
    }

    /**
     * Sets the value of the consigneeGSTNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsigneeGSTNumber(String value) {
        this.consigneeGSTNumber = value;
    }

    /**
     * Gets the value of the consigneeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsigneeID() {
        return consigneeID;
    }

    /**
     * Sets the value of the consigneeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsigneeID(String value) {
        this.consigneeID = value;
    }

    /**
     * Gets the value of the consigneeIDType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsigneeIDType() {
        return consigneeIDType;
    }

    /**
     * Sets the value of the consigneeIDType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsigneeIDType(String value) {
        this.consigneeIDType = value;
    }

    /**
     * Gets the value of the consigneeLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsigneeLatitude() {
        return consigneeLatitude;
    }

    /**
     * Sets the value of the consigneeLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsigneeLatitude(String value) {
        this.consigneeLatitude = value;
    }

    /**
     * Gets the value of the consigneeLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsigneeLongitude() {
        return consigneeLongitude;
    }

    /**
     * Sets the value of the consigneeLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsigneeLongitude(String value) {
        this.consigneeLongitude = value;
    }

    /**
     * Gets the value of the consigneeMaskedContactNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsigneeMaskedContactNumber() {
        return consigneeMaskedContactNumber;
    }

    /**
     * Sets the value of the consigneeMaskedContactNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsigneeMaskedContactNumber(String value) {
        this.consigneeMaskedContactNumber = value;
    }

    /**
     * Gets the value of the consigneeMobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsigneeMobile() {
        return consigneeMobile;
    }

    /**
     * Sets the value of the consigneeMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsigneeMobile(String value) {
        this.consigneeMobile = value;
    }

    /**
     * Gets the value of the consigneeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsigneeName() {
        return consigneeName;
    }

    /**
     * Sets the value of the consigneeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsigneeName(String value) {
        this.consigneeName = value;
    }

    /**
     * Gets the value of the consigneePincode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsigneePincode() {
        return consigneePincode;
    }

    /**
     * Sets the value of the consigneePincode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsigneePincode(String value) {
        this.consigneePincode = value;
    }

    /**
     * Gets the value of the consigneeStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsigneeStateCode() {
        return consigneeStateCode;
    }

    /**
     * Sets the value of the consigneeStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsigneeStateCode(String value) {
        this.consigneeStateCode = value;
    }

    /**
     * Gets the value of the consigneeTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsigneeTelephone() {
        return consigneeTelephone;
    }

    /**
     * Sets the value of the consigneeTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsigneeTelephone(String value) {
        this.consigneeTelephone = value;
    }

}
