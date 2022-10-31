package za.co.sfy.sams.vo;

import za.co.sfy.sams.response.ApiResponse;
import za.co.sfy.sams.lucid.schema.ExtraMuralsCompEvents;

public class ExtraMuralsCompEventsResponse extends ApiResponse {

    private static final long serialVersionUID = -6825414900465362582L;

    private ExtraMuralsCompEvents extraMuralsCompEvents;

    public ExtraMuralsCompEvents getExtraMuralsCompEvents() {
        return extraMuralsCompEvents;
    }

    public void setExtraMuralsCompEvents(ExtraMuralsCompEvents extraMuralsCompEvents) {
        this.extraMuralsCompEvents = extraMuralsCompEvents;
    }
}