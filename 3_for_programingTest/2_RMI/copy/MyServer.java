import java.rmi.*;
import java.rmi.registry.*;

public class MyServer {

    public static void main(String args[]) {
        try {

            Adder addstub = new AdderRemote();
            Naming.rebind("rmi://localhost/add", addstub); 
            // System.out.println("Add stud open");



        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
