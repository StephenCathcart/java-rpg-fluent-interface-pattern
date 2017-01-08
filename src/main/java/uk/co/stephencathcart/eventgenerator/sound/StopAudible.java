package uk.co.stephencathcart.eventgenerator.sound;

import java.io.Serializable;
import uk.co.stephencathcart.eventgenerator.enums.AudibleType;

public class StopAudible extends AbstractAudible implements Serializable {

    public StopAudible() {
        super(AudibleType.STOP);
    }
}
