
package com.hera.carwebshop.endpoints;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "result"
})
@XmlRootElement(name = "SellCarsResponse", namespace = "http://localhost:8080")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-03-08T02:57:03+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class SellCarsResponse {

    @XmlElement(namespace = "http://localhost:8080", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-03-08T02:57:03+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-03-08T02:57:03+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-03-08T02:57:03+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setResult(String value) {
        this.result = value;
    }

}
