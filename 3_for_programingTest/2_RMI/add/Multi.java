import java.rmi.*;

public interface Multi extends Remote {

    public int multi(int x, int y) throws RemoteException;
}
