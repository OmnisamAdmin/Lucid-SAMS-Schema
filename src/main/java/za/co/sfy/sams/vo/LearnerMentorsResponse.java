package za.co.sfy.sams.vo;

import za.co.sfy.sams.response.ApiResponse;
import za.co.sfy.sams.lucid.schema.LearnerMentors;

public class LearnerMentorsResponse extends ApiResponse {

    private static final long serialVersionUID = 6212694046707967285L;

    private LearnerMentors learnerMentors;

    public LearnerMentors getLearnerMentors() {
        return learnerMentors;
    }

    public void setLearnerMentors(LearnerMentors learnerMentors) {
        this.learnerMentors = learnerMentors;
    }
}