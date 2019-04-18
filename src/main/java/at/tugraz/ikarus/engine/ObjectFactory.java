
package at.tugraz.ikarus.engine;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the CoreWS.wsdl package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
class ObjectFactory {

    private final static QName _GetResponse_QNAME = new QName("http://ikarus.me.org/", "getResponse");
    private final static QName _Deletecoll_QNAME = new QName("http://ikarus.me.org/", "deletecoll");
    private final static QName _Getcoll_QNAME = new QName("http://ikarus.me.org/", "getcoll");
    private final static QName _Delete_QNAME = new QName("http://ikarus.me.org/", "delete");
    private final static QName _DeletecollResponse_QNAME = new QName("http://ikarus.me.org/", "deletecollResponse");
    private final static QName _GetcollResponse_QNAME = new QName("http://ikarus.me.org/", "getcollResponse");
    private final static QName _Makecoll_QNAME = new QName("http://ikarus.me.org/", "makecoll");
    private final static QName _Store_QNAME = new QName("http://ikarus.me.org/", "store");
    private final static QName _ResetResponse_QNAME = new QName("http://ikarus.me.org/", "resetResponse");
    private final static QName _StoreResponse_QNAME = new QName("http://ikarus.me.org/", "storeResponse");
    private final static QName _Get_QNAME = new QName("http://ikarus.me.org/", "get");
    private final static QName _MakecollResponse_QNAME = new QName("http://ikarus.me.org/", "makecollResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://ikarus.me.org/", "helloResponse");
    private final static QName _DeleteResponse_QNAME = new QName("http://ikarus.me.org/", "deleteResponse");
    private final static QName _InsertcollResponse_QNAME = new QName("http://ikarus.me.org/", "insertcollResponse");
    private final static QName _Removecoll_QNAME = new QName("http://ikarus.me.org/", "removecoll");
    private final static QName _RemovecollResponse_QNAME = new QName("http://ikarus.me.org/", "removecollResponse");
    private final static QName _Hello_QNAME = new QName("http://ikarus.me.org/", "hello");
    private final static QName _Reset_QNAME = new QName("http://ikarus.me.org/", "reset");
    private final static QName _Insertcoll_QNAME = new QName("http://ikarus.me.org/", "insertcoll");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: CoreWS.wsdl
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StoreResponse }
     */
    public StoreResponse createStoreResponse() {
        return new StoreResponse();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Get }
     */
    public Get createGet() {
        return new Get();
    }

    /**
     * Create an instance of {@link InsertcollResponse }
     */
    public InsertcollResponse createInsertcollResponse() {
        return new InsertcollResponse();
    }

    /**
     * Create an instance of {@link Getcoll }
     */
    public Getcoll createGetcoll() {
        return new Getcoll();
    }

    /**
     * Create an instance of {@link ResetResponse }
     */
    public ResetResponse createResetResponse() {
        return new ResetResponse();
    }

    /**
     * Create an instance of {@link Makecoll }
     */
    public Makecoll createMakecoll() {
        return new Makecoll();
    }

    /**
     * Create an instance of {@link Insertcoll }
     */
    public Insertcoll createInsertcoll() {
        return new Insertcoll();
    }

    /**
     * Create an instance of {@link Hello }
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link Reset }
     */
    public Reset createReset() {
        return new Reset();
    }

    /**
     * Create an instance of {@link Removecoll }
     */
    public Removecoll createRemovecoll() {
        return new Removecoll();
    }

    /**
     * Create an instance of {@link Store }
     */
    public Store createStore() {
        return new Store();
    }

    /**
     * Create an instance of {@link DeletecollResponse }
     */
    public DeletecollResponse createDeletecollResponse() {
        return new DeletecollResponse();
    }

    /**
     * Create an instance of {@link Deletecoll }
     */
    public Deletecoll createDeletecoll() {
        return new Deletecoll();
    }

    /**
     * Create an instance of {@link RemovecollResponse }
     */
    public RemovecollResponse createRemovecollResponse() {
        return new RemovecollResponse();
    }

    /**
     * Create an instance of {@link GetResponse }
     */
    public GetResponse createGetResponse() {
        return new GetResponse();
    }

    /**
     * Create an instance of {@link GetcollResponse }
     */
    public GetcollResponse createGetcollResponse() {
        return new GetcollResponse();
    }

    /**
     * Create an instance of {@link MakecollResponse }
     */
    public MakecollResponse createMakecollResponse() {
        return new MakecollResponse();
    }

    /**
     * Create an instance of {@link Delete }
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://ikarus.me.org/", name = "getResponse")
    public JAXBElement<GetResponse> createGetResponse(GetResponse value) {
        return new JAXBElement<>(_GetResponse_QNAME, GetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Deletecoll }{@code >}}
     */
    @XmlElementDecl(namespace = "http://ikarus.me.org/", name = "deletecoll")
    public JAXBElement<Deletecoll> createDeletecoll(Deletecoll value) {
        return new JAXBElement<>(_Deletecoll_QNAME, Deletecoll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Getcoll }{@code >}}
     */
    @XmlElementDecl(namespace = "http://ikarus.me.org/", name = "getcoll")
    public JAXBElement<Getcoll> createGetcoll(Getcoll value) {
        return new JAXBElement<>(_Getcoll_QNAME, Getcoll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     */
    @XmlElementDecl(namespace = "http://ikarus.me.org/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletecollResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://ikarus.me.org/", name = "deletecollResponse")
    public JAXBElement<DeletecollResponse> createDeletecollResponse(DeletecollResponse value) {
        return new JAXBElement<>(_DeletecollResponse_QNAME, DeletecollResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetcollResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://ikarus.me.org/", name = "getcollResponse")
    public JAXBElement<GetcollResponse> createGetcollResponse(GetcollResponse value) {
        return new JAXBElement<>(_GetcollResponse_QNAME, GetcollResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Makecoll }{@code >}}
     */
    @XmlElementDecl(namespace = "http://ikarus.me.org/", name = "makecoll")
    public JAXBElement<Makecoll> createMakecoll(Makecoll value) {
        return new JAXBElement<>(_Makecoll_QNAME, Makecoll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Store }{@code >}}
     */
    @XmlElementDecl(namespace = "http://ikarus.me.org/", name = "store")
    public JAXBElement<Store> createStore(Store value) {
        return new JAXBElement<>(_Store_QNAME, Store.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://ikarus.me.org/", name = "resetResponse")
    public JAXBElement<ResetResponse> createResetResponse(ResetResponse value) {
        return new JAXBElement<>(_ResetResponse_QNAME, ResetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://ikarus.me.org/", name = "storeResponse")
    public JAXBElement<StoreResponse> createStoreResponse(StoreResponse value) {
        return new JAXBElement<>(_StoreResponse_QNAME, StoreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Get }{@code >}}
     */
    @XmlElementDecl(namespace = "http://ikarus.me.org/", name = "get")
    public JAXBElement<Get> createGet(Get value) {
        return new JAXBElement<>(_Get_QNAME, Get.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakecollResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://ikarus.me.org/", name = "makecollResponse")
    public JAXBElement<MakecollResponse> createMakecollResponse(MakecollResponse value) {
        return new JAXBElement<>(_MakecollResponse_QNAME, MakecollResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://ikarus.me.org/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://ikarus.me.org/", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertcollResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://ikarus.me.org/", name = "insertcollResponse")
    public JAXBElement<InsertcollResponse> createInsertcollResponse(InsertcollResponse value) {
        return new JAXBElement<>(_InsertcollResponse_QNAME, InsertcollResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Removecoll }{@code >}}
     */
    @XmlElementDecl(namespace = "http://ikarus.me.org/", name = "removecoll")
    public JAXBElement<Removecoll> createRemovecoll(Removecoll value) {
        return new JAXBElement<>(_Removecoll_QNAME, Removecoll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovecollResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://ikarus.me.org/", name = "removecollResponse")
    public JAXBElement<RemovecollResponse> createRemovecollResponse(RemovecollResponse value) {
        return new JAXBElement<>(_RemovecollResponse_QNAME, RemovecollResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     */
    @XmlElementDecl(namespace = "http://ikarus.me.org/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Reset }{@code >}}
     */
    @XmlElementDecl(namespace = "http://ikarus.me.org/", name = "reset")
    public JAXBElement<Reset> createReset(Reset value) {
        return new JAXBElement<>(_Reset_QNAME, Reset.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Insertcoll }{@code >}}
     */
    @XmlElementDecl(namespace = "http://ikarus.me.org/", name = "insertcoll")
    public JAXBElement<Insertcoll> createInsertcoll(Insertcoll value) {
        return new JAXBElement<>(_Insertcoll_QNAME, Insertcoll.class, null, value);
    }

}
