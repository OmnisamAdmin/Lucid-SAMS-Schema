
package za.co.sfy.sams.lucid.schema;

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
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Name" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SchoolGrade" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ShortGradeName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Date_Deactivated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Deactivated" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Active_Classes" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Date_Active" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
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
    "id",
    "name",
    "schoolGrade",
    "shortGradeName",
    "dateDeactivated",
    "deactivated",
    "activeClasses",
    "dateActive"
})
@XmlRootElement(name = "SchoolGrades")
public class SchoolGrades {

    @XmlElement(name = "ID")
    protected Integer id;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "SchoolGrade")
    protected String schoolGrade;
    @XmlElement(name = "ShortGradeName")
    protected String shortGradeName;
    @XmlElement(name = "Date_Deactivated")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateDeactivated;
    @XmlElement(name = "Deactivated")
    protected String deactivated;
    @XmlElement(name = "Active_Classes")
    protected String activeClasses;
    @XmlElement(name = "Date_Active")
    protected String dateActive;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setID(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the schoolGrade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolGrade() {
        return schoolGrade;
    }

    /**
     * Sets the value of the schoolGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolGrade(String value) {
        this.schoolGrade = value;
    }

    /**
     * Gets the value of the shortGradeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortGradeName() {
        return shortGradeName;
    }

    /**
     * Sets the value of the shortGradeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortGradeName(String value) {
        this.shortGradeName = value;
    }

    /**
     * Gets the value of the dateDeactivated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateDeactivated() {
        return dateDeactivated;
    }

    /**
     * Sets the value of the dateDeactivated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateDeactivated(XMLGregorianCalendar value) {
        this.dateDeactivated = value;
    }

    /**
     * Gets the value of the deactivated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeactivated() {
        return deactivated;
    }

    /**
     * Sets the value of the deactivated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeactivated(String value) {
        this.deactivated = value;
    }

    /**
     * Gets the value of the activeClasses property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveClasses() {
        return activeClasses;
    }

    /**
     * Sets the value of the activeClasses property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveClasses(String value) {
        this.activeClasses = value;
    }

    /**
     * Gets the value of the dateActive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateActive() {
        return dateActive;
    }

    /**
     * Sets the value of the dateActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateActive(String value) {
        this.dateActive = value;
    }

}
