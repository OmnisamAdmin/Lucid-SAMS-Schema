
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
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LearnerID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DBSTDesagreeTI" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DBSTAgreeTI" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DBSTDesagreeTS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DBSTAgreeTS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Barrier_Identification_Comment" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Intervention_Comment" minOccurs="0"&gt;
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
    "dbstDesagreeTI",
    "dbstAgreeTI",
    "dbstDesagreeTS",
    "dbstAgreeTS",
    "barrierIdentificationComment",
    "interventionComment",
    "dataYear"
})
@XmlRootElement(name = "SIAS_DBST_Review")
public class SIASDBSTReview {

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "LearnerID")
    protected String learnerID;
    @XmlElement(name = "DBSTDesagreeTI")
    protected Integer dbstDesagreeTI;
    @XmlElement(name = "DBSTAgreeTI")
    protected Integer dbstAgreeTI;
    @XmlElement(name = "DBSTDesagreeTS")
    protected Integer dbstDesagreeTS;
    @XmlElement(name = "DBSTAgreeTS")
    protected Integer dbstAgreeTS;
    @XmlElement(name = "Barrier_Identification_Comment")
    protected String barrierIdentificationComment;
    @XmlElement(name = "Intervention_Comment")
    protected String interventionComment;
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
     * Gets the value of the dbstDesagreeTI property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDBSTDesagreeTI() {
        return dbstDesagreeTI;
    }

    /**
     * Sets the value of the dbstDesagreeTI property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDBSTDesagreeTI(Integer value) {
        this.dbstDesagreeTI = value;
    }

    /**
     * Gets the value of the dbstAgreeTI property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDBSTAgreeTI() {
        return dbstAgreeTI;
    }

    /**
     * Sets the value of the dbstAgreeTI property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDBSTAgreeTI(Integer value) {
        this.dbstAgreeTI = value;
    }

    /**
     * Gets the value of the dbstDesagreeTS property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDBSTDesagreeTS() {
        return dbstDesagreeTS;
    }

    /**
     * Sets the value of the dbstDesagreeTS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDBSTDesagreeTS(Integer value) {
        this.dbstDesagreeTS = value;
    }

    /**
     * Gets the value of the dbstAgreeTS property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDBSTAgreeTS() {
        return dbstAgreeTS;
    }

    /**
     * Sets the value of the dbstAgreeTS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDBSTAgreeTS(Integer value) {
        this.dbstAgreeTS = value;
    }

    /**
     * Gets the value of the barrierIdentificationComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarrierIdentificationComment() {
        return barrierIdentificationComment;
    }

    /**
     * Sets the value of the barrierIdentificationComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarrierIdentificationComment(String value) {
        this.barrierIdentificationComment = value;
    }

    /**
     * Gets the value of the interventionComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterventionComment() {
        return interventionComment;
    }

    /**
     * Sets the value of the interventionComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterventionComment(String value) {
        this.interventionComment = value;
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
