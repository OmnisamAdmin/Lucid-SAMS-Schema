package za.co.sfy.sams.vo;

import za.co.sfy.sams.response.ApiResponse;
import za.co.sfy.sams.lucid.schema.SchoolTerms;

import java.io.Serializable;

public class SchoolTermsResponse extends ApiResponse implements Serializable {

    private static final long serialVersionUID = 600573760682851371L;

    private SchoolTerms schoolTerms;

    public SchoolTerms getSchoolTerms() {
        return schoolTerms;
    }

    public void setSchoolTerms(SchoolTerms schoolTerms) {
        this.schoolTerms = schoolTerms;
    }
}