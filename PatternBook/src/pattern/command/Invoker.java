package pattern.command;

import java.util.Stack;

/**
 *
 * @author ramudu
 */
public class Invoker {

    Command[] commands = new Command[7];
    Stack stack = new Stack();

    public Invoker() {

    }

    public void setCommand(Integer slot, Command command) {
        commands[slot] = command;
    }

    public void invoke(Integer slot) {
        stack.add(commands[slot]);
        commands[slot].execute();
    }

    public void undo(Integer slot) {
        if (stack.contains(commands[slot])) {
            stack.remove(commands[slot]);
        }
        commands[slot].undo();
    }

    public void undo() {
        Command undoCommand;
        if (stack.isEmpty()) {
            undoCommand = new NoCommand();
        } else {
            undoCommand = (Command) stack.pop();
        }
        undoCommand.undo();
    }

}
