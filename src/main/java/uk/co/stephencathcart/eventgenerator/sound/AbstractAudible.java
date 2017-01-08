package uk.co.stephencathcart.eventgenerator.sound;

import uk.co.stephencathcart.eventgenerator.enums.AudibleType;

public abstract class AbstractAudible implements Audible {

    private AudibleType type;

    public AbstractAudible(AudibleType type) {
        this.type = type;
    }

    @Override
    public AudibleType getType() {
        return type;
    }

    public void setType(AudibleType type) {
        this.type = type;
    }
}
