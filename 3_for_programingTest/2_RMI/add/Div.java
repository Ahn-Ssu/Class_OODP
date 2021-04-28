import java.rmi.*;

public interface Div extends Remote {

    public int div(int x, int y) throws RemoteException;
}
