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
 *         &lt;element name="defaultHealthMonitor" type="{urn:didata.com:api:cloud:types}DefaultHealthMonitorType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:didata.com:api:cloud:types}PagedResultAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "defaultHealthMonitor"
})
@XmlRootElement(name = "defaultHealthMonitors")
public class DefaultHealthMonitors {

    protected List<DefaultHealthMonitorType> defaultHealthMonitor;
    @XmlAttribute(name = "pageNumber")
    protected Integer pageNumber;
    @XmlAttribute(name = "pageCount")
    protected Integer pageCount;
    @XmlAttribute(name = "totalCount")
    protected Integer totalCount;
    @XmlAttribute(name = "pageSize")
    protected Integer pageSize;

    /**
     * Gets the value of the defaultHealthMonitor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defaultHealthMonitor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefaultHealthMonitor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DefaultHealthMonitorType }
     * 
     * 
     */
    public List<DefaultHealthMonitorType> getDefaultHealthMonitor() {
        if (defaultHealthMonitor == null) {
            defaultHealthMonitor = new ArrayList<DefaultHealthMonitorType>();
        }
        return this.defaultHealthMonitor;
    }

    /**
     * Gets the value of the pageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageNumber(Integer value) {
        this.pageNumber = value;
    }

    /**
     * Gets the value of the pageCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageCount() {
        return pageCount;
    }

    /**
     * Sets the value of the pageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageCount(Integer value) {
        this.pageCount = value;
    }

    /**
     * Gets the value of the totalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * Sets the value of the totalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalCount(Integer value) {
        this.totalCount = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageSize(Integer value) {
        this.pageSize = value;
    }

}
