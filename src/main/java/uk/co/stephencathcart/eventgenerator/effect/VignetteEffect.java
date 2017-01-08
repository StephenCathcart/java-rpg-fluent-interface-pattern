package uk.co.stephencathcart.eventgenerator.effect;

import java.io.Serializable;
import uk.co.stephencathcart.eventgenerator.enums.EffectType;

public class VignetteEffect extends AbstractEffect implements Serializable {
    
    private Boolean isActive;
    private Float distance;
    private Float speed;
    
    public VignetteEffect(Boolean isActive) {
        super(EffectType.VIGNETTE);
        this.isActive = isActive;
    }
    
    public VignetteEffect(Boolean isActive, Float distance, Float speed) {
        super(EffectType.VIGNETTE);
        this.isActive = isActive;
        this.distance = distance;
        this.speed = speed;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }

    public Float getSpeed() {
        return speed;
    }

    public void setSpeed(Float speed) {
        this.speed = speed;
    }
}
