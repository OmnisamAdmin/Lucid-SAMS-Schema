
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
 *         &lt;element name="AverageID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SubjectID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ReportID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SubjectLevel" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Grade" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Average" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="AveragePer" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DataYear" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MarkUsed" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
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
    "averageID",
    "subjectID",
    "reportID",
    "subjectLevel",
    "grade",
    "average",
    "averagePer",
    "dataYear",
    "markUsed"
})
@XmlRootElement(name = "SubjectAverages")
public class SubjectAverages {

    @XmlElement(name = "AverageID")
    protected int averageID;
    @XmlElement(name = "SubjectID")
    protected Integer subjectID;
    @XmlElement(name = "ReportID")
    protected Integer reportID;
    @XmlElement(name = "SubjectLevel")
    protected String subjectLevel;
    @XmlElement(name = "Grade")
    protected Integer grade;
    @XmlElement(name = "Average")
    protected Double average;
    @XmlElement(name = "AveragePer")
    protected Double averagePer;
    @XmlElement(name = "DataYear")
    protected String dataYear;
    @XmlElement(name = "MarkUsed")
    protected String markUsed;

    /**
     * Gets the value of the averageID property.
     * 
     */
    public int getAverageID() {
        return averageID;
    }

    /**
     * Sets the value of the averageID property.
     * 
     */
    public void setAverageID(int value) {
        this.averageID = value;
    }

    /**
     * Gets the value of the subjectID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubjectID() {
        return subjectID;
    }

    /**
     * Sets the value of the subjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubjectID(Integer value) {
        this.subjectID = value;
    }

    /**
     * Gets the value of the reportID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReportID() {
        return reportID;
    }

    /**
     * Sets the value of the reportID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReportID(Integer value) {
        this.reportID = value;
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
     * Gets the value of the average property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAverage() {
        return average;
    }

    /**
     * Sets the value of the average property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAverage(Double value) {
        this.average = value;
    }

    /**
     * Gets the value of the averagePer property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAveragePer() {
        return averagePer;
    }

    /**
     * Sets the value of the averagePer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAveragePer(Double value) {
        this.averagePer = value;
    }

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
     * Gets the value of the markUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkUsed() {
        return markUsed;
    }

    /**
     * Sets the value of the markUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkUsed(String value) {
        this.markUsed = value;
    }

}
