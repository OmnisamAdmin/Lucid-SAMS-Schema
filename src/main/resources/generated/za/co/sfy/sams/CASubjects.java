
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
 *         &lt;element name="StructureId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SubjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SubjectLevel" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CassTotal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Grade" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "structureId",
    "subjectId",
    "subjectLevel",
    "cassTotal",
    "grade"
})
@XmlRootElement(name = "CASubjects")
public class CASubjects {

    @XmlElement(name = "StructureId")
    protected int structureId;
    @XmlElement(name = "SubjectId")
    protected Integer subjectId;
    @XmlElement(name = "SubjectLevel")
    protected String subjectLevel;
    @XmlElement(name = "CassTotal")
    protected Integer cassTotal;
    @XmlElement(name = "Grade")
    protected Integer grade;

    /**
     * Gets the value of the structureId property.
     * 
     */
    public int getStructureId() {
        return structureId;
    }

    /**
     * Sets the value of the structureId property.
     * 
     */
    public void setStructureId(int value) {
        this.structureId = value;
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

    /**
     * Gets the value of the cassTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCassTotal() {
        return cassTotal;
    }

    /**
     * Sets the value of the cassTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCassTotal(Integer value) {
        this.cassTotal = value;
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

}
