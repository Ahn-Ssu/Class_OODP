import java.rmi.*;
import java.rmi.registry.*;

public class MyServer2 {

    public static void main(String args[]) {
        try {


            Multi multistub = new MultiRemote();
            Naming.rebind("rmi://localhost/multi", multistub); 
            // System.out.println("multi stud open");


        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
