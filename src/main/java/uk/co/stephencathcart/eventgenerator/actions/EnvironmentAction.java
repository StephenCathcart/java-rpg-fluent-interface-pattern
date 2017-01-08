package uk.co.stephencathcart.eventgenerator.actions;

import uk.co.stephencathcart.eventgenerator.environment.Environmental;
import java.io.Serializable;
import uk.co.stephencathcart.eventgenerator.enums.ActionType;

public class EnvironmentAction extends AbstractAction implements Serializable {
    
    private Environmental environmental;
    
    public EnvironmentAction(Environmental environmental) {
        super(ActionType.ENVIRONMENT);
        this.environmental = environmental;
    }

    public Environmental getEnvironmental() {
        return environmental;
    }

    public void setEnvironmental(Environmental environmental) {
        this.environmental = environmental;
    }
    
}
