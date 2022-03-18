
package za.co.sfy.sams;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="Learnerid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Subjectid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CriterionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Datayear" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Mark" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Comments" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="250"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DateAdded" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Criterionscore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OBEsymbol" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EvalVer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="RecId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "learnerid",
    "subjectid",
    "criterionId",
    "datayear",
    "mark",
    "comments",
    "dateAdded",
    "criterionscore",
    "obEsymbol",
    "evalVer",
    "status",
    "recId"
})
@XmlRootElement(name = "_x0031_7_3_0_LearnerCass")
public class X0031730LearnerCass {

    @XmlElement(name = "Learnerid")
    protected Integer learnerid;
    @XmlElement(name = "Subjectid")
    protected Integer subjectid;
    @XmlElement(name = "CriterionId")
    protected Integer criterionId;
    @XmlElement(name = "Datayear")
    protected String datayear;
    @XmlElement(name = "Mark")
    protected Double mark;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "DateAdded")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAdded;
    @XmlElement(name = "Criterionscore")
    protected Integer criterionscore;
    @XmlElement(name = "OBEsymbol")
    protected Integer obEsymbol;
    @XmlElement(name = "EvalVer")
    protected Integer evalVer;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "unsignedByte")
    protected Short status;
    @XmlElement(name = "RecId")
    protected int recId;

    /**
     * Gets the value of the learnerid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLearnerid() {
        return learnerid;
    }

    /**
     * Sets the value of the learnerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLearnerid(Integer value) {
        this.learnerid = value;
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
     * Gets the value of the criterionId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCriterionId() {
        return criterionId;
    }

    /**
     * Sets the value of the criterionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCriterionId(Integer value) {
        this.criterionId = value;
    }

    /**
     * Gets the value of the datayear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatayear() {
        return datayear;
    }

    /**
     * Sets the value of the datayear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatayear(String value) {
        this.datayear = value;
    }

    /**
     * Gets the value of the mark property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMark() {
        return mark;
    }

    /**
     * Sets the value of the mark property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMark(Double value) {
        this.mark = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the dateAdded property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAdded() {
        return dateAdded;
    }

    /**
     * Sets the value of the dateAdded property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAdded(XMLGregorianCalendar value) {
        this.dateAdded = value;
    }

    /**
     * Gets the value of the criterionscore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCriterionscore() {
        return criterionscore;
    }

    /**
     * Sets the value of the criterionscore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCriterionscore(Integer value) {
        this.criterionscore = value;
    }

    /**
     * Gets the value of the obEsymbol property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOBEsymbol() {
        return obEsymbol;
    }

    /**
     * Sets the value of the obEsymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOBEsymbol(Integer value) {
        this.obEsymbol = value;
    }

    /**
     * Gets the value of the evalVer property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEvalVer() {
        return evalVer;
    }

    /**
     * Sets the value of the evalVer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEvalVer(Integer value) {
        this.evalVer = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setStatus(Short value) {
        this.status = value;
    }

    /**
     * Gets the value of the recId property.
     * 
     */
    public int getRecId() {
        return recId;
    }

    /**
     * Sets the value of the recId property.
     * 
     */
    public void setRecId(int value) {
        this.recId = value;
    }

}
