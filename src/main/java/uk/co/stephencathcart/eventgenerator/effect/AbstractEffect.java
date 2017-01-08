package uk.co.stephencathcart.eventgenerator.effect;

import uk.co.stephencathcart.eventgenerator.enums.EffectType;

public abstract class AbstractEffect implements Effect {

    private EffectType type;

    public AbstractEffect(EffectType type) {
        this.type = type;
    }

    @Override
    public EffectType getType() {
        return type;
    }

    public void setType(EffectType type) {
        this.type = type;
    }
}
