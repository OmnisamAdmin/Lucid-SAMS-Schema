
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
 *         &lt;element name="AccID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AccName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="250"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AccAfrName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="250"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AccMerits" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AccOfficialID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "accID",
    "accName",
    "accAfrName",
    "accMerits",
    "accOfficialID",
    "recSelected",
    "recLocked"
})
@XmlRootElement(name = "ExtraMuralsAccolades")
public class ExtraMuralsAccolades {

    @XmlElement(name = "AccID")
    protected int accID;
    @XmlElement(name = "AccName")
    protected String accName;
    @XmlElement(name = "AccAfrName")
    protected String accAfrName;
    @XmlElement(name = "AccMerits")
    protected Integer accMerits;
    @XmlElement(name = "AccOfficialID")
    protected Integer accOfficialID;
    @XmlElement(name = "RecSelected")
    protected boolean recSelected;
    @XmlElement(name = "RecLocked")
    protected boolean recLocked;

    /**
     * Gets the value of the accID property.
     * 
     */
    public int getAccID() {
        return accID;
    }

    /**
     * Sets the value of the accID property.
     * 
     */
    public void setAccID(int value) {
        this.accID = value;
    }

    /**
     * Gets the value of the accName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccName() {
        return accName;
    }

    /**
     * Sets the value of the accName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccName(String value) {
        this.accName = value;
    }

    /**
     * Gets the value of the accAfrName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccAfrName() {
        return accAfrName;
    }

    /**
     * Sets the value of the accAfrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccAfrName(String value) {
        this.accAfrName = value;
    }

    /**
     * Gets the value of the accMerits property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccMerits() {
        return accMerits;
    }

    /**
     * Sets the value of the accMerits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccMerits(Integer value) {
        this.accMerits = value;
    }

    /**
     * Gets the value of the accOfficialID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccOfficialID() {
        return accOfficialID;
    }

    /**
     * Sets the value of the accOfficialID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccOfficialID(Integer value) {
        this.accOfficialID = value;
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
