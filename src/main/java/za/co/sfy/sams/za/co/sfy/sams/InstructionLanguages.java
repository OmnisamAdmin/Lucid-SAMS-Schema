
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
 *         &lt;element name="LangID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LangDesc" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
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
    "langID",
    "langDesc"
})
@XmlRootElement(name = "InstructionLanguages")
public class InstructionLanguages {

    @XmlElement(name = "LangID")
    protected int langID;
    @XmlElement(name = "LangDesc")
    protected String langDesc;

    /**
     * Gets the value of the langID property.
     * 
     */
    public int getLangID() {
        return langID;
    }

    /**
     * Sets the value of the langID property.
     * 
     */
    public void setLangID(int value) {
        this.langID = value;
    }

    /**
     * Gets the value of the langDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangDesc() {
        return langDesc;
    }

    /**
     * Sets the value of the langDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangDesc(String value) {
        this.langDesc = value;
    }

}
