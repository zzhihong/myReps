
package com.zh.interfaceManager.client.dpdd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.zh.interfaceManager.client.dpdd package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _QueryCheckTicketInfo_QNAME = new QName("http://TRSForCustomerSupportCenterServices2Service", "queryCheckTicketInfo");
    private final static QName _ICTQueryAccidentInsuranceResponse_QNAME = new QName("http://TRSForCustomerSupportCenterServices2Service", "ICT_QueryAccidentInsuranceResponse");
    private final static QName _QueryCheckTicketInfoResponse_QNAME = new QName("http://TRSForCustomerSupportCenterServices2Service", "queryCheckTicketInfoResponse");
    private final static QName _ICTOrderInfoByUser_QNAME = new QName("http://TRSForCustomerSupportCenterServices2Service", "ICT_OrderInfoByUser");
    private final static QName _ICTOrderInfoByUserResponse_QNAME = new QName("http://TRSForCustomerSupportCenterServices2Service", "ICT_OrderInfoByUserResponse");
    private final static QName _ICTQueryAccidentInsurance_QNAME = new QName("http://TRSForCustomerSupportCenterServices2Service", "ICT_QueryAccidentInsurance");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.zh.interfaceManager.client.dpdd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ICTQueryAccidentInsuranceResponse }
     * 
     */
    public ICTQueryAccidentInsuranceResponse createICTQueryAccidentInsuranceResponse() {
        return new ICTQueryAccidentInsuranceResponse();
    }

    /**
     * Create an instance of {@link QueryCheckTicketInfo }
     * 
     */
    public QueryCheckTicketInfo createQueryCheckTicketInfo() {
        return new QueryCheckTicketInfo();
    }

    /**
     * Create an instance of {@link ICTQueryAccidentInsurance }
     * 
     */
    public ICTQueryAccidentInsurance createICTQueryAccidentInsurance() {
        return new ICTQueryAccidentInsurance();
    }

    /**
     * Create an instance of {@link ICTOrderInfoByUserResponse }
     * 
     */
    public ICTOrderInfoByUserResponse createICTOrderInfoByUserResponse() {
        return new ICTOrderInfoByUserResponse();
    }

    /**
     * Create an instance of {@link QueryCheckTicketInfoResponse }
     * 
     */
    public QueryCheckTicketInfoResponse createQueryCheckTicketInfoResponse() {
        return new QueryCheckTicketInfoResponse();
    }

    /**
     * Create an instance of {@link ICTOrderInfoByUser }
     * 
     */
    public ICTOrderInfoByUser createICTOrderInfoByUser() {
        return new ICTOrderInfoByUser();
    }

    /**
     * Create an instance of {@link ExceptionEntity }
     * 
     */
    public ExceptionEntity createExceptionEntity() {
        return new ExceptionEntity();
    }

    /**
     * Create an instance of {@link IctInsuranceRRT }
     * 
     */
    public IctInsuranceRRT createIctInsuranceRRT() {
        return new IctInsuranceRRT();
    }

    /**
     * Create an instance of {@link PaymentRS2 }
     * 
     */
    public PaymentRS2 createPaymentRS2() {
        return new PaymentRS2();
    }

    /**
     * Create an instance of {@link TicketBO2 }
     * 
     */
    public TicketBO2 createTicketBO2() {
        return new TicketBO2();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link InsuranceRRT }
     * 
     */
    public InsuranceRRT createInsuranceRRT() {
        return new InsuranceRRT();
    }

    /**
     * Create an instance of {@link IctCheckTicketPlatForm }
     * 
     */
    public IctCheckTicketPlatForm createIctCheckTicketPlatForm() {
        return new IctCheckTicketPlatForm();
    }

    /**
     * Create an instance of {@link IctOrderInfoByUserBO2 }
     * 
     */
    public IctOrderInfoByUserBO2 createIctOrderInfoByUserBO2() {
        return new IctOrderInfoByUserBO2();
    }

    /**
     * Create an instance of {@link CommonHeader }
     * 
     */
    public CommonHeader createCommonHeader() {
        return new CommonHeader();
    }

    /**
     * Create an instance of {@link IctOrderInfoByUserRS2 }
     * 
     */
    public IctOrderInfoByUserRS2 createIctOrderInfoByUserRS2() {
        return new IctOrderInfoByUserRS2();
    }

    /**
     * Create an instance of {@link Wb10TrainPlatform }
     * 
     */
    public Wb10TrainPlatform createWb10TrainPlatform() {
        return new Wb10TrainPlatform();
    }

    /**
     * Create an instance of {@link IctQueryOrderPayInfoBO2 }
     * 
     */
    public IctQueryOrderPayInfoBO2 createIctQueryOrderPayInfoBO2() {
        return new IctQueryOrderPayInfoBO2();
    }

    /**
     * Create an instance of {@link ServiceHeader }
     * 
     */
    public ServiceHeader createServiceHeader() {
        return new ServiceHeader();
    }

    /**
     * Create an instance of {@link IctOrderInfoByUserRQ2 }
     * 
     */
    public IctOrderInfoByUserRQ2 createIctOrderInfoByUserRQ2() {
        return new IctOrderInfoByUserRQ2();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryCheckTicketInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://TRSForCustomerSupportCenterServices2Service", name = "queryCheckTicketInfo")
    public JAXBElement<QueryCheckTicketInfo> createQueryCheckTicketInfo(QueryCheckTicketInfo value) {
        return new JAXBElement<QueryCheckTicketInfo>(_QueryCheckTicketInfo_QNAME, QueryCheckTicketInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ICTQueryAccidentInsuranceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://TRSForCustomerSupportCenterServices2Service", name = "ICT_QueryAccidentInsuranceResponse")
    public JAXBElement<ICTQueryAccidentInsuranceResponse> createICTQueryAccidentInsuranceResponse(ICTQueryAccidentInsuranceResponse value) {
        return new JAXBElement<ICTQueryAccidentInsuranceResponse>(_ICTQueryAccidentInsuranceResponse_QNAME, ICTQueryAccidentInsuranceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryCheckTicketInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://TRSForCustomerSupportCenterServices2Service", name = "queryCheckTicketInfoResponse")
    public JAXBElement<QueryCheckTicketInfoResponse> createQueryCheckTicketInfoResponse(QueryCheckTicketInfoResponse value) {
        return new JAXBElement<QueryCheckTicketInfoResponse>(_QueryCheckTicketInfoResponse_QNAME, QueryCheckTicketInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ICTOrderInfoByUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://TRSForCustomerSupportCenterServices2Service", name = "ICT_OrderInfoByUser")
    public JAXBElement<ICTOrderInfoByUser> createICTOrderInfoByUser(ICTOrderInfoByUser value) {
        return new JAXBElement<ICTOrderInfoByUser>(_ICTOrderInfoByUser_QNAME, ICTOrderInfoByUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ICTOrderInfoByUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://TRSForCustomerSupportCenterServices2Service", name = "ICT_OrderInfoByUserResponse")
    public JAXBElement<ICTOrderInfoByUserResponse> createICTOrderInfoByUserResponse(ICTOrderInfoByUserResponse value) {
        return new JAXBElement<ICTOrderInfoByUserResponse>(_ICTOrderInfoByUserResponse_QNAME, ICTOrderInfoByUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ICTQueryAccidentInsurance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://TRSForCustomerSupportCenterServices2Service", name = "ICT_QueryAccidentInsurance")
    public JAXBElement<ICTQueryAccidentInsurance> createICTQueryAccidentInsurance(ICTQueryAccidentInsurance value) {
        return new JAXBElement<ICTQueryAccidentInsurance>(_ICTQueryAccidentInsurance_QNAME, ICTQueryAccidentInsurance.class, null, value);
    }

}
