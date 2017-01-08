package uk.co.stephencathcart.eventgenerator.light;

import uk.co.stephencathcart.eventgenerator.enums.IlluminantType;

public class AbstractIlluminant implements Illuminant {

    private IlluminantType type;

    public AbstractIlluminant(IlluminantType type) {
        this.type = type;
    }

    @Override
    public IlluminantType getType() {
        return type;
    }

    public void setType(IlluminantType type) {
        this.type = type;
    }
}
