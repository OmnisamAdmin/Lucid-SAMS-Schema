
package za.co.sfy.sams;

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
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="WeekId" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Gender" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TotalAbsent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TotalAttended" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PossAttended" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Days" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AveAttended" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Datayear" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Category" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Remuneration" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
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
    "weekId",
    "gender",
    "totalAbsent",
    "totalAttended",
    "possAttended",
    "days",
    "aveAttended",
    "quantity",
    "datayear",
    "category",
    "remuneration"
})
@XmlRootElement(name = "StaffAbsenteeStatistics")
public class StaffAbsenteeStatistics {

    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "WeekId")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar weekId;
    @XmlElement(name = "Gender")
    protected String gender;
    @XmlElement(name = "TotalAbsent")
    protected Integer totalAbsent;
    @XmlElement(name = "TotalAttended")
    protected Integer totalAttended;
    @XmlElement(name = "PossAttended")
    protected Integer possAttended;
    @XmlElement(name = "Days")
    protected Integer days;
    @XmlElement(name = "AveAttended")
    protected Integer aveAttended;
    @XmlElement(name = "Quantity")
    protected Integer quantity;
    @XmlElement(name = "Datayear")
    protected String datayear;
    @XmlElement(name = "Category")
    protected String category;
    @XmlElement(name = "Remuneration")
    @XmlSchemaType(name = "unsignedByte")
    protected Short remuneration;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the weekId property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWeekId() {
        return weekId;
    }

    /**
     * Sets the value of the weekId property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWeekId(XMLGregorianCalendar value) {
        this.weekId = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the totalAbsent property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalAbsent() {
        return totalAbsent;
    }

    /**
     * Sets the value of the totalAbsent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalAbsent(Integer value) {
        this.totalAbsent = value;
    }

    /**
     * Gets the value of the totalAttended property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalAttended() {
        return totalAttended;
    }

    /**
     * Sets the value of the totalAttended property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalAttended(Integer value) {
        this.totalAttended = value;
    }

    /**
     * Gets the value of the possAttended property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPossAttended() {
        return possAttended;
    }

    /**
     * Sets the value of the possAttended property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPossAttended(Integer value) {
        this.possAttended = value;
    }

    /**
     * Gets the value of the days property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDays() {
        return days;
    }

    /**
     * Sets the value of the days property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDays(Integer value) {
        this.days = value;
    }

    /**
     * Gets the value of the aveAttended property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAveAttended() {
        return aveAttended;
    }

    /**
     * Sets the value of the aveAttended property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAveAttended(Integer value) {
        this.aveAttended = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the datayear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatayear() {
        return datayear;
    }

    /**
     * Sets the value of the datayear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatayear(String value) {
        this.datayear = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the remuneration property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRemuneration() {
        return remuneration;
    }

    /**
     * Sets the value of the remuneration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRemuneration(Short value) {
        this.remuneration = value;
    }

}
