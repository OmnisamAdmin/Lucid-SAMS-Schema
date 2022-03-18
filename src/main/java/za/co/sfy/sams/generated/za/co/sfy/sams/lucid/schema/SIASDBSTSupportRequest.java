
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
 *         &lt;element name="Motivation_For_Support" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Support_Area" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SBST_Name" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SBST_Signature" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SBST_Date_Signed" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Does_Parents_Support_This_Request" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Parent_Comment" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Parent_Name" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Does_Principal_Support_Request" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Reason_for_Decision" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Designation" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Principal_Date_signed" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Data_Year" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Principal_Signature" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "motivationForSupport",
    "supportArea",
    "sbstName",
    "sbstSignature",
    "sbstDateSigned",
    "doesParentsSupportThisRequest",
    "parentComment",
    "parentName",
    "doesPrincipalSupportRequest",
    "reasonForDecision",
    "designation",
    "principalDateSigned",
    "dataYear",
    "principalSignature"
})
@XmlRootElement(name = "SIAS_DBST_Support_Request")
public class SIASDBSTSupportRequest {

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "LearnerID")
    protected String learnerID;
    @XmlElement(name = "Motivation_For_Support")
    protected String motivationForSupport;
    @XmlElement(name = "Support_Area")
    protected String supportArea;
    @XmlElement(name = "SBST_Name")
    protected String sbstName;
    @XmlElement(name = "SBST_Signature")
    protected boolean sbstSignature;
    @XmlElement(name = "SBST_Date_Signed")
    protected String sbstDateSigned;
    @XmlElement(name = "Does_Parents_Support_This_Request")
    protected boolean doesParentsSupportThisRequest;
    @XmlElement(name = "Parent_Comment")
    protected String parentComment;
    @XmlElement(name = "Parent_Name")
    protected String parentName;
    @XmlElement(name = "Does_Principal_Support_Request")
    protected boolean doesPrincipalSupportRequest;
    @XmlElement(name = "Reason_for_Decision")
    protected String reasonForDecision;
    @XmlElement(name = "Designation")
    protected String designation;
    @XmlElement(name = "Principal_Date_signed")
    protected String principalDateSigned;
    @XmlElement(name = "Data_Year")
    protected Integer dataYear;
    @XmlElement(name = "Principal_Signature")
    protected boolean principalSignature;

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
     * Gets the value of the motivationForSupport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivationForSupport() {
        return motivationForSupport;
    }

    /**
     * Sets the value of the motivationForSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivationForSupport(String value) {
        this.motivationForSupport = value;
    }

    /**
     * Gets the value of the supportArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportArea() {
        return supportArea;
    }

    /**
     * Sets the value of the supportArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportArea(String value) {
        this.supportArea = value;
    }

    /**
     * Gets the value of the sbstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBSTName() {
        return sbstName;
    }

    /**
     * Sets the value of the sbstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBSTName(String value) {
        this.sbstName = value;
    }

    /**
     * Gets the value of the sbstSignature property.
     * 
     */
    public boolean isSBSTSignature() {
        return sbstSignature;
    }

    /**
     * Sets the value of the sbstSignature property.
     * 
     */
    public void setSBSTSignature(boolean value) {
        this.sbstSignature = value;
    }

    /**
     * Gets the value of the sbstDateSigned property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBSTDateSigned() {
        return sbstDateSigned;
    }

    /**
     * Sets the value of the sbstDateSigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBSTDateSigned(String value) {
        this.sbstDateSigned = value;
    }

    /**
     * Gets the value of the doesParentsSupportThisRequest property.
     * 
     */
    public boolean isDoesParentsSupportThisRequest() {
        return doesParentsSupportThisRequest;
    }

    /**
     * Sets the value of the doesParentsSupportThisRequest property.
     * 
     */
    public void setDoesParentsSupportThisRequest(boolean value) {
        this.doesParentsSupportThisRequest = value;
    }

    /**
     * Gets the value of the parentComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentComment() {
        return parentComment;
    }

    /**
     * Sets the value of the parentComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentComment(String value) {
        this.parentComment = value;
    }

    /**
     * Gets the value of the parentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentName() {
        return parentName;
    }

    /**
     * Sets the value of the parentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentName(String value) {
        this.parentName = value;
    }

    /**
     * Gets the value of the doesPrincipalSupportRequest property.
     * 
     */
    public boolean isDoesPrincipalSupportRequest() {
        return doesPrincipalSupportRequest;
    }

    /**
     * Sets the value of the doesPrincipalSupportRequest property.
     * 
     */
    public void setDoesPrincipalSupportRequest(boolean value) {
        this.doesPrincipalSupportRequest = value;
    }

    /**
     * Gets the value of the reasonForDecision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonForDecision() {
        return reasonForDecision;
    }

    /**
     * Sets the value of the reasonForDecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonForDecision(String value) {
        this.reasonForDecision = value;
    }

    /**
     * Gets the value of the designation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * Sets the value of the designation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignation(String value) {
        this.designation = value;
    }

    /**
     * Gets the value of the principalDateSigned property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipalDateSigned() {
        return principalDateSigned;
    }

    /**
     * Sets the value of the principalDateSigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipalDateSigned(String value) {
        this.principalDateSigned = value;
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
     * Gets the value of the principalSignature property.
     * 
     */
    public boolean isPrincipalSignature() {
        return principalSignature;
    }

    /**
     * Sets the value of the principalSignature property.
     * 
     */
    public void setPrincipalSignature(boolean value) {
        this.principalSignature = value;
    }

}
