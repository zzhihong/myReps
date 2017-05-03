
package com.zh.interfaceManager.client.postvm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for baseDomainObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="baseDomainObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseDomainObject")
@XmlSeeAlso({
    BoICTQueryPOSTVMTransactionInfoByTicketInfo.class,
    BodyICTQueryPOSTVMTransactionInfoByTicketInfo.class,
    IctHeader.class,
    IctQueryPOSTVMTransactionInfoByTicketInfoRes.class
})
public abstract class BaseDomainObject {


}
