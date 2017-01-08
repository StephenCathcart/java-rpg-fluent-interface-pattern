package uk.co.stephencathcart.eventgenerator.actions;

import java.io.Serializable;
import uk.co.stephencathcart.eventgenerator.enums.ActionType;
import uk.co.stephencathcart.eventgenerator.enums.SoundType;
import uk.co.stephencathcart.eventgenerator.sound.Audible;

public class SoundAction extends AbstractAction implements Serializable {

    private SoundType sound;
    private Audible audible;

    public SoundAction(SoundType sound, Audible audible) {
        super(ActionType.SOUND);
        this.audible = audible;
        this.sound = sound;
    }

    public SoundType getSound() {
        return sound;
    }

    public void setSound(SoundType sound) {
        this.sound = sound;
    }

    public Audible getAudible() {
        return audible;
    }

    public void setAudible(Audible audible) {
        this.audible = audible;
    }
}
