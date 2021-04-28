
import java.rmi.*;
import java.rmi.server.*;

public class MultiRemote extends UnicastRemoteObject {

    interface Multi extends Remote {

        public int multi(int x, int y) throws RemoteException;
    }

    MultiRemote() throws RemoteException {
        super();
    }

    public int multi(int x, int y) {
        return x * y;
    }

}
