package uk.co.stephencathcart.eventgenerator.environment;

import java.io.Serializable;
import uk.co.stephencathcart.eventgenerator.enums.EnvironmentType;

public class FadeEnvironmental extends AbstractEnvironmental implements Serializable {

    public FadeEnvironmental() {
        super(EnvironmentType.SCREEN_FADE);
    }
}
