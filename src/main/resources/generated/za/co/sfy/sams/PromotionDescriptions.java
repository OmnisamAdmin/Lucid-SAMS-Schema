
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
 *         &lt;element name="PromotionId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Description" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AfrDescription" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ReportCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DescriptionTerm1to3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AfrDescriptionTerm1to3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DeviatedDesc" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DeviatedAfrDesc" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
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
    "promotionId",
    "description",
    "afrDescription",
    "reportCode",
    "descriptionTerm1To3",
    "afrDescriptionTerm1To3",
    "deviatedDesc",
    "deviatedAfrDesc"
})
@XmlRootElement(name = "PromotionDescriptions")
public class PromotionDescriptions {

    @XmlElement(name = "PromotionId")
    protected int promotionId;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "AfrDescription")
    protected String afrDescription;
    @XmlElement(name = "ReportCode")
    protected String reportCode;
    @XmlElement(name = "DescriptionTerm1to3")
    protected String descriptionTerm1To3;
    @XmlElement(name = "AfrDescriptionTerm1to3")
    protected String afrDescriptionTerm1To3;
    @XmlElement(name = "DeviatedDesc")
    protected String deviatedDesc;
    @XmlElement(name = "DeviatedAfrDesc")
    protected String deviatedAfrDesc;

    /**
     * Gets the value of the promotionId property.
     * 
     */
    public int getPromotionId() {
        return promotionId;
    }

    /**
     * Sets the value of the promotionId property.
     * 
     */
    public void setPromotionId(int value) {
        this.promotionId = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the afrDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfrDescription() {
        return afrDescription;
    }

    /**
     * Sets the value of the afrDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfrDescription(String value) {
        this.afrDescription = value;
    }

    /**
     * Gets the value of the reportCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportCode() {
        return reportCode;
    }

    /**
     * Sets the value of the reportCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportCode(String value) {
        this.reportCode = value;
    }

    /**
     * Gets the value of the descriptionTerm1To3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionTerm1To3() {
        return descriptionTerm1To3;
    }

    /**
     * Sets the value of the descriptionTerm1To3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionTerm1To3(String value) {
        this.descriptionTerm1To3 = value;
    }

    /**
     * Gets the value of the afrDescriptionTerm1To3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfrDescriptionTerm1To3() {
        return afrDescriptionTerm1To3;
    }

    /**
     * Sets the value of the afrDescriptionTerm1To3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfrDescriptionTerm1To3(String value) {
        this.afrDescriptionTerm1To3 = value;
    }

    /**
     * Gets the value of the deviatedDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviatedDesc() {
        return deviatedDesc;
    }

    /**
     * Sets the value of the deviatedDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviatedDesc(String value) {
        this.deviatedDesc = value;
    }

    /**
     * Gets the value of the deviatedAfrDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviatedAfrDesc() {
        return deviatedAfrDesc;
    }

    /**
     * Sets the value of the deviatedAfrDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviatedAfrDesc(String value) {
        this.deviatedAfrDesc = value;
    }

}
