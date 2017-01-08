package uk.co.stephencathcart.eventgenerator.environment;

import java.io.Serializable;
import uk.co.stephencathcart.eventgenerator.enums.EnvironmentType;

public class ThunderEnvironmental extends AbstractEnvironmental implements Serializable {
    
    private Boolean isActive;
    private Float volume;
    
    public ThunderEnvironmental(Boolean isActive) {
        super(EnvironmentType.THUNDER);
        this.isActive = isActive;
    }
    
    public ThunderEnvironmental(Boolean isActive, Float volume) {
        super(EnvironmentType.THUNDER);
        this.isActive = isActive;
        this.volume = volume;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Float getVolume() {
        return volume;
    }

    public void setVolume(Float volume) {
        this.volume = volume;
    }
}
