
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
 *         &lt;element name="LetterId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LetterName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Lettertext" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="536870910"/&gt;
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
    "letterId",
    "letterName",
    "lettertext"
})
@XmlRootElement(name = "FormLetters")
public class FormLetters {

    @XmlElement(name = "LetterId")
    protected int letterId;
    @XmlElement(name = "LetterName")
    protected String letterName;
    @XmlElement(name = "Lettertext")
    protected String lettertext;

    /**
     * Gets the value of the letterId property.
     * 
     */
    public int getLetterId() {
        return letterId;
    }

    /**
     * Sets the value of the letterId property.
     * 
     */
    public void setLetterId(int value) {
        this.letterId = value;
    }

    /**
     * Gets the value of the letterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLetterName() {
        return letterName;
    }

    /**
     * Sets the value of the letterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLetterName(String value) {
        this.letterName = value;
    }

    /**
     * Gets the value of the lettertext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLettertext() {
        return lettertext;
    }

    /**
     * Sets the value of the lettertext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLettertext(String value) {
        this.lettertext = value;
    }

}
