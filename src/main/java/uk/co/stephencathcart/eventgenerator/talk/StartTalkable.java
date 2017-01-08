package uk.co.stephencathcart.eventgenerator.talk;

import java.io.Serializable;
import uk.co.stephencathcart.eventgenerator.enums.DialogueType;
import uk.co.stephencathcart.eventgenerator.enums.TalkType;
import uk.co.stephencathcart.eventgenerator.enums.ToonType;

public class StartTalkable extends AbstractTalkable implements Serializable {
    
    private ToonType toon;
    private DialogueType dialogue;
    private Float duration;
    
    public StartTalkable(ToonType toon, DialogueType dialogue, Float duration) {
        super(TalkType.START);
        this.toon = toon;
        this.dialogue = dialogue;
        this.duration = duration;
    }

    public ToonType getToon() {
        return toon;
    }

    public void setToon(ToonType toon) {
        this.toon = toon;
    }

    public DialogueType getDialogue() {
        return dialogue;
    }

    public void setDialogue(DialogueType dialogue) {
        this.dialogue = dialogue;
    }

    public Float getDuration() {
        return duration;
    }

    public void setDuration(Float duration) {
        this.duration = duration;
    }
}
