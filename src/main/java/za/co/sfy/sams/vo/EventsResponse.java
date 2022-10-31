package za.co.sfy.sams.vo;

import za.co.sfy.sams.response.ApiResponse;
import za.co.sfy.sams.lucid.schema.Events;

public class EventsResponse extends ApiResponse {

    private static final long serialVersionUID = -4728612174789723559L;

    private Events events;

    public Events getEvents() {
        return events;
    }

    public void setEvents(Events events) {
        this.events = events;
    }
}