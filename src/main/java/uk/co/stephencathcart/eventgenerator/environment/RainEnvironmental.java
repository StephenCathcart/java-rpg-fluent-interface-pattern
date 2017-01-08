package uk.co.stephencathcart.eventgenerator.environment;

import java.io.Serializable;
import uk.co.stephencathcart.eventgenerator.enums.EnvironmentType;

public class RainEnvironmental extends AbstractEnvironmental implements Serializable {
    
    private Boolean isActive;
    
    public RainEnvironmental(Boolean isActive) {
        super(EnvironmentType.RAIN);
        this.isActive = isActive;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
}
