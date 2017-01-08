package uk.co.stephencathcart.eventgenerator.sound;

import java.io.Serializable;
import uk.co.stephencathcart.eventgenerator.enums.AudibleType;

public class MuteAudible extends AbstractAudible implements Serializable {

    private Boolean isMuted;

    public MuteAudible(Boolean isMuted) {
        super(AudibleType.MUTE);
        this.isMuted = isMuted;
    }

    public Boolean getIsMuted() {
        return isMuted;
    }

    public void setIsMuted(Boolean isMuted) {
        this.isMuted = isMuted;
    }

}
