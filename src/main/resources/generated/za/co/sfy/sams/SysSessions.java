
package za.co.sfy.sams;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SessionID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SessionDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="BusyDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="BusyWith" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ComputerInfo" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sessionID",
    "sessionDateTime",
    "userID",
    "busyDateTime",
    "busyWith",
    "computerInfo"
})
@XmlRootElement(name = "SysSessions")
public class SysSessions {

    @XmlElement(name = "SessionID")
    protected Integer sessionID;
    @XmlElement(name = "SessionDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sessionDateTime;
    @XmlElement(name = "UserID")
    protected Integer userID;
    @XmlElement(name = "BusyDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar busyDateTime;
    @XmlElement(name = "BusyWith")
    protected String busyWith;
    @XmlElement(name = "ComputerInfo")
    protected String computerInfo;

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSessionID(Integer value) {
        this.sessionID = value;
    }

    /**
     * Gets the value of the sessionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSessionDateTime() {
        return sessionDateTime;
    }

    /**
     * Sets the value of the sessionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSessionDateTime(XMLGregorianCalendar value) {
        this.sessionDateTime = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserID(Integer value) {
        this.userID = value;
    }

    /**
     * Gets the value of the busyDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBusyDateTime() {
        return busyDateTime;
    }

    /**
     * Sets the value of the busyDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBusyDateTime(XMLGregorianCalendar value) {
        this.busyDateTime = value;
    }

    /**
     * Gets the value of the busyWith property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusyWith() {
        return busyWith;
    }

    /**
     * Sets the value of the busyWith property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusyWith(String value) {
        this.busyWith = value;
    }

    /**
     * Gets the value of the computerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComputerInfo() {
        return computerInfo;
    }

    /**
     * Sets the value of the computerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComputerInfo(String value) {
        this.computerInfo = value;
    }

}
