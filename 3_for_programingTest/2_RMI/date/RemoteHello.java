import java.util.Date;
import java.rmi.*;

public interface RemoteHello extends Remote
{
	public abstract String getHI() throws RemoteException;
}
