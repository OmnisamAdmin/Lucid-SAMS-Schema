
package za.co.sfy.sams;

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
 *         &lt;element name="HseID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="HseName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="250"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HseAfrName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="250"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HseColour" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HseAfrColour" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HsePicture" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary"&gt;
 *               &lt;maxLength value="1476395008"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RecSelected" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "hseID",
    "hseName",
    "hseAfrName",
    "hseColour",
    "hseAfrColour",
    "hsePicture",
    "recSelected"
})
@XmlRootElement(name = "ExtraMuralsHouses")
public class ExtraMuralsHouses {

    @XmlElement(name = "HseID")
    protected int hseID;
    @XmlElement(name = "HseName")
    protected String hseName;
    @XmlElement(name = "HseAfrName")
    protected String hseAfrName;
    @XmlElement(name = "HseColour")
    protected String hseColour;
    @XmlElement(name = "HseAfrColour")
    protected String hseAfrColour;
    @XmlElement(name = "HsePicture")
    protected byte[] hsePicture;
    @XmlElement(name = "RecSelected")
    protected boolean recSelected;

    /**
     * Gets the value of the hseID property.
     * 
     */
    public int getHseID() {
        return hseID;
    }

    /**
     * Sets the value of the hseID property.
     * 
     */
    public void setHseID(int value) {
        this.hseID = value;
    }

    /**
     * Gets the value of the hseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHseName() {
        return hseName;
    }

    /**
     * Sets the value of the hseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHseName(String value) {
        this.hseName = value;
    }

    /**
     * Gets the value of the hseAfrName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHseAfrName() {
        return hseAfrName;
    }

    /**
     * Sets the value of the hseAfrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHseAfrName(String value) {
        this.hseAfrName = value;
    }

    /**
     * Gets the value of the hseColour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHseColour() {
        return hseColour;
    }

    /**
     * Sets the value of the hseColour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHseColour(String value) {
        this.hseColour = value;
    }

    /**
     * Gets the value of the hseAfrColour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHseAfrColour() {
        return hseAfrColour;
    }

    /**
     * Sets the value of the hseAfrColour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHseAfrColour(String value) {
        this.hseAfrColour = value;
    }

    /**
     * Gets the value of the hsePicture property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getHsePicture() {
        return hsePicture;
    }

    /**
     * Sets the value of the hsePicture property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setHsePicture(byte[] value) {
        this.hsePicture = value;
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

}
