import java.rmi.*;

public class RMIClient2
{
   public static void main(String args[]) {
    try {

      String host = "rmi://127.0.0.1:1313/helloServer";
      RemoteHello helloserver = (RemoteHello)Naming.lookup(host);
      System.out.println(helloserver.getHI());
    }
    catch (Exception e) {
        System.err.println(e);
    }
   }
}

