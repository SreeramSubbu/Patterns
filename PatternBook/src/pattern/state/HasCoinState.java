package pattern.state;

/**
 *
 * @author ramudu
 */
public class HasCoinState implements State {

    GumBallMachine machine;

    public HasCoinState(GumBallMachine gumBallMachine) {
        this.machine = gumBallMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin already inserted");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Releasing Coin");
        this.machine.setState(machine.getNoCoinState());
    }

    @Override
    public void pressButton() {
        System.out.println("Dispensing GumBall");
        this.machine.setState(this.machine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("No Gum ball dispensed");
    }

}
