
package com.zh.interfaceManager.client.dpdd;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ticketBO2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ticketBO2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="batch_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coachNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fetchStationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fetchTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fetchWindow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fetchWindowOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fromStationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="from_tele_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passengerIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passengerIdType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passengerIdTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passengerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passenger_id_no_str" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="print_center" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="print_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seatNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seatTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="theline_resign_coach_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="theline_resign_seat_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="theline_resign_station_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="theline_resign_ticket_price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="theline_resign_ticket_status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="theline_resign_time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="theline_resign_train_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="theline_resign_train_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="theline_resign_window" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="theline_resign_window_owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="theline_return_station_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="theline_return_ticket_status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="theline_return_time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="theline_return_window" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="theline_return_window_owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ticketNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ticketPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ticketStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ticketTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="toStationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="to_tele_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trainCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ticketBO2", propOrder = {
    "batchNo",
    "coachNo",
    "fetchStationName",
    "fetchTime",
    "fetchWindow",
    "fetchWindowOwner",
    "fromStationName",
    "fromTeleCode",
    "passengerIdNo",
    "passengerIdType",
    "passengerIdTypeName",
    "passengerName",
    "passengerIdNoStr",
    "printCenter",
    "printDate",
    "seatNo",
    "seatTypeName",
    "startTime",
    "statusCode",
    "thelineResignCoachNo",
    "thelineResignSeatNo",
    "thelineResignStationName",
    "thelineResignTicketPrice",
    "thelineResignTicketStatus",
    "thelineResignTime",
    "thelineResignTrainCode",
    "thelineResignTrainDate",
    "thelineResignWindow",
    "thelineResignWindowOwner",
    "thelineReturnStationName",
    "thelineReturnTicketStatus",
    "thelineReturnTime",
    "thelineReturnWindow",
    "thelineReturnWindowOwner",
    "ticketNo",
    "ticketPrice",
    "ticketStatus",
    "ticketTypeName",
    "toStationName",
    "toTeleCode",
    "trainCode",
    "trainDate"
})
public class TicketBO2 implements Serializable{

	@Override
	public String toString() {
		return "TicketBO2 [batchNo=" + batchNo + ", coachNo=" + coachNo
				+ ", fetchStationName=" + fetchStationName + ", fetchTime="
				+ fetchTime + ", fetchWindow=" + fetchWindow
				+ ", fetchWindowOwner=" + fetchWindowOwner
				+ ", fromStationName=" + fromStationName + ", fromTeleCode="
				+ fromTeleCode + ", passengerIdNo=" + passengerIdNo
				+ ", passengerIdType=" + passengerIdType
				+ ", passengerIdTypeName=" + passengerIdTypeName
				+ ", passengerName=" + passengerName + ", passengerIdNoStr="
				+ passengerIdNoStr + ", printCenter=" + printCenter
				+ ", printDate=" + printDate + ", seatNo=" + seatNo
				+ ", seatTypeName=" + seatTypeName + ", startTime=" + startTime
				+ ", statusCode=" + statusCode + ", thelineResignCoachNo="
				+ thelineResignCoachNo + ", thelineResignSeatNo="
				+ thelineResignSeatNo + ", thelineResignStationName="
				+ thelineResignStationName + ", thelineResignTicketPrice="
				+ thelineResignTicketPrice + ", thelineResignTicketStatus="
				+ thelineResignTicketStatus + ", thelineResignTime="
				+ thelineResignTime + ", thelineResignTrainCode="
				+ thelineResignTrainCode + ", thelineResignTrainDate="
				+ thelineResignTrainDate + ", thelineResignWindow="
				+ thelineResignWindow + ", thelineResignWindowOwner="
				+ thelineResignWindowOwner + ", thelineReturnStationName="
				+ thelineReturnStationName + ", thelineReturnTicketStatus="
				+ thelineReturnTicketStatus + ", thelineReturnTime="
				+ thelineReturnTime + ", thelineReturnWindow="
				+ thelineReturnWindow + ", thelineReturnWindowOwner="
				+ thelineReturnWindowOwner + ", ticketNo=" + ticketNo
				+ ", ticketPrice=" + ticketPrice + ", ticketStatus="
				+ ticketStatus + ", ticketTypeName=" + ticketTypeName
				+ ", toStationName=" + toStationName + ", toTeleCode="
				+ toTeleCode + ", trainCode=" + trainCode + ", trainDate="
				+ trainDate + "]";
	}

	private static final long serialVersionUID = 1L;
	@XmlElement(name = "batch_no")
    protected String batchNo;
    protected String coachNo;
    protected String fetchStationName;
    protected String fetchTime;
    protected String fetchWindow;
    protected String fetchWindowOwner;
    protected String fromStationName;
    @XmlElement(name = "from_tele_code")
    protected String fromTeleCode;
    protected String passengerIdNo;
    protected String passengerIdType;
    protected String passengerIdTypeName;
    protected String passengerName;
    @XmlElement(name = "passenger_id_no_str")
    protected String passengerIdNoStr;
    @XmlElement(name = "print_center")
    protected String printCenter;
    @XmlElement(name = "print_date")
    protected String printDate;
    protected String seatNo;
    protected String seatTypeName;
    protected String startTime;
    protected String statusCode;
    @XmlElement(name = "theline_resign_coach_no")
    protected String thelineResignCoachNo;
    @XmlElement(name = "theline_resign_seat_no")
    protected String thelineResignSeatNo;
    @XmlElement(name = "theline_resign_station_name")
    protected String thelineResignStationName;
    @XmlElement(name = "theline_resign_ticket_price")
    protected String thelineResignTicketPrice;
    @XmlElement(name = "theline_resign_ticket_status")
    protected String thelineResignTicketStatus;
    @XmlElement(name = "theline_resign_time")
    protected String thelineResignTime;
    @XmlElement(name = "theline_resign_train_code")
    protected String thelineResignTrainCode;
    @XmlElement(name = "theline_resign_train_date")
    protected String thelineResignTrainDate;
    @XmlElement(name = "theline_resign_window")
    protected String thelineResignWindow;
    @XmlElement(name = "theline_resign_window_owner")
    protected String thelineResignWindowOwner;
    @XmlElement(name = "theline_return_station_name")
    protected String thelineReturnStationName;
    @XmlElement(name = "theline_return_ticket_status")
    protected String thelineReturnTicketStatus;
    @XmlElement(name = "theline_return_time")
    protected String thelineReturnTime;
    @XmlElement(name = "theline_return_window")
    protected String thelineReturnWindow;
    @XmlElement(name = "theline_return_window_owner")
    protected String thelineReturnWindowOwner;
    protected String ticketNo;
    protected String ticketPrice;
    protected String ticketStatus;
    protected String ticketTypeName;
    protected String toStationName;
    @XmlElement(name = "to_tele_code")
    protected String toTeleCode;
    protected String trainCode;
    protected String trainDate;

    /**
     * Gets the value of the batchNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchNo() {
        return batchNo;
    }

    /**
     * Sets the value of the batchNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchNo(String value) {
        this.batchNo = value;
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
     * Gets the value of the fetchStationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFetchStationName() {
        return fetchStationName;
    }

    /**
     * Sets the value of the fetchStationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFetchStationName(String value) {
        this.fetchStationName = value;
    }

    /**
     * Gets the value of the fetchTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFetchTime() {
        return fetchTime;
    }

    /**
     * Sets the value of the fetchTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFetchTime(String value) {
        this.fetchTime = value;
    }

    /**
     * Gets the value of the fetchWindow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFetchWindow() {
        return fetchWindow;
    }

    /**
     * Sets the value of the fetchWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFetchWindow(String value) {
        this.fetchWindow = value;
    }

    /**
     * Gets the value of the fetchWindowOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFetchWindowOwner() {
        return fetchWindowOwner;
    }

    /**
     * Sets the value of the fetchWindowOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFetchWindowOwner(String value) {
        this.fetchWindowOwner = value;
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
     * Gets the value of the fromTeleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromTeleCode() {
        return fromTeleCode;
    }

    /**
     * Sets the value of the fromTeleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromTeleCode(String value) {
        this.fromTeleCode = value;
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
     * Gets the value of the passengerIdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerIdType() {
        return passengerIdType;
    }

    /**
     * Sets the value of the passengerIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerIdType(String value) {
        this.passengerIdType = value;
    }

    /**
     * Gets the value of the passengerIdTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerIdTypeName() {
        return passengerIdTypeName;
    }

    /**
     * Sets the value of the passengerIdTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerIdTypeName(String value) {
        this.passengerIdTypeName = value;
    }

    /**
     * Gets the value of the passengerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerName() {
        return passengerName;
    }

    /**
     * Sets the value of the passengerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerName(String value) {
        this.passengerName = value;
    }

    /**
     * Gets the value of the passengerIdNoStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerIdNoStr() {
        return passengerIdNoStr;
    }

    /**
     * Sets the value of the passengerIdNoStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerIdNoStr(String value) {
        this.passengerIdNoStr = value;
    }

    /**
     * Gets the value of the printCenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintCenter() {
        return printCenter;
    }

    /**
     * Sets the value of the printCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintCenter(String value) {
        this.printCenter = value;
    }

    /**
     * Gets the value of the printDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintDate() {
        return printDate;
    }

    /**
     * Sets the value of the printDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintDate(String value) {
        this.printDate = value;
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
     * Gets the value of the seatTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatTypeName() {
        return seatTypeName;
    }

    /**
     * Sets the value of the seatTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatTypeName(String value) {
        this.seatTypeName = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(String value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the thelineResignCoachNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThelineResignCoachNo() {
        return thelineResignCoachNo;
    }

    /**
     * Sets the value of the thelineResignCoachNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThelineResignCoachNo(String value) {
        this.thelineResignCoachNo = value;
    }

    /**
     * Gets the value of the thelineResignSeatNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThelineResignSeatNo() {
        return thelineResignSeatNo;
    }

    /**
     * Sets the value of the thelineResignSeatNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThelineResignSeatNo(String value) {
        this.thelineResignSeatNo = value;
    }

    /**
     * Gets the value of the thelineResignStationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThelineResignStationName() {
        return thelineResignStationName;
    }

    /**
     * Sets the value of the thelineResignStationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThelineResignStationName(String value) {
        this.thelineResignStationName = value;
    }

    /**
     * Gets the value of the thelineResignTicketPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThelineResignTicketPrice() {
        return thelineResignTicketPrice;
    }

    /**
     * Sets the value of the thelineResignTicketPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThelineResignTicketPrice(String value) {
        this.thelineResignTicketPrice = value;
    }

    /**
     * Gets the value of the thelineResignTicketStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThelineResignTicketStatus() {
        return thelineResignTicketStatus;
    }

    /**
     * Sets the value of the thelineResignTicketStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThelineResignTicketStatus(String value) {
        this.thelineResignTicketStatus = value;
    }

    /**
     * Gets the value of the thelineResignTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThelineResignTime() {
        return thelineResignTime;
    }

    /**
     * Sets the value of the thelineResignTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThelineResignTime(String value) {
        this.thelineResignTime = value;
    }

    /**
     * Gets the value of the thelineResignTrainCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThelineResignTrainCode() {
        return thelineResignTrainCode;
    }

    /**
     * Sets the value of the thelineResignTrainCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThelineResignTrainCode(String value) {
        this.thelineResignTrainCode = value;
    }

    /**
     * Gets the value of the thelineResignTrainDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThelineResignTrainDate() {
        return thelineResignTrainDate;
    }

    /**
     * Sets the value of the thelineResignTrainDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThelineResignTrainDate(String value) {
        this.thelineResignTrainDate = value;
    }

    /**
     * Gets the value of the thelineResignWindow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThelineResignWindow() {
        return thelineResignWindow;
    }

    /**
     * Sets the value of the thelineResignWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThelineResignWindow(String value) {
        this.thelineResignWindow = value;
    }

    /**
     * Gets the value of the thelineResignWindowOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThelineResignWindowOwner() {
        return thelineResignWindowOwner;
    }

    /**
     * Sets the value of the thelineResignWindowOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThelineResignWindowOwner(String value) {
        this.thelineResignWindowOwner = value;
    }

    /**
     * Gets the value of the thelineReturnStationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThelineReturnStationName() {
        return thelineReturnStationName;
    }

    /**
     * Sets the value of the thelineReturnStationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThelineReturnStationName(String value) {
        this.thelineReturnStationName = value;
    }

    /**
     * Gets the value of the thelineReturnTicketStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThelineReturnTicketStatus() {
        return thelineReturnTicketStatus;
    }

    /**
     * Sets the value of the thelineReturnTicketStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThelineReturnTicketStatus(String value) {
        this.thelineReturnTicketStatus = value;
    }

    /**
     * Gets the value of the thelineReturnTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThelineReturnTime() {
        return thelineReturnTime;
    }

    /**
     * Sets the value of the thelineReturnTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThelineReturnTime(String value) {
        this.thelineReturnTime = value;
    }

    /**
     * Gets the value of the thelineReturnWindow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThelineReturnWindow() {
        return thelineReturnWindow;
    }

    /**
     * Sets the value of the thelineReturnWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThelineReturnWindow(String value) {
        this.thelineReturnWindow = value;
    }

    /**
     * Gets the value of the thelineReturnWindowOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThelineReturnWindowOwner() {
        return thelineReturnWindowOwner;
    }

    /**
     * Sets the value of the thelineReturnWindowOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThelineReturnWindowOwner(String value) {
        this.thelineReturnWindowOwner = value;
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
     * Gets the value of the ticketPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketPrice() {
        return ticketPrice;
    }

    /**
     * Sets the value of the ticketPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketPrice(String value) {
        this.ticketPrice = value;
    }

    /**
     * Gets the value of the ticketStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketStatus() {
        return ticketStatus;
    }

    /**
     * Sets the value of the ticketStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketStatus(String value) {
        this.ticketStatus = value;
    }

    /**
     * Gets the value of the ticketTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketTypeName() {
        return ticketTypeName;
    }

    /**
     * Sets the value of the ticketTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketTypeName(String value) {
        this.ticketTypeName = value;
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
     * Gets the value of the toTeleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToTeleCode() {
        return toTeleCode;
    }

    /**
     * Sets the value of the toTeleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToTeleCode(String value) {
        this.toTeleCode = value;
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
