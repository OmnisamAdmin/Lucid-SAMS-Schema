
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
 *         &lt;element name="SGBID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DateElected" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DateEnded" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
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
    "sgbid",
    "dateElected",
    "dateEnded"
})
@XmlRootElement(name = "SchoolGovBodies")
public class SchoolGovBodies {

    @XmlElement(name = "SGBID")
    protected int sgbid;
    @XmlElement(name = "DateElected")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateElected;
    @XmlElement(name = "DateEnded")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateEnded;

    /**
     * Gets the value of the sgbid property.
     * 
     */
    public int getSGBID() {
        return sgbid;
    }

    /**
     * Sets the value of the sgbid property.
     * 
     */
    public void setSGBID(int value) {
        this.sgbid = value;
    }

    /**
     * Gets the value of the dateElected property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateElected() {
        return dateElected;
    }

    /**
     * Sets the value of the dateElected property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateElected(XMLGregorianCalendar value) {
        this.dateElected = value;
    }

    /**
     * Gets the value of the dateEnded property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateEnded() {
        return dateEnded;
    }

    /**
     * Sets the value of the dateEnded property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateEnded(XMLGregorianCalendar value) {
        this.dateEnded = value;
    }

}
