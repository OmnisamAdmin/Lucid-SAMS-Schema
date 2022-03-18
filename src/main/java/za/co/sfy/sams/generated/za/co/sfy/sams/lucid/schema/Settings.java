
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
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="StatusI" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Reports" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="StatusC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FontColour" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="IPicture" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary"&gt;
 *               &lt;maxLength value="1476395008"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LearnerPhoto" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EducatorPhotographFolder" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LearnerPhotographFolder" minOccurs="0"&gt;
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
    "statusI",
    "reports",
    "statusC",
    "fontColour",
    "iPicture",
    "learnerPhoto",
    "educatorPhotographFolder",
    "learnerPhotographFolder"
})
@XmlRootElement(name = "Settings")
public class Settings {

    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "StatusI")
    protected String statusI;
    @XmlElement(name = "Reports")
    protected String reports;
    @XmlElement(name = "StatusC")
    protected String statusC;
    @XmlElement(name = "FontColour")
    protected Double fontColour;
    @XmlElement(name = "IPicture")
    protected byte[] iPicture;
    @XmlElement(name = "LearnerPhoto")
    protected String learnerPhoto;
    @XmlElement(name = "EducatorPhotographFolder")
    protected String educatorPhotographFolder;
    @XmlElement(name = "LearnerPhotographFolder")
    protected String learnerPhotographFolder;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the statusI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusI() {
        return statusI;
    }

    /**
     * Sets the value of the statusI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusI(String value) {
        this.statusI = value;
    }

    /**
     * Gets the value of the reports property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReports() {
        return reports;
    }

    /**
     * Sets the value of the reports property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReports(String value) {
        this.reports = value;
    }

    /**
     * Gets the value of the statusC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusC() {
        return statusC;
    }

    /**
     * Sets the value of the statusC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusC(String value) {
        this.statusC = value;
    }

    /**
     * Gets the value of the fontColour property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFontColour() {
        return fontColour;
    }

    /**
     * Sets the value of the fontColour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFontColour(Double value) {
        this.fontColour = value;
    }

    /**
     * Gets the value of the iPicture property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getIPicture() {
        return iPicture;
    }

    /**
     * Sets the value of the iPicture property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setIPicture(byte[] value) {
        this.iPicture = value;
    }

    /**
     * Gets the value of the learnerPhoto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearnerPhoto() {
        return learnerPhoto;
    }

    /**
     * Sets the value of the learnerPhoto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearnerPhoto(String value) {
        this.learnerPhoto = value;
    }

    /**
     * Gets the value of the educatorPhotographFolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducatorPhotographFolder() {
        return educatorPhotographFolder;
    }

    /**
     * Sets the value of the educatorPhotographFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducatorPhotographFolder(String value) {
        this.educatorPhotographFolder = value;
    }

    /**
     * Gets the value of the learnerPhotographFolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearnerPhotographFolder() {
        return learnerPhotographFolder;
    }

    /**
     * Sets the value of the learnerPhotographFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearnerPhotographFolder(String value) {
        this.learnerPhotographFolder = value;
    }

}
