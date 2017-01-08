package uk.co.stephencathcart.eventgenerator.actions;

import java.io.Serializable;
import uk.co.stephencathcart.eventgenerator.enums.ActionType;
import uk.co.stephencathcart.eventgenerator.enums.DurationType;
import uk.co.stephencathcart.eventgenerator.enums.KeyType;
import uk.co.stephencathcart.eventgenerator.enums.ObjectType;

public class PanicAction extends AbstractAction implements Serializable {

    private ObjectType object;
    private DurationType duration;
    private Integer failEventId;
    private Integer successEventId;
    
    public PanicAction(ObjectType object, DurationType duration) {
        super(ActionType.PANIC);
        this.object = object;
        this.duration = duration;
    }

    public PanicAction(KeyType key, Integer failEventId, Integer successEventId) {
        super(ActionType.PANIC);
        this.failEventId = failEventId;
        this.successEventId = successEventId;
    }
    
    public ObjectType getObject() {
        return object;
    }

    public void setObject(ObjectType object) {
        this.object = object;
    }
    
    public DurationType getDuration() {
        return duration;
    }

    public void setDuration(DurationType duration) {
        this.duration = duration;
    }
    
    public Integer getFailEventId() {
        return failEventId;
    }

    public void setFailEventId(Integer failEventId) {
        this.failEventId = failEventId;
    }

    public Integer getSuccessEventId() {
        return successEventId;
    }

    public void setSuccessEventId(Integer successEventId) {
        this.successEventId = successEventId;
    }
}
