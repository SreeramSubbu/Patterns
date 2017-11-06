package pattern.proxy.remote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author ramudu
 */
class GumBallMachine extends UnicastRemoteObject implements GumBallMachineRemote{

    /**
     * @return the soldOutState
     */
    public State getSoldOutState() {
        return soldOutState;
    }

    /**
     * @param soldOutState the soldOutState to set
     */
    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    /**
     * @return the noCoinState
     */
    public State getNoCoinState() {
        return noCoinState;
    }

    /**
     * @param noCoinState the noCoinState to set
     */
    public void setNoCoinState(State noCoinState) {
        this.noCoinState = noCoinState;
    }

    /**
     * @return the hasCoinState
     */
    public State getHasCoinState() {
        return hasCoinState;
    }

    /**
     * @param hasCoinState the hasCoinState to set
     */
    public void setHasCoinState(State hasCoinState) {
        this.hasCoinState = hasCoinState;
    }

    /**
     * @return the soldState
     */
    public State getSoldState() {
        return soldState;
    }

    /**
     * @param soldState the soldState to set
     */
    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    /**
     * @return the state
     */
    @Override
    public State getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(State state) {
        this.state = state;
    }

    private State soldOutState;
    private State noCoinState;
    private State hasCoinState;
    private State soldState;

    private State state = soldOutState;
    int gumBallCount = 0;
    String location;

    public GumBallMachine(int numberOfGumBall) throws RemoteException{
        soldOutState = new SoldOutState(this);
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        soldState = new SoldState(this);
        gumBallCount = numberOfGumBall;
    }

    public void insertCoin() {
        getState().insertCoin();
    }

    public void ejectCoin() {
        getState().ejectCoin();
    }

    public void pressButton() {

        getState().pressButton();
        getState().dispense();
    }

    public void releaseBall() {

        System.out.println("Released gum ball");
        if (gumBallCount != 0) {
            gumBallCount--;
        }
    }

    @Override
    public int getCount() throws RemoteException {
            return  gumBallCount;
    }

    @Override
    public String getLocation() throws RemoteException {
        return location;
    }
}
