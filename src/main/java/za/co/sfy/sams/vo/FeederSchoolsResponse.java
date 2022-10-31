package za.co.sfy.sams.vo;

import za.co.sfy.sams.response.ApiResponse;
import za.co.sfy.sams.lucid.schema.FeederSchools;

public class FeederSchoolsResponse extends ApiResponse {

    private static final long serialVersionUID = -7833224241471097773L;

    private FeederSchools feederSchools;

    public FeederSchools getFeederSchools() {
        return feederSchools;
    }

    public void setFeederSchools(FeederSchools feederSchools) {
        this.feederSchools = feederSchools;
    }
}