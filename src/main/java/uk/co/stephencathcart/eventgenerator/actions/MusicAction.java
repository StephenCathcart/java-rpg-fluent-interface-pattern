package uk.co.stephencathcart.eventgenerator.actions;

import java.io.Serializable;

import uk.co.stephencathcart.eventgenerator.enums.ActionType;
import uk.co.stephencathcart.eventgenerator.enums.MusicType;
import uk.co.stephencathcart.eventgenerator.sound.Audible;

public class MusicAction extends AbstractAction implements Serializable {
    
    private MusicType music;
    private Audible audible;

    public MusicAction(MusicType music, Audible audible) {
        super(ActionType.MUSIC);
        this.music = music;
        this.audible = audible;
    }

    public MusicType getMusic() {
        return music;
    }

    public void setMusic(MusicType music) {
        this.music = music;
    }

    public Audible getAudible() {
        return audible;
    }

    public void setAudible(Audible audible) {
        this.audible = audible;
    }
}
