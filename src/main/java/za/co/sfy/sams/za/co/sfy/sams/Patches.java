
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
 *         &lt;element name="Patch_Ver" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Patch_Jobs" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Patch_Buccessful" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Patch_DateTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Patch_DateTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Patch_ExeVer" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
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
    "patchVer",
    "patchJobs",
    "patchBuccessful",
    "patchDateTimeStart",
    "patchDateTimeEnd",
    "patchExeVer"
})
@XmlRootElement(name = "__Patches")
public class Patches {

    @XmlElement(name = "Patch_Ver")
    protected String patchVer;
    @XmlElement(name = "Patch_Jobs")
    protected String patchJobs;
    @XmlElement(name = "Patch_Buccessful")
    protected boolean patchBuccessful;
    @XmlElement(name = "Patch_DateTimeStart")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar patchDateTimeStart;
    @XmlElement(name = "Patch_DateTimeEnd")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar patchDateTimeEnd;
    @XmlElement(name = "Patch_ExeVer")
    protected String patchExeVer;

    /**
     * Gets the value of the patchVer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatchVer() {
        return patchVer;
    }

    /**
     * Sets the value of the patchVer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatchVer(String value) {
        this.patchVer = value;
    }

    /**
     * Gets the value of the patchJobs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatchJobs() {
        return patchJobs;
    }

    /**
     * Sets the value of the patchJobs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatchJobs(String value) {
        this.patchJobs = value;
    }

    /**
     * Gets the value of the patchBuccessful property.
     * 
     */
    public boolean isPatchBuccessful() {
        return patchBuccessful;
    }

    /**
     * Sets the value of the patchBuccessful property.
     * 
     */
    public void setPatchBuccessful(boolean value) {
        this.patchBuccessful = value;
    }

    /**
     * Gets the value of the patchDateTimeStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPatchDateTimeStart() {
        return patchDateTimeStart;
    }

    /**
     * Sets the value of the patchDateTimeStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPatchDateTimeStart(XMLGregorianCalendar value) {
        this.patchDateTimeStart = value;
    }

    /**
     * Gets the value of the patchDateTimeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPatchDateTimeEnd() {
        return patchDateTimeEnd;
    }

    /**
     * Sets the value of the patchDateTimeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPatchDateTimeEnd(XMLGregorianCalendar value) {
        this.patchDateTimeEnd = value;
    }

    /**
     * Gets the value of the patchExeVer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatchExeVer() {
        return patchExeVer;
    }

    /**
     * Sets the value of the patchExeVer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatchExeVer(String value) {
        this.patchExeVer = value;
    }

}
