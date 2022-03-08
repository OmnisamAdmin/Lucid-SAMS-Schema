
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
 *         &lt;element name="EducatorID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="QualificationID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "educatorID",
    "qualificationID"
})
@XmlRootElement(name = "EducatorQualificationTypes")
public class EducatorQualificationTypes {

    @XmlElement(name = "EducatorID")
    protected int educatorID;
    @XmlElement(name = "QualificationID")
    protected Integer qualificationID;

    /**
     * Gets the value of the educatorID property.
     * 
     */
    public int getEducatorID() {
        return educatorID;
    }

    /**
     * Sets the value of the educatorID property.
     * 
     */
    public void setEducatorID(int value) {
        this.educatorID = value;
    }

    /**
     * Gets the value of the qualificationID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQualificationID() {
        return qualificationID;
    }

    /**
     * Sets the value of the qualificationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQualificationID(Integer value) {
        this.qualificationID = value;
    }

}
