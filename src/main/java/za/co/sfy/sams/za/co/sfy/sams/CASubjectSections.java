
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
 *         &lt;element name="SectionId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Description" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SectionTotal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RawScoreTotal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Grade" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SectionHeading" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SubjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SubjectLevel" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
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
    "sectionId",
    "description",
    "sectionTotal",
    "rawScoreTotal",
    "grade",
    "active",
    "sectionHeading",
    "subjectId",
    "subjectLevel"
})
@XmlRootElement(name = "CASubjectSections")
public class CASubjectSections {

    @XmlElement(name = "SectionId")
    protected int sectionId;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "SectionTotal")
    protected Integer sectionTotal;
    @XmlElement(name = "RawScoreTotal")
    protected Integer rawScoreTotal;
    @XmlElement(name = "Grade")
    protected Integer grade;
    @XmlElement(name = "Active")
    protected boolean active;
    @XmlElement(name = "SectionHeading")
    protected String sectionHeading;
    @XmlElement(name = "SubjectId")
    protected Integer subjectId;
    @XmlElement(name = "SubjectLevel")
    protected String subjectLevel;

    /**
     * Gets the value of the sectionId property.
     * 
     */
    public int getSectionId() {
        return sectionId;
    }

    /**
     * Sets the value of the sectionId property.
     * 
     */
    public void setSectionId(int value) {
        this.sectionId = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the sectionTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSectionTotal() {
        return sectionTotal;
    }

    /**
     * Sets the value of the sectionTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSectionTotal(Integer value) {
        this.sectionTotal = value;
    }

    /**
     * Gets the value of the rawScoreTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRawScoreTotal() {
        return rawScoreTotal;
    }

    /**
     * Sets the value of the rawScoreTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRawScoreTotal(Integer value) {
        this.rawScoreTotal = value;
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
     * Gets the value of the active property.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the sectionHeading property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionHeading() {
        return sectionHeading;
    }

    /**
     * Sets the value of the sectionHeading property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionHeading(String value) {
        this.sectionHeading = value;
    }

    /**
     * Gets the value of the subjectId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubjectId() {
        return subjectId;
    }

    /**
     * Sets the value of the subjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubjectId(Integer value) {
        this.subjectId = value;
    }

    /**
     * Gets the value of the subjectLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectLevel() {
        return subjectLevel;
    }

    /**
     * Sets the value of the subjectLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectLevel(String value) {
        this.subjectLevel = value;
    }

}
