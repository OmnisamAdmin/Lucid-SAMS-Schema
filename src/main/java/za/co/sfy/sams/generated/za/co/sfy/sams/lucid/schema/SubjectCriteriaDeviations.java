
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
 *         &lt;element name="OffCriterionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ProvinceNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CriterionScore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Weighting" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SBAWeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="FixedCriterionScore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FixedWeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="FixedSBAWeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Fixed0Weight" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "offCriterionId",
    "provinceNo",
    "criterionScore",
    "weighting",
    "sbaWeight",
    "fixedCriterionScore",
    "fixedWeight",
    "fixedSBAWeight",
    "fixed0Weight"
})
@XmlRootElement(name = "SubjectCriteriaDeviations")
public class SubjectCriteriaDeviations {

    @XmlElement(name = "OffCriterionId")
    protected Integer offCriterionId;
    @XmlElement(name = "ProvinceNo")
    protected Integer provinceNo;
    @XmlElement(name = "CriterionScore")
    protected Integer criterionScore;
    @XmlElement(name = "Weighting")
    protected Double weighting;
    @XmlElement(name = "SBAWeight")
    protected Double sbaWeight;
    @XmlElement(name = "FixedCriterionScore")
    protected Integer fixedCriterionScore;
    @XmlElement(name = "FixedWeight")
    protected Double fixedWeight;
    @XmlElement(name = "FixedSBAWeight")
    protected Double fixedSBAWeight;
    @XmlElement(name = "Fixed0Weight")
    protected boolean fixed0Weight;

    /**
     * Gets the value of the offCriterionId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOffCriterionId() {
        return offCriterionId;
    }

    /**
     * Sets the value of the offCriterionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOffCriterionId(Integer value) {
        this.offCriterionId = value;
    }

    /**
     * Gets the value of the provinceNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProvinceNo() {
        return provinceNo;
    }

    /**
     * Sets the value of the provinceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProvinceNo(Integer value) {
        this.provinceNo = value;
    }

    /**
     * Gets the value of the criterionScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCriterionScore() {
        return criterionScore;
    }

    /**
     * Sets the value of the criterionScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCriterionScore(Integer value) {
        this.criterionScore = value;
    }

    /**
     * Gets the value of the weighting property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWeighting() {
        return weighting;
    }

    /**
     * Sets the value of the weighting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeighting(Double value) {
        this.weighting = value;
    }

    /**
     * Gets the value of the sbaWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSBAWeight() {
        return sbaWeight;
    }

    /**
     * Sets the value of the sbaWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSBAWeight(Double value) {
        this.sbaWeight = value;
    }

    /**
     * Gets the value of the fixedCriterionScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFixedCriterionScore() {
        return fixedCriterionScore;
    }

    /**
     * Sets the value of the fixedCriterionScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFixedCriterionScore(Integer value) {
        this.fixedCriterionScore = value;
    }

    /**
     * Gets the value of the fixedWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFixedWeight() {
        return fixedWeight;
    }

    /**
     * Sets the value of the fixedWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFixedWeight(Double value) {
        this.fixedWeight = value;
    }

    /**
     * Gets the value of the fixedSBAWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFixedSBAWeight() {
        return fixedSBAWeight;
    }

    /**
     * Sets the value of the fixedSBAWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFixedSBAWeight(Double value) {
        this.fixedSBAWeight = value;
    }

    /**
     * Gets the value of the fixed0Weight property.
     * 
     */
    public boolean isFixed0Weight() {
        return fixed0Weight;
    }

    /**
     * Sets the value of the fixed0Weight property.
     * 
     */
    public void setFixed0Weight(boolean value) {
        this.fixed0Weight = value;
    }

}
