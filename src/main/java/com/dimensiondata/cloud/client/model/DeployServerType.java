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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeployServerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeployServerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imageId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="administratorPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="network"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;choice&gt;
 *                     &lt;element name="networkId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                     &lt;element name="privateIpv4" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;/choice&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="networkInfo"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="primaryNic" type="{urn:didata.com:api:cloud:types}VlanIdOrPrivateIpType"/&gt;
 *                     &lt;element name="additionalNic" type="{urn:didata.com:api:cloud:types}VlanIdOrPrivateIpType" maxOccurs="9" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;attribute name="networkDomainId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="disk" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="scsiId" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" /&gt;
 *                 &lt;attribute name="speed" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeployServerType", propOrder = {
    "name",
    "description",
    "imageId",
    "start",
    "administratorPassword",
    "network",
    "networkInfo",
    "disk"
})
public class DeployServerType {

    @XmlElement(required = true)
    protected String name;
    protected String description;
    @XmlElement(required = true)
    protected String imageId;
    protected boolean start;
    protected String administratorPassword;
    protected DeployServerType.Network network;
    protected DeployServerType.NetworkInfo networkInfo;
    protected List<DeployServerType.Disk> disk;

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
     * Gets the value of the imageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * Sets the value of the imageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageId(String value) {
        this.imageId = value;
    }

    /**
     * Gets the value of the start property.
     * 
     */
    public boolean isStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     */
    public void setStart(boolean value) {
        this.start = value;
    }

    /**
     * Gets the value of the administratorPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministratorPassword() {
        return administratorPassword;
    }

    /**
     * Sets the value of the administratorPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministratorPassword(String value) {
        this.administratorPassword = value;
    }

    /**
     * Gets the value of the network property.
     * 
     * @return
     *     possible object is
     *     {@link DeployServerType.Network }
     *     
     */
    public DeployServerType.Network getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeployServerType.Network }
     *     
     */
    public void setNetwork(DeployServerType.Network value) {
        this.network = value;
    }

    /**
     * Gets the value of the networkInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DeployServerType.NetworkInfo }
     *     
     */
    public DeployServerType.NetworkInfo getNetworkInfo() {
        return networkInfo;
    }

    /**
     * Sets the value of the networkInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeployServerType.NetworkInfo }
     *     
     */
    public void setNetworkInfo(DeployServerType.NetworkInfo value) {
        this.networkInfo = value;
    }

    /**
     * Gets the value of the disk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeployServerType.Disk }
     * 
     * 
     */
    public List<DeployServerType.Disk> getDisk() {
        if (disk == null) {
            disk = new ArrayList<DeployServerType.Disk>();
        }
        return this.disk;
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
     *       &lt;attribute name="scsiId" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" /&gt;
     *       &lt;attribute name="speed" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Disk {

        @XmlAttribute(name = "scsiId", required = true)
        @XmlSchemaType(name = "unsignedShort")
        protected int scsiId;
        @XmlAttribute(name = "speed", required = true)
        protected String speed;

        /**
         * Gets the value of the scsiId property.
         * 
         */
        public int getScsiId() {
            return scsiId;
        }

        /**
         * Sets the value of the scsiId property.
         * 
         */
        public void setScsiId(int value) {
            this.scsiId = value;
        }

        /**
         * Gets the value of the speed property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSpeed() {
            return speed;
        }

        /**
         * Sets the value of the speed property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSpeed(String value) {
            this.speed = value;
        }

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
     *       &lt;choice&gt;
     *         &lt;element name="networkId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="privateIpv4" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "networkId",
        "privateIpv4"
    })
    public static class Network {

        protected String networkId;
        protected String privateIpv4;

        /**
         * Gets the value of the networkId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNetworkId() {
            return networkId;
        }

        /**
         * Sets the value of the networkId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNetworkId(String value) {
            this.networkId = value;
        }

        /**
         * Gets the value of the privateIpv4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrivateIpv4() {
            return privateIpv4;
        }

        /**
         * Sets the value of the privateIpv4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrivateIpv4(String value) {
            this.privateIpv4 = value;
        }

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
     *       &lt;sequence&gt;
     *         &lt;element name="primaryNic" type="{urn:didata.com:api:cloud:types}VlanIdOrPrivateIpType"/&gt;
     *         &lt;element name="additionalNic" type="{urn:didata.com:api:cloud:types}VlanIdOrPrivateIpType" maxOccurs="9" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="networkDomainId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "primaryNic",
        "additionalNic"
    })
    public static class NetworkInfo {

        @XmlElement(required = true)
        protected VlanIdOrPrivateIpType primaryNic;
        protected List<VlanIdOrPrivateIpType> additionalNic;
        @XmlAttribute(name = "networkDomainId", required = true)
        protected String networkDomainId;

        /**
         * Gets the value of the primaryNic property.
         * 
         * @return
         *     possible object is
         *     {@link VlanIdOrPrivateIpType }
         *     
         */
        public VlanIdOrPrivateIpType getPrimaryNic() {
            return primaryNic;
        }

        /**
         * Sets the value of the primaryNic property.
         * 
         * @param value
         *     allowed object is
         *     {@link VlanIdOrPrivateIpType }
         *     
         */
        public void setPrimaryNic(VlanIdOrPrivateIpType value) {
            this.primaryNic = value;
        }

        /**
         * Gets the value of the additionalNic property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the additionalNic property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAdditionalNic().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VlanIdOrPrivateIpType }
         * 
         * 
         */
        public List<VlanIdOrPrivateIpType> getAdditionalNic() {
            if (additionalNic == null) {
                additionalNic = new ArrayList<VlanIdOrPrivateIpType>();
            }
            return this.additionalNic;
        }

        /**
         * Gets the value of the networkDomainId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNetworkDomainId() {
            return networkDomainId;
        }

        /**
         * Sets the value of the networkDomainId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNetworkDomainId(String value) {
            this.networkDomainId = value;
        }

    }

}
