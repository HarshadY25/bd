//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.24 at 05:52:48 PM IST 
//


package com.GS.BlueDart.stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfWayBillGenerationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWayBillGenerationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WayBillGenerationResponse" type="{http://schemas.datacontract.org/2004/07/SAPI.Entities.WayBillGeneration}WayBillGenerationResponse" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWayBillGenerationResponse", propOrder = {
    "wayBillGenerationResponse"
})
public class ArrayOfWayBillGenerationResponse {

    @XmlElement(name = "WayBillGenerationResponse", nillable = true)
    protected List<WayBillGenerationResponse> wayBillGenerationResponse;

    /**
     * Gets the value of the wayBillGenerationResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wayBillGenerationResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWayBillGenerationResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WayBillGenerationResponse }
     * 
     * 
     */
    public List<WayBillGenerationResponse> getWayBillGenerationResponse() {
        if (wayBillGenerationResponse == null) {
            wayBillGenerationResponse = new ArrayList<WayBillGenerationResponse>();
        }
        return this.wayBillGenerationResponse;
    }

}