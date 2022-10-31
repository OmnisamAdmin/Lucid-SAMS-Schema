package za.co.sfy.sams.vo;

import za.co.sfy.sams.response.ApiResponse;
import za.co.sfy.sams.lucid.schema.DisciplinaryRecords;

public class DisciplinaryRecordsResponse extends ApiResponse {
    private static final long serialVersionUID = 8512952829934097102L;

    private DisciplinaryRecords disciplinaryRecords;

    public DisciplinaryRecords getDisciplinaryRecords() {
        return disciplinaryRecords;
    }

    public void setDisciplinaryRecords(DisciplinaryRecords disciplinaryRecords) {
        this.disciplinaryRecords = disciplinaryRecords;
    }
}