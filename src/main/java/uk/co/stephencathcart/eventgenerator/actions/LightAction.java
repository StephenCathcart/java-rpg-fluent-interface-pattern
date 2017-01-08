package uk.co.stephencathcart.eventgenerator.actions;

import java.io.Serializable;
import uk.co.stephencathcart.eventgenerator.enums.ActionType;
import uk.co.stephencathcart.eventgenerator.enums.LightType;
import uk.co.stephencathcart.eventgenerator.light.Illuminant;

public class LightAction extends AbstractAction implements Serializable {
    
    private LightType light;
    private Illuminant illuminant;
    
    public LightAction(LightType light, Illuminant illuminant) {
        super(ActionType.LIGHT);
        this.light = light;
        this.illuminant = illuminant;
    }

    public LightType getLight() {
        return light;
    }

    public void setLight(LightType light) {
        this.light = light;
    }

    public Illuminant getIlluminant() {
        return illuminant;
    }

    public void setIlluminant(Illuminant illuminant) {
        this.illuminant = illuminant;
    }
}
