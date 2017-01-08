package uk.co.stephencathcart.eventgenerator.environment;

import java.io.Serializable;
import uk.co.stephencathcart.eventgenerator.enums.EnvironmentType;
import uk.co.stephencathcart.eventgenerator.enums.ObjectType;

public class LightFlickerEnvironmental extends AbstractEnvironmental implements Serializable {
    
    private ObjectType object;
    
    public LightFlickerEnvironmental(ObjectType object) {
        super(EnvironmentType.LIGHT_FLICKER);
        this.object = object;
    }

    public ObjectType getObject() {
        return object;
    }

    public void setObject(ObjectType object) {
        this.object = object;
    }
}
