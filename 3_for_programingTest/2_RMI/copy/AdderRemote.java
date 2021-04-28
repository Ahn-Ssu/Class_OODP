import java.rmi.*;
import java.rmi.server.*;

public class AdderRemote extends UnicastRemoteObject {

    interface Adder extends Remote {

        public int add(int x, int y) throws RemoteException;
    }
    

    AdderRemote() throws RemoteException {
        super();
    }

    public int add(int x, int y) {
        return x + y;
    }

}
