
package com.zh.interfaceManager.client.realname;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for specialTicketLimit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="specialTicketLimit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="batch_no" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="board_train_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="check_flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coach_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="control_flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="create_time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flag1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flag2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flag3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flag4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flag5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flag6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="from_station_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="from_telecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="login_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobile_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="online_resign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="online_return" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="online_sale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operation_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passenger_id_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passenger_id_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passenger_id_type_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passenger_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prompt_msg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserve_start_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserve_stop_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserve_time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserver_id_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserver_id_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserver_id_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seat_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seat_type_codes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sequence_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="start_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="start_time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="start_train_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stop_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stop_train_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ticket_price" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ticket_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="to_station_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="to_telecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="train_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="train_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="update_time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="use_flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="win_print" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="win_resign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="win_return" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="win_sale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "specialTicketLimit", propOrder = {
    "batchNo",
    "boardTrainCode",
    "checkFlag",
    "coachNo",
    "controlFlag",
    "createTime",
    "email",
    "flag1",
    "flag2",
    "flag3",
    "flag4",
    "flag5",
    "flag6",
    "fromStationName",
    "fromTelecode",
    "loginName",
    "mobileNo",
    "onlineResign",
    "onlineReturn",
    "onlineSale",
    "operationType",
    "origin",
    "passengerIdNo",
    "passengerIdType",
    "passengerIdTypeName",
    "passengerName",
    "promptMsg",
    "reserveStartDate",
    "reserveStopDate",
    "reserveTime",
    "reserverIdName",
    "reserverIdNo",
    "reserverIdType",
    "seatNo",
    "seatTypeCodes",
    "sequenceNo",
    "startDate",
    "startTime",
    "startTrainDate",
    "stopDate",
    "stopTrainDate",
    "ticketPrice",
    "ticketType",
    "toStationName",
    "toTelecode",
    "trainDate",
    "trainNo",
    "updateTime",
    "useFlag",
    "winPrint",
    "winResign",
    "winReturn",
    "winSale"
})
public class SpecialTicketLimit  implements Serializable{

    @XmlElement(name = "batch_no")
    protected int batchNo;
    @XmlElement(name = "board_train_code")
    protected String boardTrainCode;
    @XmlElement(name = "check_flag")
    protected String checkFlag;
    @XmlElement(name = "coach_no")
    protected String coachNo;
    @XmlElement(name = "control_flag")
    protected String controlFlag;
    @XmlElement(name = "create_time")
    protected String createTime;
    protected String email;
    protected String flag1;
    protected String flag2;
    protected String flag3;
    protected String flag4;
    protected String flag5;
    protected String flag6;
    @XmlElement(name = "from_station_name")
    protected String fromStationName;
    @XmlElement(name = "from_telecode")
    protected String fromTelecode;
    @XmlElement(name = "login_name")
    protected String loginName;
    @XmlElement(name = "mobile_no")
    protected String mobileNo;
    @XmlElement(name = "online_resign")
    protected String onlineResign;
    @XmlElement(name = "online_return")
    protected String onlineReturn;
    @XmlElement(name = "online_sale")
    protected String onlineSale;
    @XmlElement(name = "operation_type")
    protected String operationType;
    protected String origin;
    @XmlElement(name = "passenger_id_no")
    protected String passengerIdNo;
    @XmlElement(name = "passenger_id_type")
    protected String passengerIdType;
    @XmlElement(name = "passenger_id_type_name")
    protected String passengerIdTypeName;
    @XmlElement(name = "passenger_name")
    protected String passengerName;
    @XmlElement(name = "prompt_msg")
    protected String promptMsg;
    @XmlElement(name = "reserve_start_date")
    protected String reserveStartDate;
    @XmlElement(name = "reserve_stop_date")
    protected String reserveStopDate;
    @XmlElement(name = "reserve_time")
    protected String reserveTime;
    @XmlElement(name = "reserver_id_name")
    protected String reserverIdName;
    @XmlElement(name = "reserver_id_no")
    protected String reserverIdNo;
    @XmlElement(name = "reserver_id_type")
    protected String reserverIdType;
    @XmlElement(name = "seat_no")
    protected String seatNo;
    @XmlElement(name = "seat_type_codes")
    protected String seatTypeCodes;
    @XmlElement(name = "sequence_no")
    protected String sequenceNo;
    @XmlElement(name = "start_date")
    protected String startDate;
    @XmlElement(name = "start_time")
    protected String startTime;
    @XmlElement(name = "start_train_date")
    protected String startTrainDate;
    @XmlElement(name = "stop_date")
    protected String stopDate;
    @XmlElement(name = "stop_train_date")
    protected String stopTrainDate;
    @XmlElement(name = "ticket_price")
    protected int ticketPrice;
    @XmlElement(name = "ticket_type")
    protected String ticketType;
    @XmlElement(name = "to_station_name")
    protected String toStationName;
    @XmlElement(name = "to_telecode")
    protected String toTelecode;
    @XmlElement(name = "train_date")
    protected String trainDate;
    @XmlElement(name = "train_no")
    protected String trainNo;
    @XmlElement(name = "update_time")
    protected String updateTime;
    @XmlElement(name = "use_flag")
    protected String useFlag;
    @XmlElement(name = "win_print")
    protected String winPrint;
    @XmlElement(name = "win_resign")
    protected String winResign;
    @XmlElement(name = "win_return")
    protected String winReturn;
    @XmlElement(name = "win_sale")
    protected String winSale;

    /**
     * Gets the value of the batchNo property.
     * 
     */
    public int getBatchNo() {
        return batchNo;
    }

    /**
     * Sets the value of the batchNo property.
     * 
     */
    public void setBatchNo(int value) {
        this.batchNo = value;
    }

    /**
     * Gets the value of the boardTrainCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardTrainCode() {
        return boardTrainCode;
    }

    /**
     * Sets the value of the boardTrainCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardTrainCode(String value) {
        this.boardTrainCode = value;
    }

    /**
     * Gets the value of the checkFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckFlag() {
        return checkFlag;
    }

    /**
     * Sets the value of the checkFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckFlag(String value) {
        this.checkFlag = value;
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
     * Gets the value of the controlFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlFlag() {
        return controlFlag;
    }

    /**
     * Sets the value of the controlFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlFlag(String value) {
        this.controlFlag = value;
    }

    /**
     * Gets the value of the createTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * Sets the value of the createTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateTime(String value) {
        this.createTime = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the flag1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlag1() {
        return flag1;
    }

    /**
     * Sets the value of the flag1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlag1(String value) {
        this.flag1 = value;
    }

    /**
     * Gets the value of the flag2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlag2() {
        return flag2;
    }

    /**
     * Sets the value of the flag2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlag2(String value) {
        this.flag2 = value;
    }

    /**
     * Gets the value of the flag3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlag3() {
        return flag3;
    }

    /**
     * Sets the value of the flag3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlag3(String value) {
        this.flag3 = value;
    }

    /**
     * Gets the value of the flag4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlag4() {
        return flag4;
    }

    /**
     * Sets the value of the flag4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlag4(String value) {
        this.flag4 = value;
    }

    /**
     * Gets the value of the flag5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlag5() {
        return flag5;
    }

    /**
     * Sets the value of the flag5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlag5(String value) {
        this.flag5 = value;
    }

    /**
     * Gets the value of the flag6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlag6() {
        return flag6;
    }

    /**
     * Sets the value of the flag6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlag6(String value) {
        this.flag6 = value;
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
     * Gets the value of the fromTelecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromTelecode() {
        return fromTelecode;
    }

    /**
     * Sets the value of the fromTelecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromTelecode(String value) {
        this.fromTelecode = value;
    }

    /**
     * Gets the value of the loginName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * Sets the value of the loginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginName(String value) {
        this.loginName = value;
    }

    /**
     * Gets the value of the mobileNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     * Sets the value of the mobileNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileNo(String value) {
        this.mobileNo = value;
    }

    /**
     * Gets the value of the onlineResign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnlineResign() {
        return onlineResign;
    }

    /**
     * Sets the value of the onlineResign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnlineResign(String value) {
        this.onlineResign = value;
    }

    /**
     * Gets the value of the onlineReturn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnlineReturn() {
        return onlineReturn;
    }

    /**
     * Sets the value of the onlineReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnlineReturn(String value) {
        this.onlineReturn = value;
    }

    /**
     * Gets the value of the onlineSale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnlineSale() {
        return onlineSale;
    }

    /**
     * Sets the value of the onlineSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnlineSale(String value) {
        this.onlineSale = value;
    }

    /**
     * Gets the value of the operationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationType() {
        return operationType;
    }

    /**
     * Sets the value of the operationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationType(String value) {
        this.operationType = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
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
     * Gets the value of the promptMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromptMsg() {
        return promptMsg;
    }

    /**
     * Sets the value of the promptMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromptMsg(String value) {
        this.promptMsg = value;
    }

    /**
     * Gets the value of the reserveStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserveStartDate() {
        return reserveStartDate;
    }

    /**
     * Sets the value of the reserveStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserveStartDate(String value) {
        this.reserveStartDate = value;
    }

    /**
     * Gets the value of the reserveStopDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserveStopDate() {
        return reserveStopDate;
    }

    /**
     * Sets the value of the reserveStopDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserveStopDate(String value) {
        this.reserveStopDate = value;
    }

    /**
     * Gets the value of the reserveTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserveTime() {
        return reserveTime;
    }

    /**
     * Sets the value of the reserveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserveTime(String value) {
        this.reserveTime = value;
    }

    /**
     * Gets the value of the reserverIdName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserverIdName() {
        return reserverIdName;
    }

    /**
     * Sets the value of the reserverIdName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserverIdName(String value) {
        this.reserverIdName = value;
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
     * Gets the value of the reserverIdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserverIdType() {
        return reserverIdType;
    }

    /**
     * Sets the value of the reserverIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserverIdType(String value) {
        this.reserverIdType = value;
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
     * Gets the value of the seatTypeCodes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatTypeCodes() {
        return seatTypeCodes;
    }

    /**
     * Sets the value of the seatTypeCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatTypeCodes(String value) {
        this.seatTypeCodes = value;
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
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
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
     * Gets the value of the startTrainDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTrainDate() {
        return startTrainDate;
    }

    /**
     * Sets the value of the startTrainDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTrainDate(String value) {
        this.startTrainDate = value;
    }

    /**
     * Gets the value of the stopDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopDate() {
        return stopDate;
    }

    /**
     * Sets the value of the stopDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopDate(String value) {
        this.stopDate = value;
    }

    /**
     * Gets the value of the stopTrainDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopTrainDate() {
        return stopTrainDate;
    }

    /**
     * Sets the value of the stopTrainDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopTrainDate(String value) {
        this.stopTrainDate = value;
    }

    /**
     * Gets the value of the ticketPrice property.
     * 
     */
    public int getTicketPrice() {
        return ticketPrice;
    }

    /**
     * Sets the value of the ticketPrice property.
     * 
     */
    public void setTicketPrice(int value) {
        this.ticketPrice = value;
    }

    /**
     * Gets the value of the ticketType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketType() {
        return ticketType;
    }

    /**
     * Sets the value of the ticketType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketType(String value) {
        this.ticketType = value;
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
     * Gets the value of the toTelecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToTelecode() {
        return toTelecode;
    }

    /**
     * Sets the value of the toTelecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToTelecode(String value) {
        this.toTelecode = value;
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
     * Gets the value of the trainNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainNo() {
        return trainNo;
    }

    /**
     * Sets the value of the trainNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainNo(String value) {
        this.trainNo = value;
    }

    /**
     * Gets the value of the updateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * Sets the value of the updateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateTime(String value) {
        this.updateTime = value;
    }

    /**
     * Gets the value of the useFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseFlag() {
        return useFlag;
    }

    /**
     * Sets the value of the useFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseFlag(String value) {
        this.useFlag = value;
    }

    /**
     * Gets the value of the winPrint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWinPrint() {
        return winPrint;
    }

    /**
     * Sets the value of the winPrint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWinPrint(String value) {
        this.winPrint = value;
    }

    /**
     * Gets the value of the winResign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWinResign() {
        return winResign;
    }

    /**
     * Sets the value of the winResign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWinResign(String value) {
        this.winResign = value;
    }

    /**
     * Gets the value of the winReturn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWinReturn() {
        return winReturn;
    }

    /**
     * Sets the value of the winReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWinReturn(String value) {
        this.winReturn = value;
    }

    /**
     * Gets the value of the winSale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWinSale() {
        return winSale;
    }

    /**
     * Sets the value of the winSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWinSale(String value) {
        this.winSale = value;
    }

}
