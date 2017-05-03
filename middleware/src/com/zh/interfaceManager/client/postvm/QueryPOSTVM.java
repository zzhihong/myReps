
package com.zh.interfaceManager.client.postvm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for queryPOSTVM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="queryPOSTVM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="saleDateFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="saleDataTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="saleStation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnDateFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnDateTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnStation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="saleMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="queryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tradeNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ticket21info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trainDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trainCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fromStationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="toStationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coachNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seatNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ticketNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="saleOffice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryPOSTVM", propOrder = {
    "saleDateFrom",
    "saleDataTo",
    "saleStation",
    "returnDateFrom",
    "returnDateTo",
    "returnStation",
    "saleMode",
    "queryType",
    "tradeNo",
    "ticket21Info",
    "trainDate",
    "trainCode",
    "fromStationName",
    "toStationName",
    "coachNo",
    "seatNo",
    "ticketNo",
    "saleOffice",
    "idType",
    "idNo"
})
public class QueryPOSTVM {

    protected String saleDateFrom;
    protected String saleDataTo;
    protected String saleStation;
    protected String returnDateFrom;
    protected String returnDateTo;
    protected String returnStation;
    protected String saleMode;
    protected String queryType;
    protected String tradeNo;
    @XmlElement(name = "ticket21info")
    protected String ticket21Info;
    protected String trainDate;
    protected String trainCode;
    protected String fromStationName;
    protected String toStationName;
    protected String coachNo;
    protected String seatNo;
    protected String ticketNo;
    protected String saleOffice;
    protected String idType;
    protected String idNo;

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
     * Gets the value of the saleStation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleStation() {
        return saleStation;
    }

    /**
     * Sets the value of the saleStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleStation(String value) {
        this.saleStation = value;
    }

    /**
     * Gets the value of the returnDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnDateFrom() {
        return returnDateFrom;
    }

    /**
     * Sets the value of the returnDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnDateFrom(String value) {
        this.returnDateFrom = value;
    }

    /**
     * Gets the value of the returnDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnDateTo() {
        return returnDateTo;
    }

    /**
     * Sets the value of the returnDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnDateTo(String value) {
        this.returnDateTo = value;
    }

    /**
     * Gets the value of the returnStation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnStation() {
        return returnStation;
    }

    /**
     * Sets the value of the returnStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnStation(String value) {
        this.returnStation = value;
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
     * Gets the value of the queryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryType() {
        return queryType;
    }

    /**
     * Sets the value of the queryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryType(String value) {
        this.queryType = value;
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

    /**
     * Gets the value of the ticket21Info property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicket21Info() {
        return ticket21Info;
    }

    /**
     * Sets the value of the ticket21Info property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicket21Info(String value) {
        this.ticket21Info = value;
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

    /**
     * Gets the value of the trainCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainCode() {
        return trainCode;
    }

    /**
     * Sets the value of the trainCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainCode(String value) {
        this.trainCode = value;
    }

    /**
     * Gets the value of the fromStationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromStationName() {
        return fromStationName;
    }

    /**
     * Sets the value of the fromStationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromStationName(String value) {
        this.fromStationName = value;
    }

    /**
     * Gets the value of the toStationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToStationName() {
        return toStationName;
    }

    /**
     * Sets the value of the toStationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToStationName(String value) {
        this.toStationName = value;
    }

    /**
     * Gets the value of the coachNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoachNo() {
        return coachNo;
    }

    /**
     * Sets the value of the coachNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoachNo(String value) {
        this.coachNo = value;
    }

    /**
     * Gets the value of the seatNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatNo() {
        return seatNo;
    }

    /**
     * Sets the value of the seatNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatNo(String value) {
        this.seatNo = value;
    }

    /**
     * Gets the value of the ticketNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketNo() {
        return ticketNo;
    }

    /**
     * Sets the value of the ticketNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketNo(String value) {
        this.ticketNo = value;
    }

    /**
     * Gets the value of the saleOffice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleOffice() {
        return saleOffice;
    }

    /**
     * Sets the value of the saleOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleOffice(String value) {
        this.saleOffice = value;
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

}
