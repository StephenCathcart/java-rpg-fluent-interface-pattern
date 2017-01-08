package uk.co.stephencathcart.eventgenerator.light;

import java.io.Serializable;
import uk.co.stephencathcart.eventgenerator.enums.IlluminantType;

public class FlickerIlluminant extends AbstractIlluminant implements Serializable {

    private Float onTimeMin;
    private Float onTimeMax;
    private Float offTimeMin;
    private Float offTimeMax;
    private Float duration;

    public FlickerIlluminant(Float onTimeMin, Float onTimeMax, Float offTimeMin, Float offTimeMax, Float duration) {
        super(IlluminantType.FLICKER);
        this.onTimeMin = onTimeMin;
        this.onTimeMax = onTimeMax;
        this.offTimeMin = offTimeMin;
        this.offTimeMax = offTimeMax;
        this.duration = duration;
    }

    public Float getOnTimeMin() {
        return onTimeMin;
    }

    public void setOnTimeMin(Float onTimeMin) {
        this.onTimeMin = onTimeMin;
    }

    public Float getOnTimeMax() {
        return onTimeMax;
    }

    public void setOnTimeMax(Float onTimeMax) {
        this.onTimeMax = onTimeMax;
    }

    public Float getOffTimeMin() {
        return offTimeMin;
    }

    public void setOffTimeMin(Float offTimeMin) {
        this.offTimeMin = offTimeMin;
    }

    public Float getOffTimeMax() {
        return offTimeMax;
    }

    public void setOffTimeMax(Float offTimeMax) {
        this.offTimeMax = offTimeMax;
    }

    public Float getDuration() {
        return duration;
    }

    public void setDuration(Float duration) {
        this.duration = duration;
    }
}
