//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.18 at 05:54:38 PM GMT 
//


package com.dimensiondata.cloud.client.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DefaultIruleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DefaultIruleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="irule" type="{urn:didata.com:api:cloud:types}IdAndNameType"/&gt;
 *         &lt;element name="virtualListenerCompatibility" type="{urn:didata.com:api:cloud:types}VirtualListenerCompatibilityType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefaultIruleType", propOrder = {
    "irule",
    "virtualListenerCompatibility"
})
public class DefaultIruleType {

    @XmlElement(required = true)
    protected IdAndNameType irule;
    protected List<VirtualListenerCompatibilityType> virtualListenerCompatibility;

    /**
     * Gets the value of the irule property.
     * 
     * @return
     *     possible object is
     *     {@link IdAndNameType }
     *     
     */
    public IdAndNameType getIrule() {
        return irule;
    }

    /**
     * Sets the value of the irule property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdAndNameType }
     *     
     */
    public void setIrule(IdAndNameType value) {
        this.irule = value;
    }

    /**
     * Gets the value of the virtualListenerCompatibility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the virtualListenerCompatibility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVirtualListenerCompatibility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualListenerCompatibilityType }
     * 
     * 
     */
    public List<VirtualListenerCompatibilityType> getVirtualListenerCompatibility() {
        if (virtualListenerCompatibility == null) {
            virtualListenerCompatibility = new ArrayList<VirtualListenerCompatibilityType>();
        }
        return this.virtualListenerCompatibility;
    }

}