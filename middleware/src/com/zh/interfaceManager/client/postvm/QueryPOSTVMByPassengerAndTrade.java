
package com.zh.interfaceManager.client.postvm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for queryPOSTVMByPassengerAndTrade complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="queryPOSTVMByPassengerAndTrade">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="saleDateFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="saleDataTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tradeNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryPOSTVMByPassengerAndTrade", propOrder = {
    "saleDateFrom",
    "saleDataTo",
    "idType",
    "idNo",
    "tradeNo"
})
public class QueryPOSTVMByPassengerAndTrade {

    protected String saleDateFrom;
    protected String saleDataTo;
    protected String idType;
    protected String idNo;
    protected String tradeNo;

    /**
     * Gets the value of the saleDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleDateFrom() {
        return saleDateFrom;
    }

    /**
     * Sets the value of the saleDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleDateFrom(String value) {
        this.saleDateFrom = value;
    }

    /**
     * Gets the value of the saleDataTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleDataTo() {
        return saleDataTo;
    }

    /**
     * Sets the value of the saleDataTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleDataTo(String value) {
        this.saleDataTo = value;
    }

    /**
     * Gets the value of the idType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdType() {
        return idType;
    }

    /**
     * Sets the value of the idType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdType(String value) {
        this.idType = value;
    }

    /**
     * Gets the value of the idNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNo() {
        return idNo;
    }

    /**
     * Sets the value of the idNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNo(String value) {
        this.idNo = value;
    }

    /**
     * Gets the value of the tradeNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeNo() {
        return tradeNo;
    }

    /**
     * Sets the value of the tradeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeNo(String value) {
        this.tradeNo = value;
    }

}
