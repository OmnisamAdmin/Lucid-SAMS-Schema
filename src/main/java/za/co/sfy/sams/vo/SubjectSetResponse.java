package za.co.sfy.sams.vo;

import za.co.sfy.sams.response.ApiResponse;


import java.io.Serializable;
import za.co.sfy.sams.lucid.schema.SubjectSets;

public class SubjectSetResponse extends ApiResponse implements Serializable {

    private static final long serialVersionUID = 3444883558635545805L;

    private SubjectSets SubjectSets;

    public SubjectSets getSubjectSets() {
        return SubjectSets;
    }

    public void setSubjectSets(SubjectSets subjectsets) {
        this.SubjectSets = subjectsets;
    }
}