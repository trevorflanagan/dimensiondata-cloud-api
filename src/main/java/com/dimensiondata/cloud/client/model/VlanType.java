//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.18 at 05:54:38 PM GMT 
//


package com.dimensiondata.cloud.client.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for VlanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VlanType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="networkDomain"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="privateIpv4Range" type="{urn:didata.com:api:cloud:types}IpRangeCidrType"/&gt;
 *         &lt;element name="ipv4GatewayAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ipv6Range" type="{urn:didata.com:api:cloud:types}IpRangeCidrType"/&gt;
 *         &lt;element name="ipv6GatewayAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="progress" type="{urn:didata.com:api:cloud:types}ProgressType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="datacenterId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VlanType", propOrder = {
    "networkDomain",
    "name",
    "description",
    "privateIpv4Range",
    "ipv4GatewayAddress",
    "ipv6Range",
    "ipv6GatewayAddress",
    "createTime",
    "state",
    "progress"
})
public class VlanType {

    @XmlElement(required = true)
    protected VlanType.NetworkDomain networkDomain;
    @XmlElement(required = true)
    protected String name;
    protected String description;
    @XmlElement(required = true)
    protected IpRangeCidrType privateIpv4Range;
    @XmlElement(required = true)
    protected String ipv4GatewayAddress;
    @XmlElement(required = true)
    protected IpRangeCidrType ipv6Range;
    @XmlElement(required = true)
    protected String ipv6GatewayAddress;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createTime;
    @XmlElement(required = true)
    protected String state;
    protected ProgressType progress;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "datacenterId", required = true)
    protected String datacenterId;

    /**
     * Gets the value of the networkDomain property.
     * 
     * @return
     *     possible object is
     *     {@link VlanType.NetworkDomain }
     *     
     */
    public VlanType.NetworkDomain getNetworkDomain() {
        return networkDomain;
    }

    /**
     * Sets the value of the networkDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link VlanType.NetworkDomain }
     *     
     */
    public void setNetworkDomain(VlanType.NetworkDomain value) {
        this.networkDomain = value;
    }

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the privateIpv4Range property.
     * 
     * @return
     *     possible object is
     *     {@link IpRangeCidrType }
     *     
     */
    public IpRangeCidrType getPrivateIpv4Range() {
        return privateIpv4Range;
    }

    /**
     * Sets the value of the privateIpv4Range property.
     * 
     * @param value
     *     allowed object is
     *     {@link IpRangeCidrType }
     *     
     */
    public void setPrivateIpv4Range(IpRangeCidrType value) {
        this.privateIpv4Range = value;
    }

    /**
     * Gets the value of the ipv4GatewayAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpv4GatewayAddress() {
        return ipv4GatewayAddress;
    }

    /**
     * Sets the value of the ipv4GatewayAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpv4GatewayAddress(String value) {
        this.ipv4GatewayAddress = value;
    }

    /**
     * Gets the value of the ipv6Range property.
     * 
     * @return
     *     possible object is
     *     {@link IpRangeCidrType }
     *     
     */
    public IpRangeCidrType getIpv6Range() {
        return ipv6Range;
    }

    /**
     * Sets the value of the ipv6Range property.
     * 
     * @param value
     *     allowed object is
     *     {@link IpRangeCidrType }
     *     
     */
    public void setIpv6Range(IpRangeCidrType value) {
        this.ipv6Range = value;
    }

    /**
     * Gets the value of the ipv6GatewayAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpv6GatewayAddress() {
        return ipv6GatewayAddress;
    }

    /**
     * Sets the value of the ipv6GatewayAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpv6GatewayAddress(String value) {
        this.ipv6GatewayAddress = value;
    }

    /**
     * Gets the value of the createTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateTime() {
        return createTime;
    }

    /**
     * Sets the value of the createTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateTime(XMLGregorianCalendar value) {
        this.createTime = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the progress property.
     * 
     * @return
     *     possible object is
     *     {@link ProgressType }
     *     
     */
    public ProgressType getProgress() {
        return progress;
    }

    /**
     * Sets the value of the progress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgressType }
     *     
     */
    public void setProgress(ProgressType value) {
        this.progress = value;
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
     * Gets the value of the datacenterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatacenterId() {
        return datacenterId;
    }

    /**
     * Sets the value of the datacenterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatacenterId(String value) {
        this.datacenterId = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NetworkDomain {

        @XmlAttribute(name = "id", required = true)
        protected String id;
        @XmlAttribute(name = "name", required = true)
        protected String name;

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

    }

}
