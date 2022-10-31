package za.co.sfy.sams.vo;

import za.co.sfy.sams.response.ApiResponse;
import za.co.sfy.sams.lucid.schema.ParentInfo;

import java.io.Serializable;

/**
 * @author muzim
 */
public class ParentInfoResponse extends ApiResponse implements Serializable {

    private static final long serialVersionUID = 4352828393181036222L;

    private ParentInfo parentInfo;

    public ParentInfo getParentInfo() {
        return parentInfo;
    }

    public void setParentInfo(ParentInfo parentInfo) {
        this.parentInfo = parentInfo;
    }
}