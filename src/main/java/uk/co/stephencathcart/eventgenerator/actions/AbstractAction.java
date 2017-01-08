package uk.co.stephencathcart.eventgenerator.actions;

import uk.co.stephencathcart.eventgenerator.enums.ActionType;

public abstract class AbstractAction implements Actionable {

    private Integer actionId;
    private ActionType type;

    public AbstractAction(ActionType type) {
        this.type = type;
    }

    @Override
    public Integer getActionId() {
        return actionId;
    }

    @Override
    public void setActionId(Integer actionId) {
        this.actionId = actionId;
    }

    @Override
    public ActionType getType() {
        return type;
    }

    public void setType(ActionType type) {
        this.type = type;
    }
}
