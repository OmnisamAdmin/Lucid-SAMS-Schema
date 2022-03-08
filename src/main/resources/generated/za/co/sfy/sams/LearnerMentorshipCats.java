
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
 *         &lt;element name="CatID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CatDesc" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CatDescAfr" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
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
    "catID",
    "catDesc",
    "catDescAfr"
})
@XmlRootElement(name = "LearnerMentorshipCats")
public class LearnerMentorshipCats {

    @XmlElement(name = "CatID")
    protected int catID;
    @XmlElement(name = "CatDesc")
    protected String catDesc;
    @XmlElement(name = "CatDescAfr")
    protected String catDescAfr;

    /**
     * Gets the value of the catID property.
     * 
     */
    public int getCatID() {
        return catID;
    }

    /**
     * Sets the value of the catID property.
     * 
     */
    public void setCatID(int value) {
        this.catID = value;
    }

    /**
     * Gets the value of the catDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatDesc() {
        return catDesc;
    }

    /**
     * Sets the value of the catDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatDesc(String value) {
        this.catDesc = value;
    }

    /**
     * Gets the value of the catDescAfr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatDescAfr() {
        return catDescAfr;
    }

    /**
     * Sets the value of the catDescAfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatDescAfr(String value) {
        this.catDescAfr = value;
    }

}
