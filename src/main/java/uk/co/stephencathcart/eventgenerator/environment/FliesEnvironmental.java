package uk.co.stephencathcart.eventgenerator.environment;

import java.io.Serializable;
import uk.co.stephencathcart.eventgenerator.enums.EnvironmentType;

public class FliesEnvironmental extends AbstractEnvironmental implements Serializable {
       
    private Boolean isActive;
    
    public FliesEnvironmental(Boolean isActive) {
        super(EnvironmentType.FLIES);
        this.isActive = isActive;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    } 
}
