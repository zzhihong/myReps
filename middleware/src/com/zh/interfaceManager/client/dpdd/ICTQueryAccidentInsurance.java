
package com.zh.interfaceManager.client.dpdd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ICT_QueryAccidentInsurance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ICT_QueryAccidentInsurance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonHeader" type="{http://TRSForCustomerSupportCenterServices2Service}commonHeader" minOccurs="0"/>
 *         &lt;element name="sale_start_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sale_end_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insure_id_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insure_id_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insurance_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sequence_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="login_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ICT_QueryAccidentInsurance", propOrder = {
    "commonHeader",
    "saleStartDate",
    "saleEndDate",
    "insureIdType",
    "insureIdNo",
    "insuranceNo",
    "sequenceNo",
    "loginName"
})
public class ICTQueryAccidentInsurance {

    protected CommonHeader commonHeader;
    @XmlElement(name = "sale_start_date")
    protected String saleStartDate;
    @XmlElement(name = "sale_end_date")
    protected String saleEndDate;
    @XmlElement(name = "insure_id_type")
    protected String insureIdType;
    @XmlElement(name = "insure_id_no")
    protected String insureIdNo;
    @XmlElement(name = "insurance_no")
    protected String insuranceNo;
    @XmlElement(name = "sequence_no")
    protected String sequenceNo;
    @XmlElement(name = "login_name")
    protected String loginName;

    /**
     * Gets the value of the commonHeader property.
     * 
     * @return
     *     possible object is
     *     {@link CommonHeader }
     *     
     */
    public CommonHeader getCommonHeader() {
        return commonHeader;
    }

    /**
     * Sets the value of the commonHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonHeader }
     *     
     */
    public void setCommonHeader(CommonHeader value) {
        this.commonHeader = value;
    }

    /**
     * Gets the value of the saleStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleStartDate() {
        return saleStartDate;
    }

    /**
     * Sets the value of the saleStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleStartDate(String value) {
        this.saleStartDate = value;
    }

    /**
     * Gets the value of the saleEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleEndDate() {
        return saleEndDate;
    }

    /**
     * Sets the value of the saleEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleEndDate(String value) {
        this.saleEndDate = value;
    }

    /**
     * Gets the value of the insureIdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsureIdType() {
        return insureIdType;
    }

    /**
     * Sets the value of the insureIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsureIdType(String value) {
        this.insureIdType = value;
    }

    /**
     * Gets the value of the insureIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsureIdNo() {
        return insureIdNo;
    }

    /**
     * Sets the value of the insureIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsureIdNo(String value) {
        this.insureIdNo = value;
    }

    /**
     * Gets the value of the insuranceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceNo() {
        return insuranceNo;
    }

    /**
     * Sets the value of the insuranceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceNo(String value) {
        this.insuranceNo = value;
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

}
