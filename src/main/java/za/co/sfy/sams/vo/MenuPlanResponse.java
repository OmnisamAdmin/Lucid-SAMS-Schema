package za.co.sfy.sams.vo;

import za.co.sfy.sams.response.ApiResponse;
import za.co.sfy.sams.lucid.schema.MenuPlan;

public class MenuPlanResponse extends ApiResponse {

    private static final long serialVersionUID = -252192140401200956L;

    private MenuPlan menuPlan;

    public MenuPlan getMenuPlan() {
        return menuPlan;
    }

    public void setMenuPlan(MenuPlan menuPlan) {
        this.menuPlan = menuPlan;
    }
}