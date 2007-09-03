//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.05.22 at 10:45:47 AM EST 
//


package org.yawlfoundation.sb.camerainfo;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for techInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="techInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cameraType_and_Number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stockNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="emulsion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="camRoll" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="totalCansNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="magNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "techInfoType", propOrder = {
    "cameraTypeAndNumber",
    "stockNumber",
    "emulsion",
    "camRoll",
    "totalCansNumber",
    "magNumber"
})
public class TechInfoType {

    @XmlElement(name = "cameraType_and_Number", required = true)
    protected String cameraTypeAndNumber;
    @XmlElement(required = true)
    protected String stockNumber;
    @XmlElement(required = true)
    protected String emulsion;
    @XmlElement(required = true)
    protected String camRoll;
    @XmlElement(required = true)
    protected BigInteger totalCansNumber;
    @XmlElement(required = true)
    protected String magNumber;

    /**
     * Gets the value of the cameraTypeAndNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCameraTypeAndNumber() {
        return cameraTypeAndNumber;
    }

    /**
     * Sets the value of the cameraTypeAndNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCameraTypeAndNumber(String value) {
        this.cameraTypeAndNumber = value;
    }

    /**
     * Gets the value of the stockNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockNumber() {
        return stockNumber;
    }

    /**
     * Sets the value of the stockNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockNumber(String value) {
        this.stockNumber = value;
    }

    /**
     * Gets the value of the emulsion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmulsion() {
        return emulsion;
    }

    /**
     * Sets the value of the emulsion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmulsion(String value) {
        this.emulsion = value;
    }

    /**
     * Gets the value of the camRoll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCamRoll() {
        return camRoll;
    }

    /**
     * Sets the value of the camRoll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCamRoll(String value) {
        this.camRoll = value;
    }

    /**
     * Gets the value of the totalCansNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalCansNumber() {
        return totalCansNumber;
    }

    /**
     * Sets the value of the totalCansNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalCansNumber(BigInteger value) {
        this.totalCansNumber = value;
    }

    /**
     * Gets the value of the magNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMagNumber() {
        return magNumber;
    }

    /**
     * Sets the value of the magNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMagNumber(String value) {
        this.magNumber = value;
    }

}
