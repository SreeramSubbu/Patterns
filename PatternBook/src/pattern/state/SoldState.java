package pattern.state;

/**
 *
 * @author ramudu
 */
public class SoldState implements State {

    GumBallMachine machine;

    public SoldState(GumBallMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Please wait, Gumball getting dispensed");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Sorry already dispensed gumball");
    }

    @Override
    public void pressButton() {
        System.out.println("Please wait");
    }

    @Override
    public void dispense() {
        machine.releaseBall();
        if (machine.gumBallCount > 0) {
            machine.setState(machine.getNoCoinState());
        } else {
            machine.setState(machine.getSoldOutState());
        }
    }

}
