
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
 *         &lt;element name="EnrolmentMale" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EnrolmentFemale" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TotalEnrolment" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PossibleAttendanceMale" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PossibleAttendanceFemale" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TotalPossible" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DaysAbsentForMonthMale" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DaysAbsentForMonthFemale" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TotalDaysAbsentForMonth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ActualLearnerAttendanceMale" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ActualLearnerAttendanceFemale" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TotalActualLearnerAttendance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AverageAttendance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AverageAbsentees" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DataYear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DataMonth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "enrolmentMale",
    "enrolmentFemale",
    "totalEnrolment",
    "possibleAttendanceMale",
    "possibleAttendanceFemale",
    "totalPossible",
    "daysAbsentForMonthMale",
    "daysAbsentForMonthFemale",
    "totalDaysAbsentForMonth",
    "actualLearnerAttendanceMale",
    "actualLearnerAttendanceFemale",
    "totalActualLearnerAttendance",
    "averageAttendance",
    "averageAbsentees",
    "dataYear",
    "dataMonth"
})
@XmlRootElement(name = "LearnerMAttendance")
public class LearnerMAttendance {

    @XmlElement(name = "EnrolmentMale")
    protected Integer enrolmentMale;
    @XmlElement(name = "EnrolmentFemale")
    protected Integer enrolmentFemale;
    @XmlElement(name = "TotalEnrolment")
    protected Integer totalEnrolment;
    @XmlElement(name = "PossibleAttendanceMale")
    protected Integer possibleAttendanceMale;
    @XmlElement(name = "PossibleAttendanceFemale")
    protected Integer possibleAttendanceFemale;
    @XmlElement(name = "TotalPossible")
    protected Integer totalPossible;
    @XmlElement(name = "DaysAbsentForMonthMale")
    protected Integer daysAbsentForMonthMale;
    @XmlElement(name = "DaysAbsentForMonthFemale")
    protected Integer daysAbsentForMonthFemale;
    @XmlElement(name = "TotalDaysAbsentForMonth")
    protected Integer totalDaysAbsentForMonth;
    @XmlElement(name = "ActualLearnerAttendanceMale")
    protected Integer actualLearnerAttendanceMale;
    @XmlElement(name = "ActualLearnerAttendanceFemale")
    protected Integer actualLearnerAttendanceFemale;
    @XmlElement(name = "TotalActualLearnerAttendance")
    protected Integer totalActualLearnerAttendance;
    @XmlElement(name = "AverageAttendance")
    protected Integer averageAttendance;
    @XmlElement(name = "AverageAbsentees")
    protected Integer averageAbsentees;
    @XmlElement(name = "DataYear")
    protected Integer dataYear;
    @XmlElement(name = "DataMonth")
    protected Integer dataMonth;

    /**
     * Gets the value of the enrolmentMale property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEnrolmentMale() {
        return enrolmentMale;
    }

    /**
     * Sets the value of the enrolmentMale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEnrolmentMale(Integer value) {
        this.enrolmentMale = value;
    }

    /**
     * Gets the value of the enrolmentFemale property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEnrolmentFemale() {
        return enrolmentFemale;
    }

    /**
     * Sets the value of the enrolmentFemale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEnrolmentFemale(Integer value) {
        this.enrolmentFemale = value;
    }

    /**
     * Gets the value of the totalEnrolment property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalEnrolment() {
        return totalEnrolment;
    }

    /**
     * Sets the value of the totalEnrolment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalEnrolment(Integer value) {
        this.totalEnrolment = value;
    }

    /**
     * Gets the value of the possibleAttendanceMale property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPossibleAttendanceMale() {
        return possibleAttendanceMale;
    }

    /**
     * Sets the value of the possibleAttendanceMale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPossibleAttendanceMale(Integer value) {
        this.possibleAttendanceMale = value;
    }

    /**
     * Gets the value of the possibleAttendanceFemale property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPossibleAttendanceFemale() {
        return possibleAttendanceFemale;
    }

    /**
     * Sets the value of the possibleAttendanceFemale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPossibleAttendanceFemale(Integer value) {
        this.possibleAttendanceFemale = value;
    }

    /**
     * Gets the value of the totalPossible property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalPossible() {
        return totalPossible;
    }

    /**
     * Sets the value of the totalPossible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalPossible(Integer value) {
        this.totalPossible = value;
    }

    /**
     * Gets the value of the daysAbsentForMonthMale property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDaysAbsentForMonthMale() {
        return daysAbsentForMonthMale;
    }

    /**
     * Sets the value of the daysAbsentForMonthMale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDaysAbsentForMonthMale(Integer value) {
        this.daysAbsentForMonthMale = value;
    }

    /**
     * Gets the value of the daysAbsentForMonthFemale property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDaysAbsentForMonthFemale() {
        return daysAbsentForMonthFemale;
    }

    /**
     * Sets the value of the daysAbsentForMonthFemale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDaysAbsentForMonthFemale(Integer value) {
        this.daysAbsentForMonthFemale = value;
    }

    /**
     * Gets the value of the totalDaysAbsentForMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalDaysAbsentForMonth() {
        return totalDaysAbsentForMonth;
    }

    /**
     * Sets the value of the totalDaysAbsentForMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalDaysAbsentForMonth(Integer value) {
        this.totalDaysAbsentForMonth = value;
    }

    /**
     * Gets the value of the actualLearnerAttendanceMale property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActualLearnerAttendanceMale() {
        return actualLearnerAttendanceMale;
    }

    /**
     * Sets the value of the actualLearnerAttendanceMale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActualLearnerAttendanceMale(Integer value) {
        this.actualLearnerAttendanceMale = value;
    }

    /**
     * Gets the value of the actualLearnerAttendanceFemale property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActualLearnerAttendanceFemale() {
        return actualLearnerAttendanceFemale;
    }

    /**
     * Sets the value of the actualLearnerAttendanceFemale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActualLearnerAttendanceFemale(Integer value) {
        this.actualLearnerAttendanceFemale = value;
    }

    /**
     * Gets the value of the totalActualLearnerAttendance property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalActualLearnerAttendance() {
        return totalActualLearnerAttendance;
    }

    /**
     * Sets the value of the totalActualLearnerAttendance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalActualLearnerAttendance(Integer value) {
        this.totalActualLearnerAttendance = value;
    }

    /**
     * Gets the value of the averageAttendance property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAverageAttendance() {
        return averageAttendance;
    }

    /**
     * Sets the value of the averageAttendance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAverageAttendance(Integer value) {
        this.averageAttendance = value;
    }

    /**
     * Gets the value of the averageAbsentees property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAverageAbsentees() {
        return averageAbsentees;
    }

    /**
     * Sets the value of the averageAbsentees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAverageAbsentees(Integer value) {
        this.averageAbsentees = value;
    }

    /**
     * Gets the value of the dataYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDataYear() {
        return dataYear;
    }

    /**
     * Sets the value of the dataYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDataYear(Integer value) {
        this.dataYear = value;
    }

    /**
     * Gets the value of the dataMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDataMonth() {
        return dataMonth;
    }

    /**
     * Sets the value of the dataMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDataMonth(Integer value) {
        this.dataMonth = value;
    }

}
