package uk.co.stephencathcart.eventgenerator.camera;

import java.io.Serializable;
import uk.co.stephencathcart.eventgenerator.enums.CameraType;

public class ZoomCamera extends AbstractCamera implements Serializable {
    
    private Float zoom;
    
    public ZoomCamera(Float zoom) {
        super(CameraType.ZOOM);
        this.zoom = zoom;
    }

    public Float getZoom() {
        return zoom;
    }

    public void setZoom(Float zoom) {
        this.zoom = zoom;
    }
}
