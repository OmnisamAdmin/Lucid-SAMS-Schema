package za.co.sfy.sams.vo;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author muzim
 */
public class CycleInfoRequest implements Serializable {

    private static final long serialVersionUID = 4802851169585541994L;

    @NotBlank
    private String schoolname;
    @NotNull
    private Integer fetDays;
    @NotNull
    private Integer rooms;
    @NotNull
    private Integer fetPeriods;
    @NotNull
    private Integer lowestGrade;
    @NotNull
    private Integer highestGrade;
    @NotNull
    private Integer feTlength;
    @NotBlank
    private String lsen;
    @NotBlank
    private String remedial;
    @NotNull
    private Integer fetTotal;
    @NotNull
    private Integer getDays;
    @NotNull
    private Integer getPeriods;
    @NotNull
    private Integer getLength;
    @NotNull
    private Integer getTotal;
    @NotNull
    private Boolean lsenSchool;
    @NotNull
    private Integer sneSpec;

    private String sneSpecOther;
    @NotNull
    private Short schoolType;
    @NotBlank
    private String multiGrade;
    @NotBlank
    private String sid;
    @NotNull
    private Integer sidLowestYear;
    @NotNull
    private Integer sidHighestYear;

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public Integer getFetDays() {
        return fetDays;
    }

    public void setFetDays(Integer fetDays) {
        this.fetDays = fetDays;
    }

    public Integer getRooms() {
        return rooms;
    }

    public void setRooms(Integer rooms) {
        this.rooms = rooms;
    }

    public Integer getFetPeriods() {
        return fetPeriods;
    }

    public void setFetPeriods(Integer fetPeriods) {
        this.fetPeriods = fetPeriods;
    }

    public Integer getLowestGrade() {
        return lowestGrade;
    }

    public void setLowestGrade(Integer lowestGrade) {
        this.lowestGrade = lowestGrade;
    }

    public Integer getHighestGrade() {
        return highestGrade;
    }

    public void setHighestGrade(Integer highestGrade) {
        this.highestGrade = highestGrade;
    }

    public Integer getFeTlength() {
        return feTlength;
    }

    public void setFeTlength(Integer feTlength) {
        this.feTlength = feTlength;
    }

    public String getLsen() {
        return lsen;
    }

    public void setLsen(String lsen) {
        this.lsen = lsen;
    }

    public String getRemedial() {
        return remedial;
    }

    public void setRemedial(String remedial) {
        this.remedial = remedial;
    }

    public Integer getFetTotal() {
        return fetTotal;
    }

    public void setFetTotal(Integer fetTotal) {
        this.fetTotal = fetTotal;
    }

    public Integer getGetDays() {
        return getDays;
    }

    public void setGetDays(Integer getDays) {
        this.getDays = getDays;
    }

    public Integer getGetPeriods() {
        return getPeriods;
    }

    public void setGetPeriods(Integer getPeriods) {
        this.getPeriods = getPeriods;
    }

    public Integer getGetLength() {
        return getLength;
    }

    public void setGetLength(Integer getLength) {
        this.getLength = getLength;
    }

    public Integer getGetTotal() {
        return getTotal;
    }

    public void setGetTotal(Integer getTotal) {
        this.getTotal = getTotal;
    }

    public Boolean isLsenSchool() {
        return lsenSchool;
    }

    public void setLsenSchool(Boolean lsenSchool) {
        this.lsenSchool = lsenSchool;
    }

    public Integer getSneSpec() {
        return sneSpec;
    }

    public void setSneSpec(Integer sneSpec) {
        this.sneSpec = sneSpec;
    }

    public String getSneSpecOther() {
        return sneSpecOther;
    }

    public void setSneSpecOther(String sneSpecOther) {
        this.sneSpecOther = sneSpecOther;
    }

    public Short getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(Short schoolType) {
        this.schoolType = schoolType;
    }

    public String getMultiGrade() {
        return multiGrade;
    }

    public void setMultiGrade(String multiGrade) {
        this.multiGrade = multiGrade;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public Integer getSidLowestYear() {
        return sidLowestYear;
    }

    public void setSidLowestYear(Integer sidLowestYear) {
        this.sidLowestYear = sidLowestYear;
    }

    public Integer getSidHighestYear() {
        return sidHighestYear;
    }

    public void setSidHighestYear(Integer sidHighestYear) {
        this.sidHighestYear = sidHighestYear;
    }
}