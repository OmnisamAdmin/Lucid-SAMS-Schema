package za.co.sfy.sams.vo;

import za.co.sfy.sams.response.ApiResponse;


import java.io.Serializable;

import za.co.sfy.sams.lucid.schema.SubjectCriteria;

public class SubjectCriteriaResponse extends ApiResponse implements Serializable {

    private static final long serialVersionUID = 3444883558635545805L;

    private SubjectCriteria subjectcriteria;

    public SubjectCriteria geSubjectCriteria() {
        return subjectcriteria;
    }

    public void setSubjectCriteria(SubjectCriteria subjectcriteria) {
        this.subjectcriteria = subjectcriteria;
    }
}