
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
 *         &lt;element name="AccNum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="BudgetCredit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="BudgetDebit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="OpenCredit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="OpenDebit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Year" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Month" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EntryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="SubAccNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "accNum",
    "budgetCredit",
    "budgetDebit",
    "openCredit",
    "openDebit",
    "year",
    "month",
    "entryDate",
    "subAccNo"
})
@XmlRootElement(name = "ChartofAccountDetails")
public class ChartofAccountDetails {

    @XmlElement(name = "AccNum")
    protected Double accNum;
    @XmlElement(name = "BudgetCredit")
    protected Double budgetCredit;
    @XmlElement(name = "BudgetDebit")
    protected Double budgetDebit;
    @XmlElement(name = "OpenCredit")
    protected Double openCredit;
    @XmlElement(name = "OpenDebit")
    protected Double openDebit;
    @XmlElement(name = "Year")
    protected String year;
    @XmlElement(name = "Month")
    protected String month;
    @XmlElement(name = "EntryDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar entryDate;
    @XmlElement(name = "SubAccNo")
    protected Integer subAccNo;

    /**
     * Gets the value of the accNum property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAccNum() {
        return accNum;
    }

    /**
     * Sets the value of the accNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAccNum(Double value) {
        this.accNum = value;
    }

    /**
     * Gets the value of the budgetCredit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBudgetCredit() {
        return budgetCredit;
    }

    /**
     * Sets the value of the budgetCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBudgetCredit(Double value) {
        this.budgetCredit = value;
    }

    /**
     * Gets the value of the budgetDebit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBudgetDebit() {
        return budgetDebit;
    }

    /**
     * Sets the value of the budgetDebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBudgetDebit(Double value) {
        this.budgetDebit = value;
    }

    /**
     * Gets the value of the openCredit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOpenCredit() {
        return openCredit;
    }

    /**
     * Sets the value of the openCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOpenCredit(Double value) {
        this.openCredit = value;
    }

    /**
     * Gets the value of the openDebit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOpenDebit() {
        return openDebit;
    }

    /**
     * Sets the value of the openDebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOpenDebit(Double value) {
        this.openDebit = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYear(String value) {
        this.year = value;
    }

    /**
     * Gets the value of the month property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonth(String value) {
        this.month = value;
    }

    /**
     * Gets the value of the entryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntryDate() {
        return entryDate;
    }

    /**
     * Sets the value of the entryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEntryDate(XMLGregorianCalendar value) {
        this.entryDate = value;
    }

    /**
     * Gets the value of the subAccNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubAccNo() {
        return subAccNo;
    }

    /**
     * Sets the value of the subAccNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubAccNo(Integer value) {
        this.subAccNo = value;
    }

}
