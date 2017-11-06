package pattern.proxy.remote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;

/**
 *
 * @author ramudu
 */
public class GumBallMonitorTest {
    
   
    @Test
    public void testReport() {
       String[] location = {"rmi://abc.com/gumballmachine","rmi://def.com/gumballmachine"};
       GumBallMonitor[] monitors = new GumBallMonitor[location.length];
        for (int i = 0; i < monitors.length; i++) {
           try {
               GumBallMachineRemote machine = (GumBallMachineRemote) Naming.lookup(location[i]);
               monitors[i]= new GumBallMonitor(machine);
               System.out.println(monitors[i]);
           }  catch (MalformedURLException | NotBoundException | RemoteException ex) {
               Logger.getLogger(GumBallMonitorTest.class.getName()).log(Level.SEVERE, null, ex);
           }
            
        }
    }
    
}
