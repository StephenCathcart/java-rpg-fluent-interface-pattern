package uk.co.stephencathcart.eventgenerator.actions;

import java.io.Serializable;

import uk.co.stephencathcart.eventgenerator.enums.ActionType;
import uk.co.stephencathcart.eventgenerator.enums.DirectionType;
import uk.co.stephencathcart.eventgenerator.enums.LocationType;
import uk.co.stephencathcart.eventgenerator.enums.MoveSpeedType;
import uk.co.stephencathcart.eventgenerator.enums.ToonType;

public class MoveAction extends AbstractAction implements Serializable {

    private ToonType toon;
    private LocationType location;
    private DirectionType direction;
    private MoveSpeedType speed;

    public MoveAction(ToonType toon, LocationType location, DirectionType verticalDirection, MoveSpeedType speed) {
        super(ActionType.MOVE);
        this.toon = toon;
        this.location = location;
        this.direction = verticalDirection;
        this.speed = speed;
    }

    public ToonType getToon() {
        return toon;
    }

    public void setToon(ToonType toon) {
        this.toon = toon;
    }

    public LocationType getLocation() {
        return location;
    }

    public void setLocation(LocationType location) {
        this.location = location;
    }
    
    public DirectionType getDirection() {
        return direction;
    }

    public void setDirection(DirectionType direction) {
        this.direction = direction;
    }

    public MoveSpeedType getSpeed() {
        return speed;
    }

    public void setSpeed(MoveSpeedType speed) {
        this.speed = speed;
    }
}
