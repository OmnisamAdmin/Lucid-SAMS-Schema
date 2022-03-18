
package za.co.sfy.sams.lucid.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="HasElectronicContent" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="ContentSourceCom" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ContentSourcePED" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ContentSourceDBE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Data_Year" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "hasElectronicContent",
    "contentSourceCom",
    "contentSourcePED",
    "contentSourceDBE",
    "dataYear"
})
@XmlRootElement(name = "ICTElectronicContentRecords")
public class ICTElectronicContentRecords {

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "HasElectronicContent")
    @XmlSchemaType(name = "unsignedByte")
    protected Short hasElectronicContent;
    @XmlElement(name = "ContentSourceCom")
    protected String contentSourceCom;
    @XmlElement(name = "ContentSourcePED")
    protected String contentSourcePED;
    @XmlElement(name = "ContentSourceDBE")
    protected String contentSourceDBE;
    @XmlElement(name = "Data_Year")
    protected Integer dataYear;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setID(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the hasElectronicContent property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getHasElectronicContent() {
        return hasElectronicContent;
    }

    /**
     * Sets the value of the hasElectronicContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setHasElectronicContent(Short value) {
        this.hasElectronicContent = value;
    }

    /**
     * Gets the value of the contentSourceCom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentSourceCom() {
        return contentSourceCom;
    }

    /**
     * Sets the value of the contentSourceCom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentSourceCom(String value) {
        this.contentSourceCom = value;
    }

    /**
     * Gets the value of the contentSourcePED property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentSourcePED() {
        return contentSourcePED;
    }

    /**
     * Sets the value of the contentSourcePED property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentSourcePED(String value) {
        this.contentSourcePED = value;
    }

    /**
     * Gets the value of the contentSourceDBE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentSourceDBE() {
        return contentSourceDBE;
    }

    /**
     * Sets the value of the contentSourceDBE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentSourceDBE(String value) {
        this.contentSourceDBE = value;
    }

    /**
     * Gets the value of the dataYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDataYear() {
        return dataYear;
    }

    /**
     * Sets the value of the dataYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDataYear(Integer value) {
        this.dataYear = value;
    }

}
