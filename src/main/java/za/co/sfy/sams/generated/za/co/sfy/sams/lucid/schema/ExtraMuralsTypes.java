
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
 *         &lt;element name="ExTypeID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ExTypeName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="250"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ExTypeAfrName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="250"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ExTypeShortName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ExTypeShortAfrName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ExTypePicKey" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ExTypePicture" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary"&gt;
 *               &lt;maxLength value="1476395008"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ExTypeOfficialID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "exTypeID",
    "exTypeName",
    "exTypeAfrName",
    "exTypeShortName",
    "exTypeShortAfrName",
    "exTypePicKey",
    "exTypePicture",
    "exTypeOfficialID",
    "recSelected",
    "recLocked"
})
@XmlRootElement(name = "ExtraMuralsTypes")
public class ExtraMuralsTypes {

    @XmlElement(name = "ExTypeID")
    protected int exTypeID;
    @XmlElement(name = "ExTypeName")
    protected String exTypeName;
    @XmlElement(name = "ExTypeAfrName")
    protected String exTypeAfrName;
    @XmlElement(name = "ExTypeShortName")
    protected String exTypeShortName;
    @XmlElement(name = "ExTypeShortAfrName")
    protected String exTypeShortAfrName;
    @XmlElement(name = "ExTypePicKey")
    protected String exTypePicKey;
    @XmlElement(name = "ExTypePicture")
    protected byte[] exTypePicture;
    @XmlElement(name = "ExTypeOfficialID")
    protected Integer exTypeOfficialID;
    @XmlElement(name = "RecSelected")
    protected boolean recSelected;
    @XmlElement(name = "RecLocked")
    protected boolean recLocked;

    /**
     * Gets the value of the exTypeID property.
     * 
     */
    public int getExTypeID() {
        return exTypeID;
    }

    /**
     * Sets the value of the exTypeID property.
     * 
     */
    public void setExTypeID(int value) {
        this.exTypeID = value;
    }

    /**
     * Gets the value of the exTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExTypeName() {
        return exTypeName;
    }

    /**
     * Sets the value of the exTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExTypeName(String value) {
        this.exTypeName = value;
    }

    /**
     * Gets the value of the exTypeAfrName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExTypeAfrName() {
        return exTypeAfrName;
    }

    /**
     * Sets the value of the exTypeAfrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExTypeAfrName(String value) {
        this.exTypeAfrName = value;
    }

    /**
     * Gets the value of the exTypeShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExTypeShortName() {
        return exTypeShortName;
    }

    /**
     * Sets the value of the exTypeShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExTypeShortName(String value) {
        this.exTypeShortName = value;
    }

    /**
     * Gets the value of the exTypeShortAfrName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExTypeShortAfrName() {
        return exTypeShortAfrName;
    }

    /**
     * Sets the value of the exTypeShortAfrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExTypeShortAfrName(String value) {
        this.exTypeShortAfrName = value;
    }

    /**
     * Gets the value of the exTypePicKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExTypePicKey() {
        return exTypePicKey;
    }

    /**
     * Sets the value of the exTypePicKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExTypePicKey(String value) {
        this.exTypePicKey = value;
    }

    /**
     * Gets the value of the exTypePicture property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getExTypePicture() {
        return exTypePicture;
    }

    /**
     * Sets the value of the exTypePicture property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setExTypePicture(byte[] value) {
        this.exTypePicture = value;
    }

    /**
     * Gets the value of the exTypeOfficialID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExTypeOfficialID() {
        return exTypeOfficialID;
    }

    /**
     * Sets the value of the exTypeOfficialID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExTypeOfficialID(Integer value) {
        this.exTypeOfficialID = value;
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
