
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
 *         &lt;element name="HseID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LinkIDType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="LinkID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LinkPosition" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
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
    "hseID",
    "linkIDType",
    "linkID",
    "linkPosition"
})
@XmlRootElement(name = "ExtraMuralsHousesLinks")
public class ExtraMuralsHousesLinks {

    @XmlElement(name = "HseID")
    protected Integer hseID;
    @XmlElement(name = "LinkIDType")
    @XmlSchemaType(name = "unsignedByte")
    protected Short linkIDType;
    @XmlElement(name = "LinkID")
    protected Integer linkID;
    @XmlElement(name = "LinkPosition")
    @XmlSchemaType(name = "unsignedByte")
    protected Short linkPosition;

    /**
     * Gets the value of the hseID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHseID() {
        return hseID;
    }

    /**
     * Sets the value of the hseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHseID(Integer value) {
        this.hseID = value;
    }

    /**
     * Gets the value of the linkIDType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getLinkIDType() {
        return linkIDType;
    }

    /**
     * Sets the value of the linkIDType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setLinkIDType(Short value) {
        this.linkIDType = value;
    }

    /**
     * Gets the value of the linkID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLinkID() {
        return linkID;
    }

    /**
     * Sets the value of the linkID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLinkID(Integer value) {
        this.linkID = value;
    }

    /**
     * Gets the value of the linkPosition property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getLinkPosition() {
        return linkPosition;
    }

    /**
     * Sets the value of the linkPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setLinkPosition(Short value) {
        this.linkPosition = value;
    }

}
