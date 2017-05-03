
package com.zh.interfaceManager.client.realname;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ICT_SynchronizedUserByRegister complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ICT_SynchronizedUserByRegister">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonHeader" type="{http://ManageUserInfoWebServiceWS}commonHeader" minOccurs="0"/>
 *         &lt;element name="id_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="register_user_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ICT_SynchronizedUserByRegister", propOrder = {
    "commonHeader",
    "idType",
    "idNo",
    "phone",
    "registerUserName"
})
public class ICTSynchronizedUserByRegister  implements Serializable{

    protected CommonHeader commonHeader;
    @XmlElement(name = "id_type")
    protected String idType;
    @XmlElement(name = "id_no")
    protected String idNo;
    protected String phone;
    @XmlElement(name = "register_user_name")
    protected String registerUserName;

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

    /**
     * Gets the value of the registerUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterUserName() {
        return registerUserName;
    }

    /**
     * Sets the value of the registerUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterUserName(String value) {
        this.registerUserName = value;
    }

}
