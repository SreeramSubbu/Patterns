package pattern.proxy.remote;


/**
 *
 * @author ramudu
 */
class NoCoinState implements State {

    transient GumBallMachine machine;

    public NoCoinState(GumBallMachine machine) {

        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin inserted");
        this.machine.setState(machine.getHasCoinState());
    }

    @Override
    public void ejectCoin() {
        System.out.println("No coin inserted");
    }

    @Override
    public void pressButton() {
        System.out.println("No coin inserted");
    }

    @Override
    public void dispense() {
        System.out.println("No coin inserted");
    }

}
