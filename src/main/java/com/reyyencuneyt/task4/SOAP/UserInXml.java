package com.reyyencuneyt.task4.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userInXml complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="UserInXml">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserInXml", namespace = "http://com.reyyencuneyt.task4/SOAP", propOrder = {
        "id",
        "name",
        "email",
        "password"
})
public class UserInXml {
    @XmlElement(namespace = "http://com.reyyencuneyt.task4/SOAP")
    protected int id;
    @XmlElement(namespace = "http://com.reyyencuneyt.task4/SOAP")
    protected String name;
    @XmlElement(namespace = "http://com.reyyencuneyt.task4/SOAP")
    protected String email;
    @XmlElement(namespace = "http://com.reyyencuneyt.task4/SOAP")
    protected String password;

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the empId property.
     *
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the empId property.
     *
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the value of the salary property.
     *
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the salary property.
     *
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
