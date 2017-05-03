
package com.zh.interfaceManager.client.dpdd;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ictOrderInfoByUserBO2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ictOrderInfoByUserBO2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="batchNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listPayInfo" type="{http://TRSForCustomerSupportCenterServices2Service}ictQueryOrderPayInfoBO2" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listPaymentPayInfo" type="{http://TRSForCustomerSupportCenterServices2Service}paymentRS2" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listTickets" type="{http://TRSForCustomerSupportCenterServices2Service}ticketBO2" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="registerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserveTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sequenceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ticketNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ticketPriceAll" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ictOrderInfoByUserBO2", propOrder = {
    "batchNo",
    "listPayInfo",
    "listPaymentPayInfo",
    "listTickets",
    "registerName",
    "reserveDate",
    "reserveTime",
    "sequenceNo",
    "ticketNum",
    "ticketPriceAll"
})
public class IctOrderInfoByUserBO2 implements Serializable{

	private static final long serialVersionUID = 1L;
	protected String batchNo;
    @XmlElement(nillable = true)
    protected List<IctQueryOrderPayInfoBO2> listPayInfo;
    @XmlElement(nillable = true)
    protected List<PaymentRS2> listPaymentPayInfo;
    @XmlElement(nillable = true)
    protected List<TicketBO2> listTickets;
    @Override
	public String toString() {
		return "IctOrderInfoByUserBO2 [batchNo=" + batchNo + ", listPayInfo="
				+ listPayInfo + ", listPaymentPayInfo=" + listPaymentPayInfo
				+ ", listTickets=" + listTickets + ", registerName="
				+ registerName + ", reserveDate=" + reserveDate
				+ ", reserveTime=" + reserveTime + ", sequenceNo=" + sequenceNo
				+ ", ticketNum=" + ticketNum + ", ticketPriceAll="
				+ ticketPriceAll + "]";
	}

	protected String registerName;
    protected String reserveDate;
    protected String reserveTime;
    protected String sequenceNo;
    protected String ticketNum;
    protected String ticketPriceAll;

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
     * Gets the value of the listPayInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listPayInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListPayInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IctQueryOrderPayInfoBO2 }
     * 
     * 
     */
    public List<IctQueryOrderPayInfoBO2> getListPayInfo() {
        if (listPayInfo == null) {
            listPayInfo = new ArrayList<IctQueryOrderPayInfoBO2>();
        }
        return this.listPayInfo;
    }

    /**
     * Gets the value of the listPaymentPayInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listPaymentPayInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListPaymentPayInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentRS2 }
     * 
     * 
     */
    public List<PaymentRS2> getListPaymentPayInfo() {
        if (listPaymentPayInfo == null) {
            listPaymentPayInfo = new ArrayList<PaymentRS2>();
        }
        return this.listPaymentPayInfo;
    }

    /**
     * Gets the value of the listTickets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listTickets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListTickets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketBO2 }
     * 
     * 
     */
    public List<TicketBO2> getListTickets() {
        if (listTickets == null) {
            listTickets = new ArrayList<TicketBO2>();
        }
        return this.listTickets;
    }

    /**
     * Gets the value of the registerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterName() {
        return registerName;
    }

    /**
     * Sets the value of the registerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterName(String value) {
        this.registerName = value;
    }

    /**
     * Gets the value of the reserveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserveDate() {
        return reserveDate;
    }

    /**
     * Sets the value of the reserveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserveDate(String value) {
        this.reserveDate = value;
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

}
