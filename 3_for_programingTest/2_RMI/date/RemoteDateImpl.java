import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class RemoteDateImpl extends UnicastRemoteObject implements RemoteDate, RemoteHello
{
    public RemoteDateImpl() throws RemoteException {  }

    public  Date getDate() throws RemoteException {
        return new Date();
    }

    public String getHI() throws RemoteException{
        return "Hello";
    }

   public static void main(String[] args)  {
        try {
            RemoteDate dateServer = new RemoteDateImpl();
            RemoteHello helloServer = new RemoteDateImpl();

            Naming.rebind("rmi://127.0.0.1:1212/DateServer", dateServer);
            System.out.println("DateServer bound in registry");

            Naming.rebind("rmi://127.0.0.1:1313/helloServer", helloServer);
            System.out.println("helloServer bound in registry");
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }
}
 