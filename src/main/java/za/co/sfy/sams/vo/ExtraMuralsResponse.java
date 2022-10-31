package za.co.sfy.sams.vo;

import za.co.sfy.sams.response.ApiResponse;
import za.co.sfy.sams.lucid.schema.ExtraMurals;

public class ExtraMuralsResponse extends ApiResponse {

    private static final long serialVersionUID = 9128884346406660611L;

    private ExtraMurals extraMurals;

    public ExtraMurals getExtraMurals() {
        return extraMurals;
    }

    public void setExtraMurals(ExtraMurals extraMurals) {
        this.extraMurals = extraMurals;
    }
}