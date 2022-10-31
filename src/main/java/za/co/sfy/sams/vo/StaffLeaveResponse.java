package za.co.sfy.sams.vo;

import za.co.sfy.sams.response.ApiResponse;
import za.co.sfy.sams.lucid.schema.StaffLeave;

public class StaffLeaveResponse extends ApiResponse {

    private static final long serialVersionUID = -8597897687508222641L;

    private StaffLeave staffLeave;

    public StaffLeave getStaffLeave() {
        return staffLeave;
    }

    public void setStaffLeave(StaffLeave staffLeave) {
        this.staffLeave = staffLeave;
    }
}