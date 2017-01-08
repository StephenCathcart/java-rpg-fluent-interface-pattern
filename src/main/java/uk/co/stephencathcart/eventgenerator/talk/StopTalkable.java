package uk.co.stephencathcart.eventgenerator.talk;

import java.io.Serializable;
import uk.co.stephencathcart.eventgenerator.enums.TalkType;

public class StopTalkable extends AbstractTalkable implements Serializable {
    
    public StopTalkable() {
        super(TalkType.STOP);
    }
}
