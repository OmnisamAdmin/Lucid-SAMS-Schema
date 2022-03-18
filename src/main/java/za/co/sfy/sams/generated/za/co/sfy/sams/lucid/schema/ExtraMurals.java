
package za.co.sfy.sams.lucid.schema;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ExTypeID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ExName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="250"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ExAfrName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="250"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ExPicKey" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ExPicture" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary"&gt;
 *               &lt;maxLength value="1476395008"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ExOfficialID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RecSelected" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="RecLocked" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "exID",
    "exTypeID",
    "exName",
    "exAfrName",
    "exPicKey",
    "exPicture",
    "exOfficialID",
    "recSelected",
    "recLocked"
})
@XmlRootElement(name = "ExtraMurals")
public class ExtraMurals {

    @XmlElement(name = "ExID")
    protected int exID;
    @XmlElement(name = "ExTypeID")
    protected Integer exTypeID;
    @XmlElement(name = "ExName")
    protected String exName;
    @XmlElement(name = "ExAfrName")
    protected String exAfrName;
    @XmlElement(name = "ExPicKey")
    protected String exPicKey;
    @XmlElement(name = "ExPicture")
    protected byte[] exPicture;
    @XmlElement(name = "ExOfficialID")
    protected Integer exOfficialID;
    @XmlElement(name = "RecSelected")
    protected boolean recSelected;
    @XmlElement(name = "RecLocked")
    protected boolean recLocked;

    /**
     * Gets the value of the exID property.
     * 
     */
    public int getExID() {
        return exID;
    }

    /**
     * Sets the value of the exID property.
     * 
     */
    public void setExID(int value) {
        this.exID = value;
    }

    /**
     * Gets the value of the exTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExTypeID() {
        return exTypeID;
    }

    /**
     * Sets the value of the exTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExTypeID(Integer value) {
        this.exTypeID = value;
    }

    /**
     * Gets the value of the exName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExName() {
        return exName;
    }

    /**
     * Sets the value of the exName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExName(String value) {
        this.exName = value;
    }

    /**
     * Gets the value of the exAfrName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExAfrName() {
        return exAfrName;
    }

    /**
     * Sets the value of the exAfrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExAfrName(String value) {
        this.exAfrName = value;
    }

    /**
     * Gets the value of the exPicKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExPicKey() {
        return exPicKey;
    }

    /**
     * Sets the value of the exPicKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExPicKey(String value) {
        this.exPicKey = value;
    }

    /**
     * Gets the value of the exPicture property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getExPicture() {
        return exPicture;
    }

    /**
     * Sets the value of the exPicture property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setExPicture(byte[] value) {
        this.exPicture = value;
    }

    /**
     * Gets the value of the exOfficialID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExOfficialID() {
        return exOfficialID;
    }

    /**
     * Sets the value of the exOfficialID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExOfficialID(Integer value) {
        this.exOfficialID = value;
    }

    /**
     * Gets the value of the recSelected property.
     * 
     */
    public boolean isRecSelected() {
        return recSelected;
    }

    /**
     * Sets the value of the recSelected property.
     * 
     */
    public void setRecSelected(boolean value) {
        this.recSelected = value;
    }

    /**
     * Gets the value of the recLocked property.
     * 
     */
    public boolean isRecLocked() {
        return recLocked;
    }

    /**
     * Sets the value of the recLocked property.
     * 
     */
    public void setRecLocked(boolean value) {
        this.recLocked = value;
    }

}
