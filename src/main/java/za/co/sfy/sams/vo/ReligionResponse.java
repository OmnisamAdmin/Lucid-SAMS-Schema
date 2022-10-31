package za.co.sfy.sams.vo;

import za.co.sfy.sams.response.ApiResponse;
import za.co.sfy.sams.lucid.schema.Religion;

public class ReligionResponse extends ApiResponse {

    private static final long serialVersionUID = -2008707320051958243L;

    private Religion religion;

    public Religion getReligion() {
        return religion;
    }

    public void setReligion(Religion religion) {
        this.religion = religion;
    }
}