//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.06.02 at 01:01:41 PM EST 
//


package org.yawlfoundation.sb.callsheetinfo;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for singleLocationContactInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="singleLocationContactInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="setName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UBDref" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="locationContact" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unitBase" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "singleLocationContactInfoType", propOrder = {
    "number",
    "setName",
    "location",
    "address",
    "ubDref",
    "locationContact",
    "unitBase"
})
public class SingleLocationContactInfoType {

    @XmlElement(required = true)
    protected BigInteger number;
    @XmlElement(required = true)
    protected String setName;
    @XmlElement(required = true)
    protected String location;
    @XmlElement(required = true)
    protected String address;
    @XmlElement(name = "UBDref", required = true)
    protected String ubDref;
    @XmlElement(required = true)
    protected String locationContact;
    @XmlElement(required = true)
    protected String unitBase;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumber(BigInteger value) {
        this.number = value;
    }

    /**
     * Gets the value of the setName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetName() {
        return setName;
    }

    /**
     * Sets the value of the setName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetName(String value) {
        this.setName = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the ubDref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUBDref() {
        return ubDref;
    }

    /**
     * Sets the value of the ubDref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUBDref(String value) {
        this.ubDref = value;
    }

    /**
     * Gets the value of the locationContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationContact() {
        return locationContact;
    }

    /**
     * Sets the value of the locationContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationContact(String value) {
        this.locationContact = value;
    }

    /**
     * Gets the value of the unitBase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitBase() {
        return unitBase;
    }

    /**
     * Sets the value of the unitBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitBase(String value) {
        this.unitBase = value;
    }

}
