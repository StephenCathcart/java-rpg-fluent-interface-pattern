package uk.co.stephencathcart.eventgenerator.sound;

import java.io.Serializable;
import uk.co.stephencathcart.eventgenerator.enums.AudibleType;

public class PauseAudible extends AbstractAudible implements Serializable {

    private Boolean isPaused;

    public PauseAudible(Boolean isPaused) {
        super(AudibleType.PAUSE);
        this.isPaused = isPaused;
    }

    public Boolean getIsPaused() {
        return isPaused;
    }

    public void setIsPaused(Boolean isPaused) {
        this.isPaused = isPaused;
    }
}
