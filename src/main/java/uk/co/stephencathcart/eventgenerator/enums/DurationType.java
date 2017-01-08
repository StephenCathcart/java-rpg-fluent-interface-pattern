package uk.co.stephencathcart.eventgenerator.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DurationType {
    FASTEST(2),
    FASTER(3),
    FAST(4),
    NORMAL(5),
    SLOW(6),
    SLOWER(7),
    SLOWEST(8);
    
    public final float value;
    
    DurationType(int value) {
        this.value = value;
    }
    
    @JsonValue
    public Float toJson() {
        return value;
    }
}
