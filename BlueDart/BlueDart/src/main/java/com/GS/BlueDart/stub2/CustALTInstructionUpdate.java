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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="altreq" type="{http://schemas.datacontract.org/2004/07/SAPI.Entities.ALTInstructionUpdate}ALTInstructionRequest" minOccurs="0"/&gt;
 *         &lt;element name="profile" type="{http://schemas.datacontract.org/2004/07/SAPI.Entities.Admin}UserProfile" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "altreq",
    "profile"
})
@XmlRootElement(name = "CustALTInstructionUpdate", namespace = "http://tempuri.org/")
public class CustALTInstructionUpdate {

    @XmlElement(namespace = "http://tempuri.org/", nillable = true)
    protected ALTInstructionRequest altreq;
    @XmlElement(namespace = "http://tempuri.org/", nillable = true)
    protected UserProfile profile;

    /**
     * Gets the value of the altreq property.
     * 
     * @return
     *     possible object is
     *     {@link ALTInstructionRequest }
     *     
     */
    public ALTInstructionRequest getAltreq() {
        return altreq;
    }

    /**
     * Sets the value of the altreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ALTInstructionRequest }
     *     
     */
    public void setAltreq(ALTInstructionRequest value) {
        this.altreq = value;
    }

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link UserProfile }
     *     
     */
    public UserProfile getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserProfile }
     *     
     */
    public void setProfile(UserProfile value) {
        this.profile = value;
    }

}
