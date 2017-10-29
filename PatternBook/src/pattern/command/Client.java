package pattern.command;

/**
 *
 * @author ramudu
 */
public class Client {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        invoker.setCommand(0, new LightCommand(new Light()));
        invoker.setCommand(1, new CeilingFanHighCommand(new CeilingFan()));
        invoker.setCommand(2, new CeilingFanMediumCommand(new CeilingFan()));
        invoker.setCommand(3, new CeilingFanLowCommand(new CeilingFan()));
        invoker.setCommand(4, new NoCommand());
        invoker.invoke(0);
        invoker.invoke(1);
        invoker.invoke(2);
        invoker.invoke(3);
        invoker.undo(0);
        invoker.invoke(4);
        invoker.undo();
        invoker.undo();

    }

}
