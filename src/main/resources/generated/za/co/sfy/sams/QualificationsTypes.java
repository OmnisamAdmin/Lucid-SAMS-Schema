
package za.co.sfy.sams;

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
 *         &lt;element name="QualType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="QualNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="QualDesc" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
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
    "qualType",
    "qualNo",
    "qualDesc"
})
@XmlRootElement(name = "QualificationsTypes")
public class QualificationsTypes {

    @XmlElement(name = "QualType")
    @XmlSchemaType(name = "unsignedByte")
    protected Short qualType;
    @XmlElement(name = "QualNo")
    protected Integer qualNo;
    @XmlElement(name = "QualDesc")
    protected String qualDesc;

    /**
     * Gets the value of the qualType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getQualType() {
        return qualType;
    }

    /**
     * Sets the value of the qualType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setQualType(Short value) {
        this.qualType = value;
    }

    /**
     * Gets the value of the qualNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQualNo() {
        return qualNo;
    }

    /**
     * Sets the value of the qualNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQualNo(Integer value) {
        this.qualNo = value;
    }

    /**
     * Gets the value of the qualDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualDesc() {
        return qualDesc;
    }

    /**
     * Sets the value of the qualDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualDesc(String value) {
        this.qualDesc = value;
    }

}
