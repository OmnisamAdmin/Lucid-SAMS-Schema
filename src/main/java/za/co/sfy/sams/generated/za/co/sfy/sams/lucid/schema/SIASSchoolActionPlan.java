
package za.co.sfy.sams.lucid.schema;

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
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Stregnth_Needs_Area" minOccurs="0"&gt;
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
    "id",
    "stregnthNeedsArea"
})
@XmlRootElement(name = "SIAS_School_Action_Plan")
public class SIASSchoolActionPlan {

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "Stregnth_Needs_Area")
    protected String stregnthNeedsArea;

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
     * Gets the value of the stregnthNeedsArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStregnthNeedsArea() {
        return stregnthNeedsArea;
    }

    /**
     * Sets the value of the stregnthNeedsArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStregnthNeedsArea(String value) {
        this.stregnthNeedsArea = value;
    }

}
