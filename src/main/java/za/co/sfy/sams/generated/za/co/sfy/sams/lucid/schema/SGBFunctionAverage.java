
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
 *         &lt;element name="emisnumber" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="dataYear" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Policy_ratings" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Meeting_ratings" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Assets_ratings" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Finance_ratings" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Curriculum_ratings" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "emisnumber",
    "dataYear",
    "policyRatings",
    "meetingRatings",
    "assetsRatings",
    "financeRatings",
    "curriculumRatings"
})
@XmlRootElement(name = "SGBFunctionAverage")
public class SGBFunctionAverage {

    protected Double emisnumber;
    protected String dataYear;
    @XmlElement(name = "Policy_ratings")
    protected Integer policyRatings;
    @XmlElement(name = "Meeting_ratings")
    protected Integer meetingRatings;
    @XmlElement(name = "Assets_ratings")
    protected Integer assetsRatings;
    @XmlElement(name = "Finance_ratings")
    protected Integer financeRatings;
    @XmlElement(name = "Curriculum_ratings")
    protected Integer curriculumRatings;

    /**
     * Gets the value of the emisnumber property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEmisnumber() {
        return emisnumber;
    }

    /**
     * Sets the value of the emisnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEmisnumber(Double value) {
        this.emisnumber = value;
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
     * Gets the value of the policyRatings property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPolicyRatings() {
        return policyRatings;
    }

    /**
     * Sets the value of the policyRatings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPolicyRatings(Integer value) {
        this.policyRatings = value;
    }

    /**
     * Gets the value of the meetingRatings property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMeetingRatings() {
        return meetingRatings;
    }

    /**
     * Sets the value of the meetingRatings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMeetingRatings(Integer value) {
        this.meetingRatings = value;
    }

    /**
     * Gets the value of the assetsRatings property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAssetsRatings() {
        return assetsRatings;
    }

    /**
     * Sets the value of the assetsRatings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAssetsRatings(Integer value) {
        this.assetsRatings = value;
    }

    /**
     * Gets the value of the financeRatings property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFinanceRatings() {
        return financeRatings;
    }

    /**
     * Sets the value of the financeRatings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFinanceRatings(Integer value) {
        this.financeRatings = value;
    }

    /**
     * Gets the value of the curriculumRatings property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurriculumRatings() {
        return curriculumRatings;
    }

    /**
     * Sets the value of the curriculumRatings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurriculumRatings(Integer value) {
        this.curriculumRatings = value;
    }

}
