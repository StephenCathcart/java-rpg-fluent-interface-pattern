package uk.co.stephencathcart.eventgenerator.actions;

import java.io.Serializable;

import uk.co.stephencathcart.eventgenerator.enums.ActionType;
import uk.co.stephencathcart.eventgenerator.talk.Talkable;

public class TalkAction extends AbstractAction implements Serializable {

    private Talkable talkable;
    
    public TalkAction(Talkable talkable) {
        super(ActionType.TALK);
        this.talkable = talkable;
    }

    public Talkable getTalkable() {
        return talkable;
    }

    public void setTalkable(Talkable talkable) {
        this.talkable = talkable;
    }
}
