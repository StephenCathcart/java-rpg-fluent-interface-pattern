package uk.co.stephencathcart.eventgenerator.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum LightType {
    PORCHLIGHT;
    
    @JsonValue
    public String toJson() {
        return name().substring(0, 1).toUpperCase() + name().substring(1).toLowerCase();
    }
}
