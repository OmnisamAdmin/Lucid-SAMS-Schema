package za.co.sfy.sams.vo;

import za.co.sfy.sams.response.ApiResponse;
import za.co.sfy.sams.lucid.schema.DetentionNotificationSettings;

public class DetentionNotificationSettingsResponse extends ApiResponse {

    private static final long serialVersionUID = 8831393276056445143L;

    private DetentionNotificationSettings detentionNotificationSettings;

    public DetentionNotificationSettings getDetentionNotificationSettings() {
        return detentionNotificationSettings;
    }

    public void setDetentionNotificationSettings(DetentionNotificationSettings detentionNotificationSettings) {
        this.detentionNotificationSettings = detentionNotificationSettings;
    }
}