//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.04.20 a las 10:17:36 PM CDT 
//


package https.t4is_uv_mx.agenda;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.t4is_uv_mx.agenda package. 
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

    private final static QName _BuscarRecordatorioRequest_QNAME = new QName("https://t4is.uv.mx/agenda", "BuscarRecordatorioRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.t4is_uv_mx.agenda
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarRecordatorioResponse }
     * 
     */
    public BuscarRecordatorioResponse createBuscarRecordatorioResponse() {
        return new BuscarRecordatorioResponse();
    }

    /**
     * Create an instance of {@link CrearRecordatorioRequest }
     * 
     */
    public CrearRecordatorioRequest createCrearRecordatorioRequest() {
        return new CrearRecordatorioRequest();
    }

    /**
     * Create an instance of {@link CrearRecordatorioResponse }
     * 
     */
    public CrearRecordatorioResponse createCrearRecordatorioResponse() {
        return new CrearRecordatorioResponse();
    }

    /**
     * Create an instance of {@link BuscarRecordatorioResponse.Agenda }
     * 
     */
    public BuscarRecordatorioResponse.Agenda createBuscarRecordatorioResponseAgenda() {
        return new BuscarRecordatorioResponse.Agenda();
    }

    /**
     * Create an instance of {@link ModificarRecordatorioRequest }
     * 
     */
    public ModificarRecordatorioRequest createModificarRecordatorioRequest() {
        return new ModificarRecordatorioRequest();
    }

    /**
     * Create an instance of {@link ModificarRecordatorioResponse }
     * 
     */
    public ModificarRecordatorioResponse createModificarRecordatorioResponse() {
        return new ModificarRecordatorioResponse();
    }

    /**
     * Create an instance of {@link BorrarRecordatorioRequest }
     * 
     */
    public BorrarRecordatorioRequest createBorrarRecordatorioRequest() {
        return new BorrarRecordatorioRequest();
    }

    /**
     * Create an instance of {@link BorrarRecordatorioResponse }
     * 
     */
    public BorrarRecordatorioResponse createBorrarRecordatorioResponse() {
        return new BorrarRecordatorioResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "https://t4is.uv.mx/agenda", name = "BuscarRecordatorioRequest")
    public JAXBElement<Object> createBuscarRecordatorioRequest(Object value) {
        return new JAXBElement<Object>(_BuscarRecordatorioRequest_QNAME, Object.class, null, value);
    }

}
