package uk.co.stephencathcart.eventgenerator.camera;

import uk.co.stephencathcart.eventgenerator.enums.CameraType;

public abstract class AbstractCamera implements Camera {

    private CameraType type;

    public AbstractCamera(CameraType type) {
        this.type = type;
    }

    @Override
    public CameraType getType() {
        return type;
    }

    public void setType(CameraType type) {
        this.type = type;
    }
}
