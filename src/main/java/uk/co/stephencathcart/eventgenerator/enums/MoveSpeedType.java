package uk.co.stephencathcart.eventgenerator.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum MoveSpeedType {
    FASTEST(350),
    FASTER(325),
    FAST(300),
    NORMAL(250),
    SLOW(200),
    SLOWER(175),
    SLOWEST(150);
    
    public final int value;
    
    MoveSpeedType(int value) {
        this.value = value;
    }
    
    @JsonValue
    public Integer toJson() {
        return value;
    }
}
