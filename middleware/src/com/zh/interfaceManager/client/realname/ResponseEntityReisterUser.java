
package com.zh.interfaceManager.client.realname;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for responseEntityReisterUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responseEntityReisterUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="checkStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "responseEntityReisterUser", propOrder = {
    "checkStatus",
    "header"
})
public class ResponseEntityReisterUser  implements Serializable{

    protected String checkStatus;
    protected ExceptionEntity header;

    /**
     * Gets the value of the checkStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckStatus() {
        return checkStatus;
    }

    /**
     * Sets the value of the checkStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckStatus(String value) {
        this.checkStatus = value;
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
