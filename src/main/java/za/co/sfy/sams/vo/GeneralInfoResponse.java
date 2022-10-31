package za.co.sfy.sams.vo;

import za.co.sfy.sams.response.ApiResponse;
import za.co.sfy.sams.lucid.schema.GeneralInfo;

import java.io.Serializable;


public class GeneralInfoResponse extends ApiResponse implements Serializable {

    private static final long serialVersionUID = -6453363986103920661L;

    private GeneralInfo generalInfo;

    public GeneralInfo getGeneralInfo() {
        return generalInfo;
    }

    public void setGeneralInfo(GeneralInfo generalInfo) {
        this.generalInfo = generalInfo;
    }

}