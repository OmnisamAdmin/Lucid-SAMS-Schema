
package za.co.sfy.sams.lucid.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="LinkType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="LinkID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="QualType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="QualNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="QualYear" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QualInstitution" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QualSubjects" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QualOtherSubjects" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="250"/&gt;
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
    "linkType",
    "linkID",
    "qualType",
    "qualNo",
    "qualYear",
    "qualInstitution",
    "qualSubjects",
    "qualOtherSubjects"
})
@XmlRootElement(name = "Qualifications")
public class Qualifications {

    @XmlElement(name = "LinkType")
    @XmlSchemaType(name = "unsignedByte")
    protected Short linkType;
    @XmlElement(name = "LinkID")
    protected Integer linkID;
    @XmlElement(name = "QualType")
    @XmlSchemaType(name = "unsignedByte")
    protected Short qualType;
    @XmlElement(name = "QualNo")
    protected Integer qualNo;
    @XmlElement(name = "QualYear")
    protected String qualYear;
    @XmlElement(name = "QualInstitution")
    protected String qualInstitution;
    @XmlElement(name = "QualSubjects")
    protected String qualSubjects;
    @XmlElement(name = "QualOtherSubjects")
    protected String qualOtherSubjects;

    /**
     * Gets the value of the linkType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getLinkType() {
        return linkType;
    }

    /**
     * Sets the value of the linkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setLinkType(Short value) {
        this.linkType = value;
    }

    /**
     * Gets the value of the linkID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLinkID() {
        return linkID;
    }

    /**
     * Sets the value of the linkID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLinkID(Integer value) {
        this.linkID = value;
    }

    /**
     * Gets the value of the qualType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getQualType() {
        return qualType;
    }

    /**
     * Sets the value of the qualType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setQualType(Short value) {
        this.qualType = value;
    }

    /**
     * Gets the value of the qualNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQualNo() {
        return qualNo;
    }

    /**
     * Sets the value of the qualNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQualNo(Integer value) {
        this.qualNo = value;
    }

    /**
     * Gets the value of the qualYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualYear() {
        return qualYear;
    }

    /**
     * Sets the value of the qualYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualYear(String value) {
        this.qualYear = value;
    }

    /**
     * Gets the value of the qualInstitution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualInstitution() {
        return qualInstitution;
    }

    /**
     * Sets the value of the qualInstitution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualInstitution(String value) {
        this.qualInstitution = value;
    }

    /**
     * Gets the value of the qualSubjects property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualSubjects() {
        return qualSubjects;
    }

    /**
     * Sets the value of the qualSubjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualSubjects(String value) {
        this.qualSubjects = value;
    }

    /**
     * Gets the value of the qualOtherSubjects property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualOtherSubjects() {
        return qualOtherSubjects;
    }

    /**
     * Sets the value of the qualOtherSubjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualOtherSubjects(String value) {
        this.qualOtherSubjects = value;
    }

}
