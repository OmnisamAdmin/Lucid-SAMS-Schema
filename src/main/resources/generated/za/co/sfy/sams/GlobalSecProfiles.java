
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
 *         &lt;element name="ProfID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ProfLevel" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="ProfName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
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
    "profID",
    "profLevel",
    "profName"
})
@XmlRootElement(name = "GlobalSecProfiles")
public class GlobalSecProfiles {

    @XmlElement(name = "ProfID")
    protected int profID;
    @XmlElement(name = "ProfLevel")
    @XmlSchemaType(name = "unsignedByte")
    protected Short profLevel;
    @XmlElement(name = "ProfName")
    protected String profName;

    /**
     * Gets the value of the profID property.
     * 
     */
    public int getProfID() {
        return profID;
    }

    /**
     * Sets the value of the profID property.
     * 
     */
    public void setProfID(int value) {
        this.profID = value;
    }

    /**
     * Gets the value of the profLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getProfLevel() {
        return profLevel;
    }

    /**
     * Sets the value of the profLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setProfLevel(Short value) {
        this.profLevel = value;
    }

    /**
     * Gets the value of the profName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfName() {
        return profName;
    }

    /**
     * Sets the value of the profName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfName(String value) {
        this.profName = value;
    }

}
