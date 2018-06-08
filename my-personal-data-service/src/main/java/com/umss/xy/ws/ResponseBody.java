
package com.umss.xy.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseBody complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseBody">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="persons" type="{http://ws.xy.umss.com/}Persons" minOccurs="0"/>
 *         &lt;element name="cars" type="{http://ws.xy.umss.com/}Cars" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseBody", propOrder = {
    "persons",
    "cars"
})
public class ResponseBody {

    protected Persons persons;
    protected Cars cars;

    /**
     * Gets the value of the persons property.
     * 
     * @return
     *     possible object is
     *     {@link Persons }
     *     
     */
    public Persons getPersons() {
        return persons;
    }

    /**
     * Sets the value of the persons property.
     * 
     * @param value
     *     allowed object is
     *     {@link Persons }
     *     
     */
    public void setPersons(Persons value) {
        this.persons = value;
    }

    /**
     * Gets the value of the cars property.
     * 
     * @return
     *     possible object is
     *     {@link Cars }
     *     
     */
    public Cars getCars() {
        return cars;
    }

    /**
     * Sets the value of the cars property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cars }
     *     
     */
    public void setCars(Cars value) {
        this.cars = value;
    }

}
