
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
 *         &lt;element name="carId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cutomerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "carId",
    "cutomerId",
    "price",
    "amount"
})
@XmlRootElement(name = "SellCarsRequest", namespace = "http://localhost:8080")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-03-08T02:57:03+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class SellCarsRequest {

    @XmlElement(namespace = "http://localhost:8080")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-03-08T02:57:03+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected int carId;
    @XmlElement(namespace = "http://localhost:8080")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-03-08T02:57:03+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected int cutomerId;
    @XmlElement(namespace = "http://localhost:8080")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-03-08T02:57:03+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected int price;
    @XmlElement(namespace = "http://localhost:8080")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-03-08T02:57:03+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected int amount;

    /**
     * Gets the value of the carId property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-03-08T02:57:03+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public int getCarId() {
        return carId;
    }

    /**
     * Sets the value of the carId property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-03-08T02:57:03+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCarId(int value) {
        this.carId = value;
    }

    /**
     * Gets the value of the cutomerId property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-03-08T02:57:03+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public int getCutomerId() {
        return cutomerId;
    }

    /**
     * Sets the value of the cutomerId property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-03-08T02:57:03+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCutomerId(int value) {
        this.cutomerId = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-03-08T02:57:03+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public int getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-03-08T02:57:03+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPrice(int value) {
        this.price = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-03-08T02:57:03+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public int getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-03-08T02:57:03+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setAmount(int value) {
        this.amount = value;
    }

}
