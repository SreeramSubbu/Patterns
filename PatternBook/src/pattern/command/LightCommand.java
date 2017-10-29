package pattern.command;

/**
 *
 * @author ramudu
 */
public class LightCommand implements Command {

    Light light;

    public LightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.lightOn();
    }

    @Override
    public void undo() {
        if (this.light.getStatus().equals("On")) {
            this.light.lightOff();
            this.light.setStatus("Off");
        } else {
            this.light.lightOn();
            this.light.setStatus("On");
        }
    }

}
