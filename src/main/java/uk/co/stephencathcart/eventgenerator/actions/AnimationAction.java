package uk.co.stephencathcart.eventgenerator.actions;

import java.io.Serializable;
import uk.co.stephencathcart.eventgenerator.enums.ActionType;
import uk.co.stephencathcart.eventgenerator.enums.AnimationType;
import uk.co.stephencathcart.eventgenerator.enums.ToonType;

public class AnimationAction extends AbstractAction implements Serializable {
    
    private ToonType toon;
    private AnimationType animation;
    
    public AnimationAction(ToonType toon, AnimationType animation) {
        super(ActionType.ANIMATION);
        this.toon = toon;
        this.animation = animation;
    }    

    public ToonType getToon() {
        return toon;
    }

    public void setToon(ToonType toon) {
        this.toon = toon;
    }

    public AnimationType getAnimation() {
        return animation;
    }

    public void setAnimation(AnimationType animation) {
        this.animation = animation;
    }
}
