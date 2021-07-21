//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.26 at 10:41:00 PM IST 
//


package com.GS.BlueDart.stub2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ALTInstructionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ALTInstructionResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AWBNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsError" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://schemas.datacontract.org/2004/07/SAPI.Entities.ALTInstructionUpdate}ArrayOfCustALTInstrucStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ALTInstructionResponse", propOrder = {
    "awbNo",
    "isError",
    "status"
})
public class ALTInstructionResponse {

    @XmlElement(name = "AWBNo", nillable = true)
    protected String awbNo;
    @XmlElement(name = "IsError")
    protected Boolean isError;
    @XmlElement(nillable = true)
    protected ArrayOfCustALTInstrucStatus status;

    /**
     * Gets the value of the awbNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAWBNo() {
        return awbNo;
    }

    /**
     * Sets the value of the awbNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAWBNo(String value) {
        this.awbNo = value;
    }

    /**
     * Gets the value of the isError property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsError() {
        return isError;
    }

    /**
     * Sets the value of the isError property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsError(Boolean value) {
        this.isError = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCustALTInstrucStatus }
     *     
     */
    public ArrayOfCustALTInstrucStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCustALTInstrucStatus }
     *     
     */
    public void setStatus(ArrayOfCustALTInstrucStatus value) {
        this.status = value;
    }

}
