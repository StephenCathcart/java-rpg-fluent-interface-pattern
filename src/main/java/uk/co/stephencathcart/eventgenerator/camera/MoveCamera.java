package uk.co.stephencathcart.eventgenerator.camera;

import java.io.Serializable;
import uk.co.stephencathcart.eventgenerator.enums.CameraType;
import uk.co.stephencathcart.eventgenerator.enums.LocationType;

public class MoveCamera extends AbstractCamera implements Serializable {
    
    private Boolean hasTarget;
    private LocationType location;
    
    public MoveCamera(Boolean hasTarget) {
        super(CameraType.MOVE);
        this.hasTarget = hasTarget;
    }
    
    public MoveCamera(Boolean hasTarget, LocationType location) {
        super(CameraType.MOVE);
        this.hasTarget = hasTarget;
        this.location = location;
    }

    public Boolean getHasTarget() {
        return hasTarget;
    }

    public void setHasTarget(Boolean hasTarget) {
        this.hasTarget = hasTarget;
    }

    public LocationType getLocation() {
        return location;
    }

    public void setLocation(LocationType location) {
        this.location = location;
    }
}
