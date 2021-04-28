
import java.rmi.*;
import java.rmi.server.*;

public class DivRemote extends UnicastRemoteObject implements Div {

    DivRemote() throws RemoteException {
        super();
    }

    public int div(int x, int y) {
        return x / y;
    }

}
