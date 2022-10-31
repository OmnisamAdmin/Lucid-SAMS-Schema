package za.co.sfy.sams.vo;

import za.co.sfy.sams.response.ApiResponse;
import za.co.sfy.sams.lucid.schema.Hostels;

public class HostelsResponse extends ApiResponse {

    private static final long serialVersionUID = -7197514639916926736L;

    private Hostels hostels;

    public Hostels getHostels() {
        return hostels;
    }

    public void setHostels(Hostels hostels) {
        this.hostels = hostels;
    }
}