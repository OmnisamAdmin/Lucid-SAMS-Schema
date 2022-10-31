package za.co.sfy.sams.vo;

import za.co.sfy.sams.response.ApiResponse;


import java.io.Serializable;
import za.co.sfy.sams.lucid.schema.Educatorgroups;

public class EducatorsGroupResponse extends ApiResponse implements Serializable {

    private static final long serialVersionUID = 3444883558635545805L;

    private Educatorgroups educatorGroups;

    public Educatorgroups getEducatorGroups() {
        return educatorGroups;
    }

    public void setEducatorGroups(Educatorgroups educatorGroups) {
        this.educatorGroups = educatorGroups;
    }
}