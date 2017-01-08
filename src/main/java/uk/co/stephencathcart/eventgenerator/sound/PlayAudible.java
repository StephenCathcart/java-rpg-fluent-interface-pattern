package uk.co.stephencathcart.eventgenerator.sound;

import java.io.Serializable;
import uk.co.stephencathcart.eventgenerator.enums.AudibleType;

public class PlayAudible extends AbstractAudible implements Serializable {

    private Boolean isLooping;
    private Float volume;
    private Float positionX;
    private Float positionY;

    public PlayAudible(Boolean isLooping, Float volume) {
        super(AudibleType.PLAY);
        this.isLooping = isLooping;
        this.volume = volume;
    }
    
    public PlayAudible(Boolean isLooping, Float volume, Float positionX, Float positionY) {
        super(AudibleType.PLAY);
        this.isLooping = isLooping;
        this.volume = volume;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public Boolean getIsLooping() {
        return isLooping;
    }

    public void setIsLooping(Boolean isLooping) {
        this.isLooping = isLooping;
    }

    public Float getVolume() {
        return volume;
    }

    public void setVolume(Float volume) {
        this.volume = volume;
    }

    public Float getPositionX() {
        return positionX;
    }

    public void setPositionX(Float positionX) {
        this.positionX = positionX;
    }

    public Float getPositionY() {
        return positionY;
    }

    public void setPositionY(Float positionY) {
        this.positionY = positionY;
    }
}
