
package com.zh.interfaceManager.client.realname;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ICT_GetPhoneVerificationCodeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ICT_GetPhoneVerificationCodeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ManageUserInfoWebServiceWS}responseEntityPhoneVerificationCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ICT_GetPhoneVerificationCodeResponse", propOrder = {
    "_return"
})
public class ICTGetPhoneVerificationCodeResponse  implements Serializable{

    @XmlElement(name = "return")
    protected ResponseEntityPhoneVerificationCode _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseEntityPhoneVerificationCode }
     *     
     */
    public ResponseEntityPhoneVerificationCode getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseEntityPhoneVerificationCode }
     *     
     */
    public void setReturn(ResponseEntityPhoneVerificationCode value) {
        this._return = value;
    }

}
