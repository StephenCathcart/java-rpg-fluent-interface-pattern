package uk.co.stephencathcart.eventgenerator.actions;

import java.io.Serializable;
import org.apache.commons.lang3.builder.ToStringBuilder;
import uk.co.stephencathcart.eventgenerator.enums.ActionType;

public class DebugAction extends AbstractAction implements Serializable {
    public DebugAction() {
        super(ActionType.DEBUG);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).
                toString();
    }
}
