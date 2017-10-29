package pattern.command;

/**
 *
 * @author ramudu
 */
public class CeilingFan {

    private int speed;
    private static final int HIGH = 3;
    private static final int MEDIUM = 2;
    private static final int LOW = 1;
    private static final int OFF = 0;

    public void setHigh() {
        System.out.println("Setting speed to high");
        speed = HIGH;
    }

    public void setMedium() {
        System.out.println("Setting speed to medium");
        speed = MEDIUM;
    }

    public void setLow() {
        System.out.println("Setting speed to low");
        speed = LOW;
    }

    public void turnOff() {
        System.out.println("Turn  off fan");
        speed = OFF;
    }

}
