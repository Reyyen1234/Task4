package com.reyyencuneyt.task4.SOAP;

import javax.xml.bind.annotation.*;

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
 *         &lt;element name="user" type="{http://com.reyyencuneyt.task4/SOAP}user"/>
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
        "userInXml"
})
@XmlRootElement(name = "getUserResponse")

public class GetUserResponse {
    @XmlElement(required = true)
    protected UserInXml userInXml;

    /**
     * Gets the value of the user property.
     *
     * @return
     *     possible object is
     *     {@link UserInXml }
     *
     */
    public UserInXml getUser() {
        return userInXml;
    }

    /**
     * Sets the value of the user property.
     *
     * @param value
     *     allowed object is
     *     {@link UserInXml }
     *
     */
    public void setUser(UserInXml value) {
        this.userInXml = value;
    }
}
