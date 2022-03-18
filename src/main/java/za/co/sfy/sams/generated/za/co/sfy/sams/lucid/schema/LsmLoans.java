
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
 *         &lt;element name="LoanID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ItemID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DateLoaned" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ExpectedReturn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DateReturned" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LoanedToType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LoanedTo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LoanQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ReturnQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Condition" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LoanVenue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "loanID",
    "itemID",
    "dateLoaned",
    "expectedReturn",
    "dateReturned",
    "loanedToType",
    "loanedTo",
    "loanQuantity",
    "returnQuantity",
    "condition",
    "loanVenue"
})
@XmlRootElement(name = "LsmLoans")
public class LsmLoans {

    @XmlElement(name = "LoanID")
    protected int loanID;
    @XmlElement(name = "ItemID")
    protected Integer itemID;
    @XmlElement(name = "DateLoaned")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLoaned;
    @XmlElement(name = "ExpectedReturn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectedReturn;
    @XmlElement(name = "DateReturned")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateReturned;
    @XmlElement(name = "LoanedToType")
    protected Integer loanedToType;
    @XmlElement(name = "LoanedTo")
    protected Integer loanedTo;
    @XmlElement(name = "LoanQuantity")
    protected Integer loanQuantity;
    @XmlElement(name = "ReturnQuantity")
    protected Integer returnQuantity;
    @XmlElement(name = "Condition")
    protected String condition;
    @XmlElement(name = "LoanVenue")
    protected Integer loanVenue;

    /**
     * Gets the value of the loanID property.
     * 
     */
    public int getLoanID() {
        return loanID;
    }

    /**
     * Sets the value of the loanID property.
     * 
     */
    public void setLoanID(int value) {
        this.loanID = value;
    }

    /**
     * Gets the value of the itemID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemID() {
        return itemID;
    }

    /**
     * Sets the value of the itemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemID(Integer value) {
        this.itemID = value;
    }

    /**
     * Gets the value of the dateLoaned property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLoaned() {
        return dateLoaned;
    }

    /**
     * Sets the value of the dateLoaned property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLoaned(XMLGregorianCalendar value) {
        this.dateLoaned = value;
    }

    /**
     * Gets the value of the expectedReturn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedReturn() {
        return expectedReturn;
    }

    /**
     * Sets the value of the expectedReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedReturn(XMLGregorianCalendar value) {
        this.expectedReturn = value;
    }

    /**
     * Gets the value of the dateReturned property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateReturned() {
        return dateReturned;
    }

    /**
     * Sets the value of the dateReturned property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateReturned(XMLGregorianCalendar value) {
        this.dateReturned = value;
    }

    /**
     * Gets the value of the loanedToType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoanedToType() {
        return loanedToType;
    }

    /**
     * Sets the value of the loanedToType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoanedToType(Integer value) {
        this.loanedToType = value;
    }

    /**
     * Gets the value of the loanedTo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoanedTo() {
        return loanedTo;
    }

    /**
     * Sets the value of the loanedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoanedTo(Integer value) {
        this.loanedTo = value;
    }

    /**
     * Gets the value of the loanQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoanQuantity() {
        return loanQuantity;
    }

    /**
     * Sets the value of the loanQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoanQuantity(Integer value) {
        this.loanQuantity = value;
    }

    /**
     * Gets the value of the returnQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReturnQuantity() {
        return returnQuantity;
    }

    /**
     * Sets the value of the returnQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReturnQuantity(Integer value) {
        this.returnQuantity = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondition(String value) {
        this.condition = value;
    }

    /**
     * Gets the value of the loanVenue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoanVenue() {
        return loanVenue;
    }

    /**
     * Sets the value of the loanVenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoanVenue(Integer value) {
        this.loanVenue = value;
    }

}
