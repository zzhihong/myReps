
package com.zh.interfaceManager.client.postvm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.zh.interfaceManager.client.postvm package. 
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

    private final static QName _QueryPOSTVMByPassengerAndTradeResponse_QNAME = new QName("http://ws.otsweb.ict.cars.com/queryPOSTVMServiceEndPoint", "queryPOSTVMByPassengerAndTradeResponse");
    private final static QName _QueryPOSTVMByPassengerAndTrade_QNAME = new QName("http://ws.otsweb.ict.cars.com/queryPOSTVMServiceEndPoint", "queryPOSTVMByPassengerAndTrade");
    private final static QName _QueryPOSTVMResponse_QNAME = new QName("http://ws.otsweb.ict.cars.com/queryPOSTVMServiceEndPoint", "queryPOSTVMResponse");
    private final static QName _QueryPOSTVM_QNAME = new QName("http://ws.otsweb.ict.cars.com/queryPOSTVMServiceEndPoint", "queryPOSTVM");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.zh.interfaceManager.client.postvm
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryPOSTVMByPassengerAndTradeResponse }
     * 
     */
    public QueryPOSTVMByPassengerAndTradeResponse createQueryPOSTVMByPassengerAndTradeResponse() {
        return new QueryPOSTVMByPassengerAndTradeResponse();
    }

    /**
     * Create an instance of {@link QueryPOSTVMResponse }
     * 
     */
    public QueryPOSTVMResponse createQueryPOSTVMResponse() {
        return new QueryPOSTVMResponse();
    }

    /**
     * Create an instance of {@link QueryPOSTVMByPassengerAndTrade }
     * 
     */
    public QueryPOSTVMByPassengerAndTrade createQueryPOSTVMByPassengerAndTrade() {
        return new QueryPOSTVMByPassengerAndTrade();
    }

    /**
     * Create an instance of {@link QueryPOSTVM }
     * 
     */
    public QueryPOSTVM createQueryPOSTVM() {
        return new QueryPOSTVM();
    }

    /**
     * Create an instance of {@link BoICTQueryPOSTVMTransactionInfoByTicketInfo }
     * 
     */
    public BoICTQueryPOSTVMTransactionInfoByTicketInfo createBoICTQueryPOSTVMTransactionInfoByTicketInfo() {
        return new BoICTQueryPOSTVMTransactionInfoByTicketInfo();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link TransBean }
     * 
     */
    public TransBean createTransBean() {
        return new TransBean();
    }

    /**
     * Create an instance of {@link BodyICTQueryPOSTVMTransactionInfoByTicketInfo }
     * 
     */
    public BodyICTQueryPOSTVMTransactionInfoByTicketInfo createBodyICTQueryPOSTVMTransactionInfoByTicketInfo() {
        return new BodyICTQueryPOSTVMTransactionInfoByTicketInfo();
    }

    /**
     * Create an instance of {@link IctHeader }
     * 
     */
    public IctHeader createIctHeader() {
        return new IctHeader();
    }

    /**
     * Create an instance of {@link IctQueryPOSTVMTransactionInfoByTicketInfoRes }
     * 
     */
    public IctQueryPOSTVMTransactionInfoByTicketInfoRes createIctQueryPOSTVMTransactionInfoByTicketInfoRes() {
        return new IctQueryPOSTVMTransactionInfoByTicketInfoRes();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryPOSTVMByPassengerAndTradeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.otsweb.ict.cars.com/queryPOSTVMServiceEndPoint", name = "queryPOSTVMByPassengerAndTradeResponse")
    public JAXBElement<QueryPOSTVMByPassengerAndTradeResponse> createQueryPOSTVMByPassengerAndTradeResponse(QueryPOSTVMByPassengerAndTradeResponse value) {
        return new JAXBElement<QueryPOSTVMByPassengerAndTradeResponse>(_QueryPOSTVMByPassengerAndTradeResponse_QNAME, QueryPOSTVMByPassengerAndTradeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryPOSTVMByPassengerAndTrade }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.otsweb.ict.cars.com/queryPOSTVMServiceEndPoint", name = "queryPOSTVMByPassengerAndTrade")
    public JAXBElement<QueryPOSTVMByPassengerAndTrade> createQueryPOSTVMByPassengerAndTrade(QueryPOSTVMByPassengerAndTrade value) {
        return new JAXBElement<QueryPOSTVMByPassengerAndTrade>(_QueryPOSTVMByPassengerAndTrade_QNAME, QueryPOSTVMByPassengerAndTrade.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryPOSTVMResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.otsweb.ict.cars.com/queryPOSTVMServiceEndPoint", name = "queryPOSTVMResponse")
    public JAXBElement<QueryPOSTVMResponse> createQueryPOSTVMResponse(QueryPOSTVMResponse value) {
        return new JAXBElement<QueryPOSTVMResponse>(_QueryPOSTVMResponse_QNAME, QueryPOSTVMResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryPOSTVM }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.otsweb.ict.cars.com/queryPOSTVMServiceEndPoint", name = "queryPOSTVM")
    public JAXBElement<QueryPOSTVM> createQueryPOSTVM(QueryPOSTVM value) {
        return new JAXBElement<QueryPOSTVM>(_QueryPOSTVM_QNAME, QueryPOSTVM.class, null, value);
    }

}
