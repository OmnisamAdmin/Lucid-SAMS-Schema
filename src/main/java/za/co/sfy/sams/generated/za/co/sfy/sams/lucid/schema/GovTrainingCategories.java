
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
 *         &lt;element name="TrainCatID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TrainCatName" minOccurs="0"&gt;
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
    "trainCatID",
    "trainCatName"
})
@XmlRootElement(name = "GovTrainingCategories")
public class GovTrainingCategories {

    @XmlElement(name = "TrainCatID")
    protected int trainCatID;
    @XmlElement(name = "TrainCatName")
    protected String trainCatName;

    /**
     * Gets the value of the trainCatID property.
     * 
     */
    public int getTrainCatID() {
        return trainCatID;
    }

    /**
     * Sets the value of the trainCatID property.
     * 
     */
    public void setTrainCatID(int value) {
        this.trainCatID = value;
    }

    /**
     * Gets the value of the trainCatName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainCatName() {
        return trainCatName;
    }

    /**
     * Sets the value of the trainCatName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainCatName(String value) {
        this.trainCatName = value;
    }

}
