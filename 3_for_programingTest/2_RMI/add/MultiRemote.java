
import java.rmi.*;
import java.rmi.server.*;

public class MultiRemote extends UnicastRemoteObject implements Multi {

    MultiRemote() throws RemoteException {
        // super();
    }

    public int multi(int x, int y) {
        return x * y;
    }

}
