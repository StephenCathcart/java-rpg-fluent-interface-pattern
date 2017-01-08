package uk.co.stephencathcart.eventgenerator.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ObjectType {
    CANDLE,
    BOTTLE3,
    ROCK2,
    ROCK3;
    
    @JsonValue
    public String toJson() {
        return name().substring(0, 1).toUpperCase() + name().substring(1).toLowerCase();
    }
}
