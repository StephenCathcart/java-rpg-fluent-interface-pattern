package uk.co.stephencathcart.eventgenerator.camera;

import java.io.Serializable;
import uk.co.stephencathcart.eventgenerator.enums.CameraType;
import uk.co.stephencathcart.eventgenerator.enums.ShakeType;

public class ShakeCamera extends AbstractCamera implements Serializable {
    
    private Float magnitude;
    private Float duration;
    private ShakeType shakeType;
    
    public ShakeCamera(Float magnitude, Float duration, ShakeType shakeType) {
        super(CameraType.SHAKE);
        this.magnitude = magnitude;
        this.duration = duration;
        this.shakeType = shakeType;
    }

    public Float getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(Float magnitude) {
        this.magnitude = magnitude;
    }

    public Float getDuration() {
        return duration;
    }

    public void setDuration(Float duration) {
        this.duration = duration;
    }

    public ShakeType getShakeType() {
        return shakeType;
    }

    public void setShakeType(ShakeType shakeType) {
        this.shakeType = shakeType;
    }
}
