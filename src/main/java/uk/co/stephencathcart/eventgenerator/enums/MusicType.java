package uk.co.stephencathcart.eventgenerator.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum MusicType {
    MAIN;
    
    @JsonValue
    public String toJson() {
        return name().toLowerCase();
    }
}
