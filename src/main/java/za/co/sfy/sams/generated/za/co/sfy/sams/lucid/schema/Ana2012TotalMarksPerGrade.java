
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
 *         &lt;element name="DataYear" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Grade" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="Max_HL" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Max_FAL" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Max_Math" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Avg_HL" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Avg_FAL" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Avg_Math" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "dataYear",
    "grade",
    "maxHL",
    "maxFAL",
    "maxMath",
    "avgHL",
    "avgFAL",
    "avgMath"
})
@XmlRootElement(name = "Ana2012TotalMarksPerGrade")
public class Ana2012TotalMarksPerGrade {

    @XmlElement(name = "DataYear")
    protected String dataYear;
    @XmlElement(name = "Grade")
    @XmlSchemaType(name = "unsignedByte")
    protected Short grade;
    @XmlElement(name = "Max_HL")
    protected Integer maxHL;
    @XmlElement(name = "Max_FAL")
    protected Integer maxFAL;
    @XmlElement(name = "Max_Math")
    protected Integer maxMath;
    @XmlElement(name = "Avg_HL")
    protected Integer avgHL;
    @XmlElement(name = "Avg_FAL")
    protected Integer avgFAL;
    @XmlElement(name = "Avg_Math")
    protected Integer avgMath;

    /**
     * Gets the value of the dataYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataYear() {
        return dataYear;
    }

    /**
     * Sets the value of the dataYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataYear(String value) {
        this.dataYear = value;
    }

    /**
     * Gets the value of the grade property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getGrade() {
        return grade;
    }

    /**
     * Sets the value of the grade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setGrade(Short value) {
        this.grade = value;
    }

    /**
     * Gets the value of the maxHL property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxHL() {
        return maxHL;
    }

    /**
     * Sets the value of the maxHL property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxHL(Integer value) {
        this.maxHL = value;
    }

    /**
     * Gets the value of the maxFAL property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxFAL() {
        return maxFAL;
    }

    /**
     * Sets the value of the maxFAL property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxFAL(Integer value) {
        this.maxFAL = value;
    }

    /**
     * Gets the value of the maxMath property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxMath() {
        return maxMath;
    }

    /**
     * Sets the value of the maxMath property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxMath(Integer value) {
        this.maxMath = value;
    }

    /**
     * Gets the value of the avgHL property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAvgHL() {
        return avgHL;
    }

    /**
     * Sets the value of the avgHL property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAvgHL(Integer value) {
        this.avgHL = value;
    }

    /**
     * Gets the value of the avgFAL property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAvgFAL() {
        return avgFAL;
    }

    /**
     * Sets the value of the avgFAL property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAvgFAL(Integer value) {
        this.avgFAL = value;
    }

    /**
     * Gets the value of the avgMath property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAvgMath() {
        return avgMath;
    }

    /**
     * Sets the value of the avgMath property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAvgMath(Integer value) {
        this.avgMath = value;
    }

}
