package uk.co.stephencathcart.eventgenerator.environment;

import uk.co.stephencathcart.eventgenerator.enums.EnvironmentType;

public abstract class AbstractEnvironmental implements Environmental {

    private EnvironmentType type;

    public AbstractEnvironmental(EnvironmentType type) {
        this.type = type;
    }

    @Override
    public EnvironmentType getType() {
        return type;
    }

    public void setType(EnvironmentType type) {
        this.type = type;
    }
}
