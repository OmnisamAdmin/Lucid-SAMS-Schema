package za.co.sfy.sams.vo;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

public class ReligionRequest implements Serializable {

    private static final long serialVersionUID = -3010113738648211808L;

    private Integer id;
    @NotBlank
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}