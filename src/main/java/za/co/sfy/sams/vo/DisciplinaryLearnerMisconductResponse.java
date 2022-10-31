package za.co.sfy.sams.vo;

import za.co.sfy.sams.response.ApiResponse;
import za.co.sfy.sams.lucid.schema.DisciplinaryLearnerMisconduct;

public class DisciplinaryLearnerMisconductResponse extends ApiResponse {

    private static final long serialVersionUID = 379069389744234265L;

    private DisciplinaryLearnerMisconduct disciplinaryLearnerMisconduct;

    public DisciplinaryLearnerMisconduct getDisciplinaryLearnerMisconduct() {
        return disciplinaryLearnerMisconduct;
    }

    public void setDisciplinaryLearnerMisconduct(DisciplinaryLearnerMisconduct disciplinaryLearnerMisconduct) {
        this.disciplinaryLearnerMisconduct = disciplinaryLearnerMisconduct;
    }
}