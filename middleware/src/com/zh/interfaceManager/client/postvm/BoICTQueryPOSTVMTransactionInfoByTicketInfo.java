
package com.zh.interfaceManager.client.postvm;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for boICTQueryPOSTVMTransactionInfoByTicketInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="boICTQueryPOSTVMTransactionInfoByTicketInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.otsweb.ict.cars.com/queryPOSTVMServiceEndPoint}baseDomainObject">
 *       &lt;sequence>
 *         &lt;element name="coachNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fromStationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newticket21info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passengerIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passengerIdType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passengerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payTransBeanList" type="{http://ws.otsweb.ict.cars.com/queryPOSTVMServiceEndPoint}transBean" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="returnStationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnWindow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnWindowOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="saleStationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="saleTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="saleWindow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="saleWindowOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seatNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seatNoTmp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seatTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ticket21info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ticketNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ticketPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ticketPriceAll" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ticketStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ticketTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="toStationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tradeNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trainCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trainDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "boICTQueryPOSTVMTransactionInfoByTicketInfo", propOrder = {
    "coachNo",
    "fromStationName",
    "newticket21Info",
    "passengerIdNo",
    "passengerIdType",
    "passengerName",
    "payTransBeanList",
    "returnStationName",
    "returnTime",
    "returnWindow",
    "returnWindowOwner",
    "saleStationName",
    "saleTime",
    "saleWindow",
    "saleWindowOwner",
    "seatNo",
    "seatNoTmp",
    "seatTypeName",
    "startTime",
    "ticket21Info",
    "ticketNum",
    "ticketPrice",
    "ticketPriceAll",
    "ticketStatus",
    "ticketTypeName",
    "toStationName",
    "tradeNo",
    "trainCode",
    "trainDate"
})
public class BoICTQueryPOSTVMTransactionInfoByTicketInfo 
    extends BaseDomainObject implements Serializable
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String coachNo;
    protected String fromStationName;
    @XmlElement(name = "newticket21info")
    protected String newticket21Info;
    protected String passengerIdNo;
    protected String passengerIdType;
    protected String passengerName;
    @XmlElement(nillable = true)
    protected List<TransBean> payTransBeanList;
    protected String returnStationName;
    protected String returnTime;
    protected String returnWindow;
    protected String returnWindowOwner;
    protected String saleStationName;
    protected String saleTime;
    protected String saleWindow;
    protected String saleWindowOwner;
    protected String seatNo;
    protected String seatNoTmp;
    protected String seatTypeName;
    protected String startTime;
    @XmlElement(name = "ticket21info")
    protected String ticket21Info;
    protected String ticketNum;
    protected String ticketPrice;
    protected String ticketPriceAll;
    protected String ticketStatus;
    protected String ticketTypeName;
    protected String toStationName;
    protected String tradeNo;
    protected String trainCode;
    protected String trainDate;

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
     * Gets the value of the newticket21Info property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewticket21Info() {
        return newticket21Info;
    }

    /**
     * Sets the value of the newticket21Info property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewticket21Info(String value) {
        this.newticket21Info = value;
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
     * Gets the value of the payTransBeanList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payTransBeanList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayTransBeanList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransBean }
     * 
     * 
     */
    public List<TransBean> getPayTransBeanList() {
        if (payTransBeanList == null) {
            payTransBeanList = new ArrayList<TransBean>();
        }
        return this.payTransBeanList;
    }

    /**
     * Gets the value of the returnStationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnStationName() {
        return returnStationName;
    }

    /**
     * Sets the value of the returnStationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnStationName(String value) {
        this.returnStationName = value;
    }

    /**
     * Gets the value of the returnTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnTime() {
        return returnTime;
    }

    /**
     * Sets the value of the returnTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnTime(String value) {
        this.returnTime = value;
    }

    /**
     * Gets the value of the returnWindow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnWindow() {
        return returnWindow;
    }

    /**
     * Sets the value of the returnWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnWindow(String value) {
        this.returnWindow = value;
    }

    /**
     * Gets the value of the returnWindowOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnWindowOwner() {
        return returnWindowOwner;
    }

    /**
     * Sets the value of the returnWindowOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnWindowOwner(String value) {
        this.returnWindowOwner = value;
    }

    /**
     * Gets the value of the saleStationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleStationName() {
        return saleStationName;
    }

    /**
     * Sets the value of the saleStationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleStationName(String value) {
        this.saleStationName = value;
    }

    /**
     * Gets the value of the saleTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleTime() {
        return saleTime;
    }

    /**
     * Sets the value of the saleTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleTime(String value) {
        this.saleTime = value;
    }

    /**
     * Gets the value of the saleWindow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleWindow() {
        return saleWindow;
    }

    /**
     * Sets the value of the saleWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleWindow(String value) {
        this.saleWindow = value;
    }

    /**
     * Gets the value of the saleWindowOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleWindowOwner() {
        return saleWindowOwner;
    }

    /**
     * Sets the value of the saleWindowOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleWindowOwner(String value) {
        this.saleWindowOwner = value;
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
     * Gets the value of the seatNoTmp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatNoTmp() {
        return seatNoTmp;
    }

    /**
     * Sets the value of the seatNoTmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatNoTmp(String value) {
        this.seatNoTmp = value;
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
     * Gets the value of the ticketNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketNum() {
        return ticketNum;
    }

    /**
     * Sets the value of the ticketNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketNum(String value) {
        this.ticketNum = value;
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
     * Gets the value of the ticketPriceAll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketPriceAll() {
        return ticketPriceAll;
    }

    /**
     * Sets the value of the ticketPriceAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketPriceAll(String value) {
        this.ticketPriceAll = value;
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

	@Override
	public String toString() {
		return "BoICTQueryPOSTVMTransactionInfoByTicketInfo [coachNo="
				+ coachNo + ", fromStationName=" + fromStationName
				+ ", newticket21Info=" + newticket21Info + ", passengerIdNo="
				+ passengerIdNo + ", passengerIdType=" + passengerIdType
				+ ", passengerName=" + passengerName + ", payTransBeanList="
				+ payTransBeanList + ", returnStationName=" + returnStationName
				+ ", returnTime=" + returnTime + ", returnWindow="
				+ returnWindow + ", returnWindowOwner=" + returnWindowOwner
				+ ", saleStationName=" + saleStationName + ", saleTime="
				+ saleTime + ", saleWindow=" + saleWindow
				+ ", saleWindowOwner=" + saleWindowOwner + ", seatNo=" + seatNo
				+ ", seatNoTmp=" + seatNoTmp + ", seatTypeName=" + seatTypeName
				+ ", startTime=" + startTime + ", ticket21Info=" + ticket21Info
				+ ", ticketNum=" + ticketNum + ", ticketPrice=" + ticketPrice
				+ ", ticketPriceAll=" + ticketPriceAll + ", ticketStatus="
				+ ticketStatus + ", ticketTypeName=" + ticketTypeName
				+ ", toStationName=" + toStationName + ", tradeNo=" + tradeNo
				+ ", trainCode=" + trainCode + ", trainDate=" + trainDate + "]";
	}

}
