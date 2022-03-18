
package za.co.sfy.sams.lucid.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="HasConnectivityTL" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="HasConnectivityadmin" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="ConSpeed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Broadband" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ADSL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="_x0033_GOr4GOrLTE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Other" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Data_Year" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnectivitySpeed" minOccurs="0"&gt;
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
    "id",
    "hasConnectivityTL",
    "hasConnectivityadmin",
    "conSpeed",
    "broadband",
    "adsl",
    "x0033GOr4GOrLTE",
    "other",
    "dataYear",
    "connectivitySpeed"
})
@XmlRootElement(name = "ICTEConnectivityRecords")
public class ICTEConnectivityRecords {

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "HasConnectivityTL")
    @XmlSchemaType(name = "unsignedByte")
    protected Short hasConnectivityTL;
    @XmlElement(name = "HasConnectivityadmin")
    @XmlSchemaType(name = "unsignedByte")
    protected Short hasConnectivityadmin;
    @XmlElement(name = "ConSpeed")
    protected Integer conSpeed;
    @XmlElement(name = "Broadband")
    protected String broadband;
    @XmlElement(name = "ADSL")
    protected String adsl;
    @XmlElement(name = "_x0033_GOr4GOrLTE")
    protected String x0033GOr4GOrLTE;
    @XmlElement(name = "Other")
    protected String other;
    @XmlElement(name = "Data_Year")
    protected Integer dataYear;
    @XmlElement(name = "ConnectivitySpeed")
    protected String connectivitySpeed;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setID(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the hasConnectivityTL property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getHasConnectivityTL() {
        return hasConnectivityTL;
    }

    /**
     * Sets the value of the hasConnectivityTL property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setHasConnectivityTL(Short value) {
        this.hasConnectivityTL = value;
    }

    /**
     * Gets the value of the hasConnectivityadmin property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getHasConnectivityadmin() {
        return hasConnectivityadmin;
    }

    /**
     * Sets the value of the hasConnectivityadmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setHasConnectivityadmin(Short value) {
        this.hasConnectivityadmin = value;
    }

    /**
     * Gets the value of the conSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConSpeed() {
        return conSpeed;
    }

    /**
     * Sets the value of the conSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConSpeed(Integer value) {
        this.conSpeed = value;
    }

    /**
     * Gets the value of the broadband property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBroadband() {
        return broadband;
    }

    /**
     * Sets the value of the broadband property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBroadband(String value) {
        this.broadband = value;
    }

    /**
     * Gets the value of the adsl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADSL() {
        return adsl;
    }

    /**
     * Sets the value of the adsl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADSL(String value) {
        this.adsl = value;
    }

    /**
     * Gets the value of the x0033GOr4GOrLTE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX0033GOr4GOrLTE() {
        return x0033GOr4GOrLTE;
    }

    /**
     * Sets the value of the x0033GOr4GOrLTE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX0033GOr4GOrLTE(String value) {
        this.x0033GOr4GOrLTE = value;
    }

    /**
     * Gets the value of the other property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOther(String value) {
        this.other = value;
    }

    /**
     * Gets the value of the dataYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDataYear() {
        return dataYear;
    }

    /**
     * Sets the value of the dataYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDataYear(Integer value) {
        this.dataYear = value;
    }

    /**
     * Gets the value of the connectivitySpeed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectivitySpeed() {
        return connectivitySpeed;
    }

    /**
     * Sets the value of the connectivitySpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectivitySpeed(String value) {
        this.connectivitySpeed = value;
    }

}
