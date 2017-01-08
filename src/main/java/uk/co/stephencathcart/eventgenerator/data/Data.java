package uk.co.stephencathcart.eventgenerator.data;

import java.io.Serializable;
import java.util.List;

public class Data implements Serializable {

    private List<Event> events;
    
    public Data() {
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        if(events != null && !events.isEmpty()){
            Integer eventId = 0;
            for(Event event : events){
                event.setEventId(++eventId);
            }
        }
        this.events = events;
    }
}
