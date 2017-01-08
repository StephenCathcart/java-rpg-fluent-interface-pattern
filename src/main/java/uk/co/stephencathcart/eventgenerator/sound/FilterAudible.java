package uk.co.stephencathcart.eventgenerator.sound;

import java.io.Serializable;
import uk.co.stephencathcart.eventgenerator.enums.AudibleType;
import uk.co.stephencathcart.eventgenerator.enums.FilterType;

public class FilterAudible extends AbstractAudible implements Serializable {

    private Boolean hasFilter;
    private FilterType filterType;
    private Float frequency;
    private Float detune;
    private Float q;
    private Float gain;
    private Float mix;
    
    public FilterAudible(Boolean hasFilter) {
        super(AudibleType.FILTER);
        this.hasFilter = hasFilter;
    }
    
    public FilterAudible(Boolean hasFilter, FilterType filterType, Float frequency, Float detune, Float q, Float gain, Float mix) {
        super(AudibleType.FILTER);
        this.hasFilter = hasFilter;
        this.filterType = filterType;
        this.frequency = frequency;
        this.detune = detune;
        this.q = q;
        this.gain = gain;
        this.mix = mix;
    }

    public Boolean getHasFilter() {
        return hasFilter;
    }

    public void setHasFilter(Boolean hasFilter) {
        this.hasFilter = hasFilter;
    }

    public FilterType getFilterType() {
        return filterType;
    }

    public void setFilterType(FilterType filterType) {
        this.filterType = filterType;
    }

    public Float getFrequency() {
        return frequency;
    }

    public void setFrequency(Float frequency) {
        this.frequency = frequency;
    }

    public Float getDetune() {
        return detune;
    }

    public void setDetune(Float detune) {
        this.detune = detune;
    }

    public Float getQ() {
        return q;
    }

    public void setQ(Float q) {
        this.q = q;
    }

    public Float getGain() {
        return gain;
    }

    public void setGain(Float gain) {
        this.gain = gain;
    }

    public Float getMix() {
        return mix;
    }

    public void setMix(Float mix) {
        this.mix = mix;
    }
}
