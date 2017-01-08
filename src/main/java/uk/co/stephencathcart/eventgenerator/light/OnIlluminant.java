package uk.co.stephencathcart.eventgenerator.light;

import java.io.Serializable;
import uk.co.stephencathcart.eventgenerator.enums.IlluminantType;

public class OnIlluminant extends AbstractIlluminant implements Serializable {

    public OnIlluminant() {
        super(IlluminantType.ON);
    }
}
