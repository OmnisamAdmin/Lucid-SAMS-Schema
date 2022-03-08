
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
 *         &lt;element name="COANum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="startVoucher" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="endVoucher" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Lastvoucher" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "coaNum",
    "startVoucher",
    "endVoucher",
    "lastvoucher"
})
@XmlRootElement(name = "PettyVoucherNumbers")
public class PettyVoucherNumbers {

    @XmlElement(name = "BookId")
    protected int bookId;
    @XmlElement(name = "COANum")
    protected Integer coaNum;
    protected Integer startVoucher;
    protected Integer endVoucher;
    @XmlElement(name = "Lastvoucher")
    protected Integer lastvoucher;

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
     * Gets the value of the coaNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCOANum() {
        return coaNum;
    }

    /**
     * Sets the value of the coaNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCOANum(Integer value) {
        this.coaNum = value;
    }

    /**
     * Gets the value of the startVoucher property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartVoucher() {
        return startVoucher;
    }

    /**
     * Sets the value of the startVoucher property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartVoucher(Integer value) {
        this.startVoucher = value;
    }

    /**
     * Gets the value of the endVoucher property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEndVoucher() {
        return endVoucher;
    }

    /**
     * Sets the value of the endVoucher property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEndVoucher(Integer value) {
        this.endVoucher = value;
    }

    /**
     * Gets the value of the lastvoucher property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastvoucher() {
        return lastvoucher;
    }

    /**
     * Sets the value of the lastvoucher property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLastvoucher(Integer value) {
        this.lastvoucher = value;
    }

}
