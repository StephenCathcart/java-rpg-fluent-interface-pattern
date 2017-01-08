package uk.co.stephencathcart.eventgenerator.actions;

import uk.co.stephencathcart.eventgenerator.enums.ActionType;

public interface Actionable {

    public Integer getActionId();

    public void setActionId(Integer actionId);

    public ActionType getType();
}
