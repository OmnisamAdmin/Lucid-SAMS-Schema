
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
 *         &lt;element name="BookId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AccNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ChequeStart" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ChequeEnd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LastNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="COANo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "bookId",
    "accNumber",
    "chequeStart",
    "chequeEnd",
    "lastNum",
    "coaNo"
})
@XmlRootElement(name = "ChequeNum")
public class ChequeNum {

    @XmlElement(name = "BookId")
    protected int bookId;
    @XmlElement(name = "AccNumber")
    protected String accNumber;
    @XmlElement(name = "ChequeStart")
    protected Integer chequeStart;
    @XmlElement(name = "ChequeEnd")
    protected Integer chequeEnd;
    @XmlElement(name = "LastNum")
    protected Integer lastNum;
    @XmlElement(name = "COANo")
    protected Integer coaNo;

    /**
     * Gets the value of the bookId property.
     * 
     */
    public int getBookId() {
        return bookId;
    }

    /**
     * Sets the value of the bookId property.
     * 
     */
    public void setBookId(int value) {
        this.bookId = value;
    }

    /**
     * Gets the value of the accNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccNumber() {
        return accNumber;
    }

    /**
     * Sets the value of the accNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccNumber(String value) {
        this.accNumber = value;
    }

    /**
     * Gets the value of the chequeStart property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChequeStart() {
        return chequeStart;
    }

    /**
     * Sets the value of the chequeStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChequeStart(Integer value) {
        this.chequeStart = value;
    }

    /**
     * Gets the value of the chequeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChequeEnd() {
        return chequeEnd;
    }

    /**
     * Sets the value of the chequeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChequeEnd(Integer value) {
        this.chequeEnd = value;
    }

    /**
     * Gets the value of the lastNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastNum() {
        return lastNum;
    }

    /**
     * Sets the value of the lastNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLastNum(Integer value) {
        this.lastNum = value;
    }

    /**
     * Gets the value of the coaNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCOANo() {
        return coaNo;
    }

    /**
     * Sets the value of the coaNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCOANo(Integer value) {
        this.coaNo = value;
    }

}
