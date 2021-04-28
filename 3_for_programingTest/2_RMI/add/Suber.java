import java.rmi.*;

public interface Suber extends Remote {

    public int sub(int x, int y) throws RemoteException;
}
