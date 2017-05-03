
package com.zh.interfaceManager.client.dpdd;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ictOrderInfoByUserRQ2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ictOrderInfoByUserRQ2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="passengerIDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passengerIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="platSequenceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserveTimeFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserveTimeTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserverIDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserverIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="saleMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sequenceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trainDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ictOrderInfoByUserRQ2", propOrder = {
    "passengerIDType",
    "passengerIdNo",
    "platSequenceNo",
    "reserveTimeFrom",
    "reserveTimeTo",
    "reserverIDType",
    "reserverIdNo",
    "saleMode",
    "sequenceNo",
    "trainDate"
})
public class IctOrderInfoByUserRQ2 implements Serializable{

	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "IctOrderInfoByUserRQ2 [passengerIDType=" + passengerIDType
				+ ", passengerIdNo=" + passengerIdNo + ", platSequenceNo="
				+ platSequenceNo + ", reserveTimeFrom=" + reserveTimeFrom
				+ ", reserveTimeTo=" + reserveTimeTo + ", reserverIDType="
				+ reserverIDType + ", reserverIdNo=" + reserverIdNo
				+ ", saleMode=" + saleMode + ", sequenceNo=" + sequenceNo
				+ ", trainDate=" + trainDate + "]";
	}

	protected String passengerIDType;
    protected String passengerIdNo;
    protected String platSequenceNo;
    protected String reserveTimeFrom;
    protected String reserveTimeTo;
    protected String reserverIDType;
    protected String reserverIdNo;
    protected String saleMode;
    protected String sequenceNo;
    protected String trainDate;

    /**
     * Gets the value of the passengerIDType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerIDType() {
        return passengerIDType;
    }

    /**
     * Sets the value of the passengerIDType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerIDType(String value) {
        this.passengerIDType = value;
    }

    /**
     * Gets the value of the passengerIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerIdNo() {
        return passengerIdNo;
    }

    /**
     * Sets the value of the passengerIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerIdNo(String value) {
        this.passengerIdNo = value;
    }

    /**
     * Gets the value of the platSequenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatSequenceNo() {
        return platSequenceNo;
    }

    /**
     * Sets the value of the platSequenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatSequenceNo(String value) {
        this.platSequenceNo = value;
    }

    /**
     * Gets the value of the reserveTimeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserveTimeFrom() {
        return reserveTimeFrom;
    }

    /**
     * Sets the value of the reserveTimeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserveTimeFrom(String value) {
        this.reserveTimeFrom = value;
    }

    /**
     * Gets the value of the reserveTimeTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserveTimeTo() {
        return reserveTimeTo;
    }

    /**
     * Sets the value of the reserveTimeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserveTimeTo(String value) {
        this.reserveTimeTo = value;
    }

    /**
     * Gets the value of the reserverIDType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserverIDType() {
        return reserverIDType;
    }

    /**
     * Sets the value of the reserverIDType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserverIDType(String value) {
        this.reserverIDType = value;
    }

    /**
     * Gets the value of the reserverIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserverIdNo() {
        return reserverIdNo;
    }

    /**
     * Sets the value of the reserverIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserverIdNo(String value) {
        this.reserverIdNo = value;
    }

    /**
     * Gets the value of the saleMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleMode() {
        return saleMode;
    }

    /**
     * Sets the value of the saleMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleMode(String value) {
        this.saleMode = value;
    }

    /**
     * Gets the value of the sequenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceNo() {
        return sequenceNo;
    }

    /**
     * Sets the value of the sequenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceNo(String value) {
        this.sequenceNo = value;
    }

    /**
     * Gets the value of the trainDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainDate() {
        return trainDate;
    }

    /**
     * Sets the value of the trainDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainDate(String value) {
        this.trainDate = value;
    }

}
