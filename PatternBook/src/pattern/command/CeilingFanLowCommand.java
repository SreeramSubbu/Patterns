package pattern.command;

import java.util.Stack;

/**
 *
 * @author ramudu
 */
public class CeilingFanLowCommand implements Command {

    private CeilingFan ceilingFan;

    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {

        ceilingFan.setLow();
    }

    @Override
    public void undo() {
        ceilingFan.turnOff();
    }

}
