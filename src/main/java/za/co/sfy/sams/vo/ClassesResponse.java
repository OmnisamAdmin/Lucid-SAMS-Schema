package za.co.sfy.sams.vo;

import za.co.sfy.sams.response.ApiResponse;
import za.co.sfy.sams.lucid.schema.Classes;

import java.io.Serializable;

/**
 * @author muzim
 */
public class ClassesResponse extends ApiResponse implements Serializable {

    private static final long serialVersionUID = -3589845286109705296L;

    private Classes classes;

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }
}