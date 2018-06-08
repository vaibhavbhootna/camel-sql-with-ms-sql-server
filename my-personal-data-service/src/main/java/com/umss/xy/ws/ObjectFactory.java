
package com.umss.xy.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.umss.xy.ws package. 
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

    private final static QName _GetPersonData_QNAME = new QName("http://ws.xy.umss.com/", "getPersonData");
    private final static QName _GetAllCars_QNAME = new QName("http://ws.xy.umss.com/", "getAllCars");
    private final static QName _GetAllCarsFault_QNAME = new QName("http://ws.xy.umss.com/", "getAllCarsFault");
    private final static QName _GetPersonDataResponse_QNAME = new QName("http://ws.xy.umss.com/", "getPersonDataResponse");
    private final static QName _GetMyCarResponse_QNAME = new QName("http://ws.xy.umss.com/", "getMyCarResponse");
    private final static QName _GetAllCarsResponse_QNAME = new QName("http://ws.xy.umss.com/", "getAllCarsResponse");
    private final static QName _GetMyCar_QNAME = new QName("http://ws.xy.umss.com/", "getMyCar");
    private final static QName _GetMyCarFault_QNAME = new QName("http://ws.xy.umss.com/", "getMyCarFault");
    private final static QName _GetPersonDataFault_QNAME = new QName("http://ws.xy.umss.com/", "getPersonDataFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.umss.xy.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPersonData }
     * 
     */
    public GetPersonData createGetPersonData() {
        return new GetPersonData();
    }

    /**
     * Create an instance of {@link PersonalDataFault }
     * 
     */
    public PersonalDataFault createPersonalDataFault() {
        return new PersonalDataFault();
    }

    /**
     * Create an instance of {@link GetAllCars }
     * 
     */
    public GetAllCars createGetAllCars() {
        return new GetAllCars();
    }

    /**
     * Create an instance of {@link GetMyCarResponse }
     * 
     */
    public GetMyCarResponse createGetMyCarResponse() {
        return new GetMyCarResponse();
    }

    /**
     * Create an instance of {@link GetPersonDataResponse }
     * 
     */
    public GetPersonDataResponse createGetPersonDataResponse() {
        return new GetPersonDataResponse();
    }

    /**
     * Create an instance of {@link GetAllCarsResponse }
     * 
     */
    public GetAllCarsResponse createGetAllCarsResponse() {
        return new GetAllCarsResponse();
    }

    /**
     * Create an instance of {@link GetMyCar }
     * 
     */
    public GetMyCar createGetMyCar() {
        return new GetMyCar();
    }

    /**
     * Create an instance of {@link ResponseHeader }
     * 
     */
    public ResponseHeader createResponseHeader() {
        return new ResponseHeader();
    }

    /**
     * Create an instance of {@link Persons }
     * 
     */
    public Persons createPersons() {
        return new Persons();
    }

    /**
     * Create an instance of {@link Color }
     * 
     */
    public Color createColor() {
        return new Color();
    }

    /**
     * Create an instance of {@link Car }
     * 
     */
    public Car createCar() {
        return new Car();
    }

    /**
     * Create an instance of {@link Cars }
     * 
     */
    public Cars createCars() {
        return new Cars();
    }

    /**
     * Create an instance of {@link ResponseBody }
     * 
     */
    public ResponseBody createResponseBody() {
        return new ResponseBody();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.xy.umss.com/", name = "getPersonData")
    public JAXBElement<GetPersonData> createGetPersonData(GetPersonData value) {
        return new JAXBElement<GetPersonData>(_GetPersonData_QNAME, GetPersonData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCars }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.xy.umss.com/", name = "getAllCars")
    public JAXBElement<GetAllCars> createGetAllCars(GetAllCars value) {
        return new JAXBElement<GetAllCars>(_GetAllCars_QNAME, GetAllCars.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonalDataFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.xy.umss.com/", name = "getAllCarsFault")
    public JAXBElement<PersonalDataFault> createGetAllCarsFault(PersonalDataFault value) {
        return new JAXBElement<PersonalDataFault>(_GetAllCarsFault_QNAME, PersonalDataFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.xy.umss.com/", name = "getPersonDataResponse")
    public JAXBElement<GetPersonDataResponse> createGetPersonDataResponse(GetPersonDataResponse value) {
        return new JAXBElement<GetPersonDataResponse>(_GetPersonDataResponse_QNAME, GetPersonDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMyCarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.xy.umss.com/", name = "getMyCarResponse")
    public JAXBElement<GetMyCarResponse> createGetMyCarResponse(GetMyCarResponse value) {
        return new JAXBElement<GetMyCarResponse>(_GetMyCarResponse_QNAME, GetMyCarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCarsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.xy.umss.com/", name = "getAllCarsResponse")
    public JAXBElement<GetAllCarsResponse> createGetAllCarsResponse(GetAllCarsResponse value) {
        return new JAXBElement<GetAllCarsResponse>(_GetAllCarsResponse_QNAME, GetAllCarsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMyCar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.xy.umss.com/", name = "getMyCar")
    public JAXBElement<GetMyCar> createGetMyCar(GetMyCar value) {
        return new JAXBElement<GetMyCar>(_GetMyCar_QNAME, GetMyCar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonalDataFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.xy.umss.com/", name = "getMyCarFault")
    public JAXBElement<PersonalDataFault> createGetMyCarFault(PersonalDataFault value) {
        return new JAXBElement<PersonalDataFault>(_GetMyCarFault_QNAME, PersonalDataFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonalDataFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.xy.umss.com/", name = "getPersonDataFault")
    public JAXBElement<PersonalDataFault> createGetPersonDataFault(PersonalDataFault value) {
        return new JAXBElement<PersonalDataFault>(_GetPersonDataFault_QNAME, PersonalDataFault.class, null, value);
    }

}
