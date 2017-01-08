package uk.co.stephencathcart.eventgenerator.actions;

import java.io.Serializable;
import uk.co.stephencathcart.eventgenerator.effect.Effect;
import uk.co.stephencathcart.eventgenerator.enums.ActionType;

public class EffectAction extends AbstractAction implements Serializable {
    
    private Effect effect;
    
    public EffectAction(Effect effect) {
        super(ActionType.EFFECT);
        this.effect = effect;
    }

    public Effect getEffect() {
        return effect;
    }

    public void setEffect(Effect effect) {
        this.effect = effect;
    }
}
