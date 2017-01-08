package uk.co.stephencathcart.eventgenerator.actions;

import java.io.Serializable;
import uk.co.stephencathcart.eventgenerator.enums.ActionType;

public class DecisionAction extends AbstractAction implements Serializable {
    
    public DecisionAction() {
        super(ActionType.DECISION);
    }
}
