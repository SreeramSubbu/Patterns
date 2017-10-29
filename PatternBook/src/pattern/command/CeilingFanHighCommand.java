package pattern.command;

import java.util.Stack;

/**
 *
 * @author ramudu
 */
public class CeilingFanHighCommand implements Command {

    private CeilingFan ceilingFan;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {

        ceilingFan.setHigh();
    }

    @Override
    public void undo() {
        ceilingFan.turnOff();
    }

}
