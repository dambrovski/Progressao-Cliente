
package edu.up.bsi.soap.progserver;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.up.bsi.soap.progserver package. 
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

    private final static QName _ProgressArit_QNAME = new QName("http://progserver.soap.bsi.up.edu/", "ProgressArit");
    private final static QName _ProgressAritResponse_QNAME = new QName("http://progserver.soap.bsi.up.edu/", "ProgressAritResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.up.bsi.soap.progserver
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProgressArit }
     * 
     */
    public ProgressArit createProgressArit() {
        return new ProgressArit();
    }

    /**
     * Create an instance of {@link ProgressAritResponse }
     * 
     */
    public ProgressAritResponse createProgressAritResponse() {
        return new ProgressAritResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgressArit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://progserver.soap.bsi.up.edu/", name = "ProgressArit")
    public JAXBElement<ProgressArit> createProgressArit(ProgressArit value) {
        return new JAXBElement<ProgressArit>(_ProgressArit_QNAME, ProgressArit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgressAritResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://progserver.soap.bsi.up.edu/", name = "ProgressAritResponse")
    public JAXBElement<ProgressAritResponse> createProgressAritResponse(ProgressAritResponse value) {
        return new JAXBElement<ProgressAritResponse>(_ProgressAritResponse_QNAME, ProgressAritResponse.class, null, value);
    }

}
