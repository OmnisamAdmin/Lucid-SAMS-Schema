
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
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LearnerID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SBSTDesagreeTI" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SBSTAgreeTI" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SBSTDesagreeTS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SBSTAgreeTS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SummaryTSSupport" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SummaryTISupport" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Data_Year" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "learnerID",
    "sbstDesagreeTI",
    "sbstAgreeTI",
    "sbstDesagreeTS",
    "sbstAgreeTS",
    "summaryTSSupport",
    "summaryTISupport",
    "dataYear"
})
@XmlRootElement(name = "SIAS_SBST_Review")
public class SIASSBSTReview {

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "LearnerID")
    protected String learnerID;
    @XmlElement(name = "SBSTDesagreeTI")
    protected Integer sbstDesagreeTI;
    @XmlElement(name = "SBSTAgreeTI")
    protected Integer sbstAgreeTI;
    @XmlElement(name = "SBSTDesagreeTS")
    protected Integer sbstDesagreeTS;
    @XmlElement(name = "SBSTAgreeTS")
    protected Integer sbstAgreeTS;
    @XmlElement(name = "SummaryTSSupport")
    protected String summaryTSSupport;
    @XmlElement(name = "SummaryTISupport")
    protected String summaryTISupport;
    @XmlElement(name = "Data_Year")
    protected Integer dataYear;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setID(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the learnerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearnerID() {
        return learnerID;
    }

    /**
     * Sets the value of the learnerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearnerID(String value) {
        this.learnerID = value;
    }

    /**
     * Gets the value of the sbstDesagreeTI property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSBSTDesagreeTI() {
        return sbstDesagreeTI;
    }

    /**
     * Sets the value of the sbstDesagreeTI property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSBSTDesagreeTI(Integer value) {
        this.sbstDesagreeTI = value;
    }

    /**
     * Gets the value of the sbstAgreeTI property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSBSTAgreeTI() {
        return sbstAgreeTI;
    }

    /**
     * Sets the value of the sbstAgreeTI property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSBSTAgreeTI(Integer value) {
        this.sbstAgreeTI = value;
    }

    /**
     * Gets the value of the sbstDesagreeTS property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSBSTDesagreeTS() {
        return sbstDesagreeTS;
    }

    /**
     * Sets the value of the sbstDesagreeTS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSBSTDesagreeTS(Integer value) {
        this.sbstDesagreeTS = value;
    }

    /**
     * Gets the value of the sbstAgreeTS property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSBSTAgreeTS() {
        return sbstAgreeTS;
    }

    /**
     * Sets the value of the sbstAgreeTS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSBSTAgreeTS(Integer value) {
        this.sbstAgreeTS = value;
    }

    /**
     * Gets the value of the summaryTSSupport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummaryTSSupport() {
        return summaryTSSupport;
    }

    /**
     * Sets the value of the summaryTSSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummaryTSSupport(String value) {
        this.summaryTSSupport = value;
    }

    /**
     * Gets the value of the summaryTISupport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummaryTISupport() {
        return summaryTISupport;
    }

    /**
     * Sets the value of the summaryTISupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummaryTISupport(String value) {
        this.summaryTISupport = value;
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

}
