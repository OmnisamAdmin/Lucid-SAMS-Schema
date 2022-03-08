
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
 *         &lt;element name="TaskType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IsForLanguage" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Desc_English" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Desc_Afrikaans" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Desc_IsiNdebele" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Desc_IsiXhosa" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Desc_IsiZulu" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Desc_Sepedi" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Desc_Sesotho" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Desc_Setswana" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Desc_SiSwati" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Desc_Tshivenda" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Desc_Xitsonga" minOccurs="0"&gt;
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
    "taskType",
    "isForLanguage",
    "descEnglish",
    "descAfrikaans",
    "descIsiNdebele",
    "descIsiXhosa",
    "descIsiZulu",
    "descSepedi",
    "descSesotho",
    "descSetswana",
    "descSiSwati",
    "descTshivenda",
    "descXitsonga"
})
@XmlRootElement(name = "SubjectCriteriaTypes")
public class SubjectCriteriaTypes {

    @XmlElement(name = "TaskType")
    protected int taskType;
    @XmlElement(name = "IsForLanguage")
    protected boolean isForLanguage;
    @XmlElement(name = "Desc_English")
    protected String descEnglish;
    @XmlElement(name = "Desc_Afrikaans")
    protected String descAfrikaans;
    @XmlElement(name = "Desc_IsiNdebele")
    protected String descIsiNdebele;
    @XmlElement(name = "Desc_IsiXhosa")
    protected String descIsiXhosa;
    @XmlElement(name = "Desc_IsiZulu")
    protected String descIsiZulu;
    @XmlElement(name = "Desc_Sepedi")
    protected String descSepedi;
    @XmlElement(name = "Desc_Sesotho")
    protected String descSesotho;
    @XmlElement(name = "Desc_Setswana")
    protected String descSetswana;
    @XmlElement(name = "Desc_SiSwati")
    protected String descSiSwati;
    @XmlElement(name = "Desc_Tshivenda")
    protected String descTshivenda;
    @XmlElement(name = "Desc_Xitsonga")
    protected String descXitsonga;

    /**
     * Gets the value of the taskType property.
     * 
     */
    public int getTaskType() {
        return taskType;
    }

    /**
     * Sets the value of the taskType property.
     * 
     */
    public void setTaskType(int value) {
        this.taskType = value;
    }

    /**
     * Gets the value of the isForLanguage property.
     * 
     */
    public boolean isIsForLanguage() {
        return isForLanguage;
    }

    /**
     * Sets the value of the isForLanguage property.
     * 
     */
    public void setIsForLanguage(boolean value) {
        this.isForLanguage = value;
    }

    /**
     * Gets the value of the descEnglish property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescEnglish() {
        return descEnglish;
    }

    /**
     * Sets the value of the descEnglish property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescEnglish(String value) {
        this.descEnglish = value;
    }

    /**
     * Gets the value of the descAfrikaans property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescAfrikaans() {
        return descAfrikaans;
    }

    /**
     * Sets the value of the descAfrikaans property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescAfrikaans(String value) {
        this.descAfrikaans = value;
    }

    /**
     * Gets the value of the descIsiNdebele property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescIsiNdebele() {
        return descIsiNdebele;
    }

    /**
     * Sets the value of the descIsiNdebele property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescIsiNdebele(String value) {
        this.descIsiNdebele = value;
    }

    /**
     * Gets the value of the descIsiXhosa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescIsiXhosa() {
        return descIsiXhosa;
    }

    /**
     * Sets the value of the descIsiXhosa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescIsiXhosa(String value) {
        this.descIsiXhosa = value;
    }

    /**
     * Gets the value of the descIsiZulu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescIsiZulu() {
        return descIsiZulu;
    }

    /**
     * Sets the value of the descIsiZulu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescIsiZulu(String value) {
        this.descIsiZulu = value;
    }

    /**
     * Gets the value of the descSepedi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescSepedi() {
        return descSepedi;
    }

    /**
     * Sets the value of the descSepedi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescSepedi(String value) {
        this.descSepedi = value;
    }

    /**
     * Gets the value of the descSesotho property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescSesotho() {
        return descSesotho;
    }

    /**
     * Sets the value of the descSesotho property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescSesotho(String value) {
        this.descSesotho = value;
    }

    /**
     * Gets the value of the descSetswana property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescSetswana() {
        return descSetswana;
    }

    /**
     * Sets the value of the descSetswana property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescSetswana(String value) {
        this.descSetswana = value;
    }

    /**
     * Gets the value of the descSiSwati property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescSiSwati() {
        return descSiSwati;
    }

    /**
     * Sets the value of the descSiSwati property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescSiSwati(String value) {
        this.descSiSwati = value;
    }

    /**
     * Gets the value of the descTshivenda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescTshivenda() {
        return descTshivenda;
    }

    /**
     * Sets the value of the descTshivenda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescTshivenda(String value) {
        this.descTshivenda = value;
    }

    /**
     * Gets the value of the descXitsonga property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescXitsonga() {
        return descXitsonga;
    }

    /**
     * Sets the value of the descXitsonga property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescXitsonga(String value) {
        this.descXitsonga = value;
    }

}
