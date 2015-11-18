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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DefaultPersistenceProfileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DefaultPersistenceProfileType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="virtualListenerCompatibility" type="{urn:didata.com:api:cloud:types}VirtualListenerCompatibilityType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="fallbackCompatible" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefaultPersistenceProfileType", propOrder = {
    "name",
    "virtualListenerCompatibility"
})
public class DefaultPersistenceProfileType {

    @XmlElement(required = true)
    protected String name;
    protected List<VirtualListenerCompatibilityType> virtualListenerCompatibility;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "fallbackCompatible", required = true)
    protected boolean fallbackCompatible;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the fallbackCompatible property.
     * 
     */
    public boolean isFallbackCompatible() {
        return fallbackCompatible;
    }

    /**
     * Sets the value of the fallbackCompatible property.
     * 
     */
    public void setFallbackCompatible(boolean value) {
        this.fallbackCompatible = value;
    }

}
