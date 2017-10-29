package pattern.command;

/**
 *
 * @author ramudu
 */
public class Light {

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    private String status;

    public void lightOn() {
        setStatus("On");
        System.out.println("Light on");
    }

    public void lightOff() {
        setStatus("Off");
        System.out.println("Light off");
    }

}
