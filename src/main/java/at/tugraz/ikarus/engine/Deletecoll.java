//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.06 at 06:41:47 PM MSK 
//


package at.tugraz.ikarus.engine;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deletecoll complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="deletecoll">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deletecoll", propOrder = {
        "sid",
        "name"
})
@XmlRootElement
public class Deletecoll {

    protected String sid;
    protected String name;

    /**
     * Gets the value of the sid property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSid() {
        return sid;
    }

    /**
     * Sets the value of the sid property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSid(String value) {
        this.sid = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

}
