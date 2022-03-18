
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
 *         &lt;element name="MedicationID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MedicalID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MedicationTime" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MedicationDesc" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MedicationComment" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
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
    "medicationID",
    "medicalID",
    "medicationTime",
    "medicationDesc",
    "medicationComment"
})
@XmlRootElement(name = "LearnerMedications")
public class LearnerMedications {

    @XmlElement(name = "MedicationID")
    protected int medicationID;
    @XmlElement(name = "MedicalID")
    protected Integer medicalID;
    @XmlElement(name = "MedicationTime")
    protected String medicationTime;
    @XmlElement(name = "MedicationDesc")
    protected String medicationDesc;
    @XmlElement(name = "MedicationComment")
    protected String medicationComment;

    /**
     * Gets the value of the medicationID property.
     * 
     */
    public int getMedicationID() {
        return medicationID;
    }

    /**
     * Sets the value of the medicationID property.
     * 
     */
    public void setMedicationID(int value) {
        this.medicationID = value;
    }

    /**
     * Gets the value of the medicalID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMedicalID() {
        return medicalID;
    }

    /**
     * Sets the value of the medicalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMedicalID(Integer value) {
        this.medicalID = value;
    }

    /**
     * Gets the value of the medicationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicationTime() {
        return medicationTime;
    }

    /**
     * Sets the value of the medicationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicationTime(String value) {
        this.medicationTime = value;
    }

    /**
     * Gets the value of the medicationDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicationDesc() {
        return medicationDesc;
    }

    /**
     * Sets the value of the medicationDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicationDesc(String value) {
        this.medicationDesc = value;
    }

    /**
     * Gets the value of the medicationComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicationComment() {
        return medicationComment;
    }

    /**
     * Sets the value of the medicationComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicationComment(String value) {
        this.medicationComment = value;
    }

}
