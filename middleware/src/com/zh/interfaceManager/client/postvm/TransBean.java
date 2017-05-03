
package com.zh.interfaceManager.client.postvm;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tradeNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transBean", propOrder = {
    "bankCode",
    "bankName",
    "tradeNo",
    "transAmount",
    "transDate",
    "transDesc",
    "transNo",
    "transStatus",
    "transType"
})
public class TransBean implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String bankCode;
    protected String bankName;
    protected String tradeNo;
    protected String transAmount;
    protected String transDate;
    protected String transDesc;
    protected String transNo;
    protected String transStatus;
    protected String transType;

    /**
     * Gets the value of the bankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Sets the value of the bankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCode(String value) {
        this.bankCode = value;
    }

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
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
     * Gets the value of the transAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransAmount() {
        return transAmount;
    }

    /**
     * Sets the value of the transAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransAmount(String value) {
        this.transAmount = value;
    }

    /**
     * Gets the value of the transDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransDate() {
        return transDate;
    }

    /**
     * Sets the value of the transDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransDate(String value) {
        this.transDate = value;
    }

    /**
     * Gets the value of the transDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransDesc() {
        return transDesc;
    }

    /**
     * Sets the value of the transDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransDesc(String value) {
        this.transDesc = value;
    }

    /**
     * Gets the value of the transNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransNo() {
        return transNo;
    }

    /**
     * Sets the value of the transNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransNo(String value) {
        this.transNo = value;
    }

    /**
     * Gets the value of the transStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransStatus() {
        return transStatus;
    }

    /**
     * Sets the value of the transStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransStatus(String value) {
        this.transStatus = value;
    }

    /**
     * Gets the value of the transType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransType() {
        return transType;
    }

    /**
     * Sets the value of the transType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransType(String value) {
        this.transType = value;
    }

	@Override
	public String toString() {
		return "TransBean [bankCode=" + bankCode + ", bankName=" + bankName
				+ ", tradeNo=" + tradeNo + ", transAmount=" + transAmount
				+ ", transDate=" + transDate + ", transDesc=" + transDesc
				+ ", transNo=" + transNo + ", transStatus=" + transStatus
				+ ", transType=" + transType + "]";
	}

}
