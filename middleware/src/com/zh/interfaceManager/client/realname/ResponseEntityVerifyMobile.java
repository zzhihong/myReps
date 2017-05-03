
package com.zh.interfaceManager.client.realname;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for responseEntityVerifyMobile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responseEntityVerifyMobile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="checkMobileStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="header" type="{http://ManageUserInfoWebServiceWS}exceptionEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseEntityVerifyMobile", propOrder = {
    "checkMobileStatus",
    "header"
})
public class ResponseEntityVerifyMobile  implements Serializable{

    protected String checkMobileStatus;
    protected ExceptionEntity header;

    /**
     * Gets the value of the checkMobileStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckMobileStatus() {
        return checkMobileStatus;
    }

    /**
     * Sets the value of the checkMobileStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckMobileStatus(String value) {
        this.checkMobileStatus = value;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionEntity }
     *     
     */
    public ExceptionEntity getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionEntity }
     *     
     */
    public void setHeader(ExceptionEntity value) {
        this.header = value;
    }

}
