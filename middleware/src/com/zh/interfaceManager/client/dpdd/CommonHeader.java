
package com.zh.interfaceManager.client.dpdd;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for commonHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="commonHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bureau_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operatorNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="srcIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commonHeader", propOrder = {
    "bureauCode",
    "operatorNo",
    "srcIP"
})
public class CommonHeader implements Serializable{

	@Override
	public String toString() {
		return "CommonHeader [bureauCode=" + bureauCode + ", operatorNo="
				+ operatorNo + ", srcIP=" + srcIP + "]";
	}

	private static final long serialVersionUID = 1L;
	@XmlElement(name = "bureau_code")
    protected String bureauCode;
    protected String operatorNo;
    protected String srcIP;

    /**
     * Gets the value of the bureauCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBureauCode() {
        return bureauCode;
    }

    /**
     * Sets the value of the bureauCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBureauCode(String value) {
        this.bureauCode = value;
    }

    /**
     * Gets the value of the operatorNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorNo() {
        return operatorNo;
    }

    /**
     * Sets the value of the operatorNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorNo(String value) {
        this.operatorNo = value;
    }

    /**
     * Gets the value of the srcIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcIP() {
        return srcIP;
    }

    /**
     * Sets the value of the srcIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcIP(String value) {
        this.srcIP = value;
    }

}
