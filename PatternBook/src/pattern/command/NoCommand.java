package pattern.command;

/**
 *
 * @author ramudu
 */
public class NoCommand implements Command {

    @Override
    public void execute() {
        System.out.println("No commands to execute");
    }

    @Override
    public void undo() {
        System.out.println("No commands to undo");
    }

}
