
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
 *         &lt;element name="Meal_type" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Total_learners_Preparing_For" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Data_Year" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Feeding_Day" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Starch" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Protein" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FruitOrVeg" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Seasoning" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Starchqm" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Proteinqm" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FruitOrVegqm" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Seasoningqm" minOccurs="0"&gt;
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
    "mealType",
    "totalLearnersPreparingFor",
    "dataYear",
    "feedingDay",
    "starch",
    "protein",
    "fruitOrVeg",
    "seasoning",
    "starchqm",
    "proteinqm",
    "fruitOrVegqm",
    "seasoningqm"
})
@XmlRootElement(name = "Total_Used_Ingredients")
public class TotalUsedIngredients {

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "Meal_type")
    protected String mealType;
    @XmlElement(name = "Total_learners_Preparing_For")
    protected String totalLearnersPreparingFor;
    @XmlElement(name = "Data_Year")
    protected Integer dataYear;
    @XmlElement(name = "Feeding_Day")
    protected String feedingDay;
    @XmlElement(name = "Starch")
    protected String starch;
    @XmlElement(name = "Protein")
    protected String protein;
    @XmlElement(name = "FruitOrVeg")
    protected String fruitOrVeg;
    @XmlElement(name = "Seasoning")
    protected String seasoning;
    @XmlElement(name = "Starchqm")
    protected String starchqm;
    @XmlElement(name = "Proteinqm")
    protected String proteinqm;
    @XmlElement(name = "FruitOrVegqm")
    protected String fruitOrVegqm;
    @XmlElement(name = "Seasoningqm")
    protected String seasoningqm;

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
     * Gets the value of the mealType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMealType() {
        return mealType;
    }

    /**
     * Sets the value of the mealType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMealType(String value) {
        this.mealType = value;
    }

    /**
     * Gets the value of the totalLearnersPreparingFor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalLearnersPreparingFor() {
        return totalLearnersPreparingFor;
    }

    /**
     * Sets the value of the totalLearnersPreparingFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalLearnersPreparingFor(String value) {
        this.totalLearnersPreparingFor = value;
    }

    /**
     * Gets the value of the dataYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDataYear() {
        return dataYear;
    }

    /**
     * Sets the value of the dataYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDataYear(Integer value) {
        this.dataYear = value;
    }

    /**
     * Gets the value of the feedingDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedingDay() {
        return feedingDay;
    }

    /**
     * Sets the value of the feedingDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedingDay(String value) {
        this.feedingDay = value;
    }

    /**
     * Gets the value of the starch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStarch() {
        return starch;
    }

    /**
     * Sets the value of the starch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStarch(String value) {
        this.starch = value;
    }

    /**
     * Gets the value of the protein property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtein() {
        return protein;
    }

    /**
     * Sets the value of the protein property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtein(String value) {
        this.protein = value;
    }

    /**
     * Gets the value of the fruitOrVeg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFruitOrVeg() {
        return fruitOrVeg;
    }

    /**
     * Sets the value of the fruitOrVeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFruitOrVeg(String value) {
        this.fruitOrVeg = value;
    }

    /**
     * Gets the value of the seasoning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeasoning() {
        return seasoning;
    }

    /**
     * Sets the value of the seasoning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeasoning(String value) {
        this.seasoning = value;
    }

    /**
     * Gets the value of the starchqm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStarchqm() {
        return starchqm;
    }

    /**
     * Sets the value of the starchqm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStarchqm(String value) {
        this.starchqm = value;
    }

    /**
     * Gets the value of the proteinqm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProteinqm() {
        return proteinqm;
    }

    /**
     * Sets the value of the proteinqm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProteinqm(String value) {
        this.proteinqm = value;
    }

    /**
     * Gets the value of the fruitOrVegqm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFruitOrVegqm() {
        return fruitOrVegqm;
    }

    /**
     * Sets the value of the fruitOrVegqm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFruitOrVegqm(String value) {
        this.fruitOrVegqm = value;
    }

    /**
     * Gets the value of the seasoningqm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeasoningqm() {
        return seasoningqm;
    }

    /**
     * Sets the value of the seasoningqm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeasoningqm(String value) {
        this.seasoningqm = value;
    }

}
