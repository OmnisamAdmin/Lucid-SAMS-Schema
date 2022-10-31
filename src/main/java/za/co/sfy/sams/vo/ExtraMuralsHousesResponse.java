package za.co.sfy.sams.vo;

import za.co.sfy.sams.response.ApiResponse;
import za.co.sfy.sams.lucid.schema.ExtraMuralsHouses;

public class ExtraMuralsHousesResponse extends ApiResponse {

    private static final long serialVersionUID = -2239313448182091624L;

    private ExtraMuralsHouses extraMuralsHouses;

    public ExtraMuralsHouses getExtraMuralsHouses() {
        return extraMuralsHouses;
    }

    public void setExtraMuralsHouses(ExtraMuralsHouses extraMuralsHouses) {
        this.extraMuralsHouses = extraMuralsHouses;
    }
}