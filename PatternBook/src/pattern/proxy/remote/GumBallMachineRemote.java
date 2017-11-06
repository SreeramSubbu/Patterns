package pattern.proxy.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author ramudu
 */
public interface GumBallMachineRemote extends Remote {

   int getCount() throws RemoteException;
   String getLocation() throws RemoteException;
   State getState() throws RemoteException;

}
