package za.co.sfy.sams.vo;

import za.co.sfy.sams.response.ApiResponse;
import za.co.sfy.sams.lucid.schema.ParentChild;

import java.io.Serializable;

/**
 * @author muzim
 */
public class ParentChildResponse extends ApiResponse implements Serializable {

    private static final long serialVersionUID = 8696831915413743007L;

    private ParentChild parentChild;

    public ParentChild getParentChild() {
        return parentChild;
    }

    public void setParentChild(ParentChild parentChild) {
        this.parentChild = parentChild;
    }
}