package pattern.proxy.remote;

/**
 *
 * @author ramudu
 */
class SoldOutState implements State {

    transient GumBallMachine machine;

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
