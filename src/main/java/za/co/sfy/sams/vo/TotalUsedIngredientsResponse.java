package za.co.sfy.sams.vo;

import za.co.sfy.sams.response.ApiResponse;
import za.co.sfy.sams.lucid.schema.TotalUsedIngredients;

public class TotalUsedIngredientsResponse extends ApiResponse {

    private static final long serialVersionUID = -1662293001389733700L;

    private TotalUsedIngredients totalUsedIngredients;

    public TotalUsedIngredients getTotalUsedIngredients() {
        return totalUsedIngredients;
    }

    public void setTotalUsedIngredients(TotalUsedIngredients totalUsedIngredients) {
        this.totalUsedIngredients = totalUsedIngredients;
    }
}