package za.co.sfy.sams.vo;

import za.co.sfy.sams.response.ApiResponse;
import za.co.sfy.sams.lucid.schema.CycleInfo;

import java.io.Serializable;

/**
 * @author muzim
 */
public class CycleInfoResponse extends ApiResponse implements Serializable {

    private static final long serialVersionUID = -2249834015875254089L;

    private CycleInfo cycleInfo;

    public CycleInfo getCycleInfo() {
        return cycleInfo;
    }

    public void setCycleInfo(CycleInfo cycleInfo) {
        this.cycleInfo = cycleInfo;
    }
}