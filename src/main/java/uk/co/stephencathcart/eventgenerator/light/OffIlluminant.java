package uk.co.stephencathcart.eventgenerator.light;

import java.io.Serializable;
import uk.co.stephencathcart.eventgenerator.enums.IlluminantType;

public class OffIlluminant extends AbstractIlluminant implements Serializable {
    
    public OffIlluminant() {
        super(IlluminantType.OFF);
    }
}
