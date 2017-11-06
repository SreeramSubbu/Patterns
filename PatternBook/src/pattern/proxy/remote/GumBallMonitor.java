package pattern.proxy.remote;

import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ramudu
 */
public class GumBallMonitor {
    GumBallMachineRemote machine;
    public GumBallMonitor(GumBallMachineRemote machine){
        this.machine = machine;
    }
    
    public void report(){
        try {
            System.out.println("Location "+ machine.getLocation());
            System.out.println("Inventory "+ machine.getCount());
            System.out.println("State "+ machine.getState());
        } catch (RemoteException ex) {
            Logger.getLogger(GumBallMonitor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
