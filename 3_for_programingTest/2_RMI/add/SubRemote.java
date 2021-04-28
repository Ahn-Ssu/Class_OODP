
import java.rmi.*;
import java.rmi.server.*;


public class SubRemote extends UnicastRemoteObject implements Suber {

    SubRemote() throws RemoteException {
        super();
    }

    public int sub(int x, int y) {
        return x - y;
    }

}
