
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
 *         &lt;element name="YearPromoted" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Processed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Grade" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Passed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Repeats" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Gender" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NotPromoted" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "yearPromoted",
    "processed",
    "grade",
    "passed",
    "repeats",
    "gender",
    "notPromoted"
})
@XmlRootElement(name = "Promotions")
public class Promotions {

    @XmlElement(name = "YearPromoted")
    protected String yearPromoted;
    @XmlElement(name = "Processed")
    protected boolean processed;
    @XmlElement(name = "Grade")
    protected Integer grade;
    @XmlElement(name = "Passed")
    protected Integer passed;
    @XmlElement(name = "Repeats")
    protected Integer repeats;
    @XmlElement(name = "Gender")
    protected String gender;
    @XmlElement(name = "NotPromoted")
    protected Integer notPromoted;

    /**
     * Gets the value of the yearPromoted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearPromoted() {
        return yearPromoted;
    }

    /**
     * Sets the value of the yearPromoted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearPromoted(String value) {
        this.yearPromoted = value;
    }

    /**
     * Gets the value of the processed property.
     * 
     */
    public boolean isProcessed() {
        return processed;
    }

    /**
     * Sets the value of the processed property.
     * 
     */
    public void setProcessed(boolean value) {
        this.processed = value;
    }

    /**
     * Gets the value of the grade property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGrade() {
        return grade;
    }

    /**
     * Sets the value of the grade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGrade(Integer value) {
        this.grade = value;
    }

    /**
     * Gets the value of the passed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPassed() {
        return passed;
    }

    /**
     * Sets the value of the passed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPassed(Integer value) {
        this.passed = value;
    }

    /**
     * Gets the value of the repeats property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRepeats() {
        return repeats;
    }

    /**
     * Sets the value of the repeats property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRepeats(Integer value) {
        this.repeats = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the notPromoted property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNotPromoted() {
        return notPromoted;
    }

    /**
     * Sets the value of the notPromoted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNotPromoted(Integer value) {
        this.notPromoted = value;
    }

}
