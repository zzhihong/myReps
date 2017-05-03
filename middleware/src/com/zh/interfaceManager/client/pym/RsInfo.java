
package com.zh.interfaceManager.client.pym;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.zh.interfaceManager.client.common.Header;


/**
 * <p>Java class for rsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rsInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="body" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="header" type="{http://dict.railway.com/}serviceHeader" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rsInfo", propOrder = {
    "body",
    "header"
   
})
public class RsInfo implements Serializable{

	private static final long serialVersionUID = 1L;
	protected Object body;
    protected ServiceHeader header;


    

	/**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBody(Object value) {
        this.body = value;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceHeader }
     *     
     */
    public ServiceHeader getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceHeader }
     *     
     */
    public void setHeader(ServiceHeader value) {
        this.header = value;
    }

	@Override
	public String toString() {
		return "RsInfo [body=" + body + ", header=" + header + "]";
	}

}
