package uk.co.stephencathcart.eventgenerator.actions;

import java.io.Serializable;
import uk.co.stephencathcart.eventgenerator.camera.Camera;
import uk.co.stephencathcart.eventgenerator.enums.ActionType;

public class CameraAction extends AbstractAction implements Serializable {

    private Camera camera;
    
    public CameraAction(Camera camera) {
        super(ActionType.CAMERA);
        this.camera = camera;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }
}
