package uk.co.stephencathcart.eventgenerator.talk;

import uk.co.stephencathcart.eventgenerator.enums.TalkType;

public abstract class AbstractTalkable implements Talkable {

    private TalkType type;

    public AbstractTalkable(TalkType type) {
        this.type = type;
    }

    @Override
    public TalkType getType() {
        return type;
    }

    public void setType(TalkType type) {
        this.type = type;
    }
}
