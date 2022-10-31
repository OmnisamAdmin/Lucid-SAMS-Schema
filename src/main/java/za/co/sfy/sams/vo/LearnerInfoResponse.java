package za.co.sfy.sams.vo;

import za.co.sfy.sams.lucid.schema.LearnerInfo;
import za.co.sfy.sams.response.ApiResponse;

import java.io.Serializable;

/**
 * @author muzim
 */
public class LearnerInfoResponse extends ApiResponse implements Serializable {

    private static final long serialVersionUID = 232515403339057426L;

    private LearnerInfo learnerInfo;

    public LearnerInfo getLearnerInfo() {
        return learnerInfo;
    }

    public void setLearnerInfo(LearnerInfo learnerInfo) {
        this.learnerInfo = learnerInfo;
    }
}