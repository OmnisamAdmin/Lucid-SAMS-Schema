
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
 *         &lt;element name="Educatorid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Subjectid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TrainingYears" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TeachingYears" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "educatorid",
    "subjectid",
    "trainingYears",
    "teachingYears"
})
@XmlRootElement(name = "SubjectSpecialisation")
public class SubjectSpecialisation {

    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "Educatorid")
    protected Integer educatorid;
    @XmlElement(name = "Subjectid")
    protected Integer subjectid;
    @XmlElement(name = "TrainingYears")
    protected Integer trainingYears;
    @XmlElement(name = "TeachingYears")
    protected Integer teachingYears;

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
     * Gets the value of the educatorid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEducatorid() {
        return educatorid;
    }

    /**
     * Sets the value of the educatorid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEducatorid(Integer value) {
        this.educatorid = value;
    }

    /**
     * Gets the value of the subjectid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubjectid() {
        return subjectid;
    }

    /**
     * Sets the value of the subjectid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubjectid(Integer value) {
        this.subjectid = value;
    }

    /**
     * Gets the value of the trainingYears property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTrainingYears() {
        return trainingYears;
    }

    /**
     * Sets the value of the trainingYears property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTrainingYears(Integer value) {
        this.trainingYears = value;
    }

    /**
     * Gets the value of the teachingYears property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTeachingYears() {
        return teachingYears;
    }

    /**
     * Sets the value of the teachingYears property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTeachingYears(Integer value) {
        this.teachingYears = value;
    }

}
