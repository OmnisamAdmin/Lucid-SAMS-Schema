
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
 *         &lt;element name="TransactionFileID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TransactionFileCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TransactionFileName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TransactionFileSeqNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "transactionFileID",
    "transactionFileCode",
    "transactionFileName",
    "transactionFileSeqNo"
})
@XmlRootElement(name = "TransactionFiles")
public class TransactionFiles {

    @XmlElement(name = "TransactionFileID")
    protected int transactionFileID;
    @XmlElement(name = "TransactionFileCode")
    protected String transactionFileCode;
    @XmlElement(name = "TransactionFileName")
    protected String transactionFileName;
    @XmlElement(name = "TransactionFileSeqNo")
    protected Integer transactionFileSeqNo;

    /**
     * Gets the value of the transactionFileID property.
     * 
     */
    public int getTransactionFileID() {
        return transactionFileID;
    }

    /**
     * Sets the value of the transactionFileID property.
     * 
     */
    public void setTransactionFileID(int value) {
        this.transactionFileID = value;
    }

    /**
     * Gets the value of the transactionFileCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionFileCode() {
        return transactionFileCode;
    }

    /**
     * Sets the value of the transactionFileCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionFileCode(String value) {
        this.transactionFileCode = value;
    }

    /**
     * Gets the value of the transactionFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionFileName() {
        return transactionFileName;
    }

    /**
     * Sets the value of the transactionFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionFileName(String value) {
        this.transactionFileName = value;
    }

    /**
     * Gets the value of the transactionFileSeqNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransactionFileSeqNo() {
        return transactionFileSeqNo;
    }

    /**
     * Sets the value of the transactionFileSeqNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransactionFileSeqNo(Integer value) {
        this.transactionFileSeqNo = value;
    }

}
