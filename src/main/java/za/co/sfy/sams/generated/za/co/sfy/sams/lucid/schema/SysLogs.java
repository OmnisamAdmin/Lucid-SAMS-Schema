
package za.co.sfy.sams.lucid.schema;

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
 *         &lt;element name="LogID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LogTypeNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LogDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LogUserID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LogLinkID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LogLinkIDs" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="250"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LogData" minOccurs="0"&gt;
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
    "logID",
    "logTypeNo",
    "logDateTime",
    "logUserID",
    "logLinkID",
    "logLinkIDs",
    "logData"
})
@XmlRootElement(name = "SysLogs")
public class SysLogs {

    @XmlElement(name = "LogID")
    protected int logID;
    @XmlElement(name = "LogTypeNo")
    protected Integer logTypeNo;
    @XmlElement(name = "LogDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar logDateTime;
    @XmlElement(name = "LogUserID")
    protected Integer logUserID;
    @XmlElement(name = "LogLinkID")
    protected Integer logLinkID;
    @XmlElement(name = "LogLinkIDs")
    protected String logLinkIDs;
    @XmlElement(name = "LogData")
    protected String logData;

    /**
     * Gets the value of the logID property.
     * 
     */
    public int getLogID() {
        return logID;
    }

    /**
     * Sets the value of the logID property.
     * 
     */
    public void setLogID(int value) {
        this.logID = value;
    }

    /**
     * Gets the value of the logTypeNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLogTypeNo() {
        return logTypeNo;
    }

    /**
     * Sets the value of the logTypeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLogTypeNo(Integer value) {
        this.logTypeNo = value;
    }

    /**
     * Gets the value of the logDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLogDateTime() {
        return logDateTime;
    }

    /**
     * Sets the value of the logDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLogDateTime(XMLGregorianCalendar value) {
        this.logDateTime = value;
    }

    /**
     * Gets the value of the logUserID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLogUserID() {
        return logUserID;
    }

    /**
     * Sets the value of the logUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLogUserID(Integer value) {
        this.logUserID = value;
    }

    /**
     * Gets the value of the logLinkID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLogLinkID() {
        return logLinkID;
    }

    /**
     * Sets the value of the logLinkID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLogLinkID(Integer value) {
        this.logLinkID = value;
    }

    /**
     * Gets the value of the logLinkIDs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogLinkIDs() {
        return logLinkIDs;
    }

    /**
     * Sets the value of the logLinkIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogLinkIDs(String value) {
        this.logLinkIDs = value;
    }

    /**
     * Gets the value of the logData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogData() {
        return logData;
    }

    /**
     * Sets the value of the logData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogData(String value) {
        this.logData = value;
    }

}
