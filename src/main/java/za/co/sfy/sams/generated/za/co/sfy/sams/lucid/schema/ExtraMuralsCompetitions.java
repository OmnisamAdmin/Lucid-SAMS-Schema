
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
 *         &lt;element name="CompID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ExID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CompName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="250"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CompAfrName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="250"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CompPicture" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary"&gt;
 *               &lt;maxLength value="1476395008"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CompOfficialID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "compID",
    "exID",
    "compName",
    "compAfrName",
    "compPicture",
    "compOfficialID",
    "recSelected",
    "recLocked"
})
@XmlRootElement(name = "ExtraMuralsCompetitions")
public class ExtraMuralsCompetitions {

    @XmlElement(name = "CompID")
    protected int compID;
    @XmlElement(name = "ExID")
    protected Integer exID;
    @XmlElement(name = "CompName")
    protected String compName;
    @XmlElement(name = "CompAfrName")
    protected String compAfrName;
    @XmlElement(name = "CompPicture")
    protected byte[] compPicture;
    @XmlElement(name = "CompOfficialID")
    protected Integer compOfficialID;
    @XmlElement(name = "RecSelected")
    protected boolean recSelected;
    @XmlElement(name = "RecLocked")
    protected boolean recLocked;

    /**
     * Gets the value of the compID property.
     * 
     */
    public int getCompID() {
        return compID;
    }

    /**
     * Sets the value of the compID property.
     * 
     */
    public void setCompID(int value) {
        this.compID = value;
    }

    /**
     * Gets the value of the exID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExID() {
        return exID;
    }

    /**
     * Sets the value of the exID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExID(Integer value) {
        this.exID = value;
    }

    /**
     * Gets the value of the compName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompName() {
        return compName;
    }

    /**
     * Sets the value of the compName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompName(String value) {
        this.compName = value;
    }

    /**
     * Gets the value of the compAfrName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompAfrName() {
        return compAfrName;
    }

    /**
     * Sets the value of the compAfrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompAfrName(String value) {
        this.compAfrName = value;
    }

    /**
     * Gets the value of the compPicture property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCompPicture() {
        return compPicture;
    }

    /**
     * Sets the value of the compPicture property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCompPicture(byte[] value) {
        this.compPicture = value;
    }

    /**
     * Gets the value of the compOfficialID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCompOfficialID() {
        return compOfficialID;
    }

    /**
     * Sets the value of the compOfficialID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCompOfficialID(Integer value) {
        this.compOfficialID = value;
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
