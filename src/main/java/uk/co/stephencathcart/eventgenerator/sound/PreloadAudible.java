package uk.co.stephencathcart.eventgenerator.sound;

import java.io.Serializable;
import uk.co.stephencathcart.eventgenerator.enums.AudibleType;

public class PreloadAudible extends AbstractAudible implements Serializable {
    
    public PreloadAudible() {
        super(AudibleType.PRELOAD);
    }
}
