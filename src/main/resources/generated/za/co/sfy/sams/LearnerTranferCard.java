
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
 *         &lt;element name="LearnerId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DateIssued" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ReportMarksDatayear" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PassYear" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PassGrade" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LinkID" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
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
    "learnerId",
    "dateIssued",
    "reportMarksDatayear",
    "passYear",
    "passGrade",
    "linkID"
})
@XmlRootElement(name = "LearnerTranferCard")
public class LearnerTranferCard {

    @XmlElement(name = "LearnerId")
    protected Integer learnerId;
    @XmlElement(name = "DateIssued")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateIssued;
    @XmlElement(name = "ReportMarksDatayear")
    protected String reportMarksDatayear;
    @XmlElement(name = "PassYear")
    protected String passYear;
    @XmlElement(name = "PassGrade")
    protected Integer passGrade;
    @XmlElement(name = "LinkID")
    @XmlSchemaType(name = "unsignedByte")
    protected Short linkID;

    /**
     * Gets the value of the learnerId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLearnerId() {
        return learnerId;
    }

    /**
     * Sets the value of the learnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLearnerId(Integer value) {
        this.learnerId = value;
    }

    /**
     * Gets the value of the dateIssued property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateIssued() {
        return dateIssued;
    }

    /**
     * Sets the value of the dateIssued property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateIssued(XMLGregorianCalendar value) {
        this.dateIssued = value;
    }

    /**
     * Gets the value of the reportMarksDatayear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportMarksDatayear() {
        return reportMarksDatayear;
    }

    /**
     * Sets the value of the reportMarksDatayear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportMarksDatayear(String value) {
        this.reportMarksDatayear = value;
    }

    /**
     * Gets the value of the passYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassYear() {
        return passYear;
    }

    /**
     * Sets the value of the passYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassYear(String value) {
        this.passYear = value;
    }

    /**
     * Gets the value of the passGrade property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPassGrade() {
        return passGrade;
    }

    /**
     * Sets the value of the passGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPassGrade(Integer value) {
        this.passGrade = value;
    }

    /**
     * Gets the value of the linkID property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getLinkID() {
        return linkID;
    }

    /**
     * Sets the value of the linkID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setLinkID(Short value) {
        this.linkID = value;
    }

}
