package za.co.sfy.sams.vo;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class ExtraMuralsTeamsRequest implements Serializable {

    private static final long serialVersionUID = -6351286877318847419L;

    private Integer teamID;
    @NotNull
    private Integer exID;
    @NotBlank
    private String teamName;
    private String teamAfrName;
    @NotNull
    private Short teamAgeFrom;
    @NotNull
    private Short teamAgeTo;
    private Integer teamEdID;
    private Integer teamDepEdID;
    private byte[] teamPicture;
    private Integer teamOfficialID;
    @NotNull
    private Boolean recSelected;
    @NotNull
    private Boolean recLocked;

    public Integer getTeamID() {
        return teamID;
    }

    public void setTeamID(Integer teamID) {
        this.teamID = teamID;
    }

    public Integer getExID() {
        return exID;
    }

    public void setExID(Integer exID) {
        this.exID = exID;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamAfrName() {
        return teamAfrName;
    }

    public void setTeamAfrName(String teamAfrName) {
        this.teamAfrName = teamAfrName;
    }

    public Short getTeamAgeFrom() {
        return teamAgeFrom;
    }

    public void setTeamAgeFrom(Short teamAgeFrom) {
        this.teamAgeFrom = teamAgeFrom;
    }

    public Short getTeamAgeTo() {
        return teamAgeTo;
    }

    public void setTeamAgeTo(Short teamAgeTo) {
        this.teamAgeTo = teamAgeTo;
    }

    public Integer getTeamEdID() {
        return teamEdID;
    }

    public void setTeamEdID(Integer teamEdID) {
        this.teamEdID = teamEdID;
    }

    public Integer getTeamDepEdID() {
        return teamDepEdID;
    }

    public void setTeamDepEdID(Integer teamDepEdID) {
        this.teamDepEdID = teamDepEdID;
    }

    public byte[] getTeamPicture() {
        return teamPicture;
    }

    public void setTeamPicture(byte[] teamPicture) {
        this.teamPicture = teamPicture;
    }

    public Integer getTeamOfficialID() {
        return teamOfficialID;
    }

    public void setTeamOfficialID(Integer teamOfficialID) {
        this.teamOfficialID = teamOfficialID;
    }

    public Boolean isRecSelected() {
        return recSelected;
    }

    public void setRecSelected(Boolean recSelected) {
        this.recSelected = recSelected;
    }

    public Boolean isRecLocked() {
        return recLocked;
    }

    public void setRecLocked(Boolean recLocked) {
        this.recLocked = recLocked;
    }
}