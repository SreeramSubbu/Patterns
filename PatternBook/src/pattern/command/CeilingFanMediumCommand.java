package pattern.command;

import java.util.Stack;

/**
 *
 * @author ramudu
 */
public class CeilingFanMediumCommand implements Command {

    private CeilingFan ceilingFan;

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {

        ceilingFan.setMedium();
    }

    @Override
    public void undo() {
        ceilingFan.turnOff();
    }

}
