package uk.co.stephencathcart.eventgenerator.camera;

import java.io.Serializable;
import uk.co.stephencathcart.eventgenerator.enums.CameraType;

public class SetupCamera extends AbstractCamera implements Serializable {
    
    private Float moveSmoothness;
    private Float zoomSmoothness;
    
    public SetupCamera(Float moveSmoothness, Float zoomSmoothness) {
        super(CameraType.SETUP);
        this.moveSmoothness = moveSmoothness;
        this.zoomSmoothness = zoomSmoothness;
    }

    public Float getMoveSmoothness() {
        return moveSmoothness;
    }

    public void setMoveSmoothness(Float moveSmoothness) {
        this.moveSmoothness = moveSmoothness;
    }

    public Float getZoomSmoothness() {
        return zoomSmoothness;
    }

    public void setZoomSmoothness(Float zoomSmoothness) {
        this.zoomSmoothness = zoomSmoothness;
    }
}
