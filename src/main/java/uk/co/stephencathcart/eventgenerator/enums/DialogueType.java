package uk.co.stephencathcart.eventgenerator.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DialogueType {
    ID1,
    ID2;

    @JsonValue
    public String toJson() {
        return name().toLowerCase();
    }
}
