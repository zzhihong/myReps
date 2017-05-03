
package com.zh.interfaceManager.client.realname;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ICT_QueryBundlingMobile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ICT_QueryBundlingMobile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonHeader" type="{http://ManageUserInfoWebServiceWS}commonHeader" minOccurs="0"/>
 *         &lt;element name="complaint_id_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="complaint_id_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ICT_QueryBundlingMobile", propOrder = {
    "commonHeader",
    "complaintIdType",
    "complaintIdNo",
    "phone"
})
public class ICTQueryBundlingMobile  implements Serializable{

    protected CommonHeader commonHeader;
    @XmlElement(name = "complaint_id_type")
    protected String complaintIdType;
    @XmlElement(name = "complaint_id_no")
    protected String complaintIdNo;
    protected String phone;

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
     * Gets the value of the complaintIdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplaintIdType() {
        return complaintIdType;
    }

    /**
     * Sets the value of the complaintIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplaintIdType(String value) {
        this.complaintIdType = value;
    }

    /**
     * Gets the value of the complaintIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplaintIdNo() {
        return complaintIdNo;
    }

    /**
     * Sets the value of the complaintIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplaintIdNo(String value) {
        this.complaintIdNo = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

}
