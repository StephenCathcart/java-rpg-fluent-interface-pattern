package uk.co.stephencathcart.eventgenerator.actions;

import java.io.Serializable;

import uk.co.stephencathcart.eventgenerator.enums.ActionType;

public class PauseAction extends AbstractAction implements Serializable {

    private Float duration;

    public PauseAction(Float duration) {
        super(ActionType.PAUSE);
        this.duration = duration;
    }

    public Float getDuration() {
        return duration;
    }

    public void setDuration(Float duration) {
        this.duration = duration;
    }
}
