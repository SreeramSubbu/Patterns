package pattern.state;

/**
 *
 * @author ramudu
 */
public class SoldOutState implements State {

    GumBallMachine machine;

    public SoldOutState(GumBallMachine machine) {

        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Sold out");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Sold out");
    }

    @Override
    public void pressButton() {
        System.out.println("Sold out");
    }

    @Override
    public void dispense() {
        System.out.println("Sold out");
    }

}
