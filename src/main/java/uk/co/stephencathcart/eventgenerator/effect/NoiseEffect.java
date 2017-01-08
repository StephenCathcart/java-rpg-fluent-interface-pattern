package uk.co.stephencathcart.eventgenerator.effect;

import java.io.Serializable;
import uk.co.stephencathcart.eventgenerator.enums.EffectType;

public class NoiseEffect extends AbstractEffect implements Serializable {
    
    private Boolean isActive;
    private Float intensity;
    private Float color;
    
    public NoiseEffect(Boolean isActive) {
        super(EffectType.NOISE);
        this.isActive = isActive;
    }
    
     public NoiseEffect(Boolean isActive, Float intensity, Float color) {
        super(EffectType.NOISE);
        this.isActive = isActive;
        this.intensity = intensity;
        this.color = color;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Float getIntensity() {
        return intensity;
    }

    public void setIntensity(Float intensity) {
        this.intensity = intensity;
    }

    public Float getColor() {
        return color;
    }

    public void setColor(Float color) {
        this.color = color;
    }
}
