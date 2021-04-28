import java.rmi.*;
import java.rmi.registry.*;

public class MyServer {

    public static void main(String args[]) {
        try {

            Adder addstub = new AdderRemote();
            Naming.rebind("rmi://localhost:5000/add", addstub); 
            System.out.println("Add stud open");

            Suber substub = new SubRemote();
            Naming.rebind("rmi://localhost:5001/sub", substub); 
            System.out.println("sub stud open");

            Multi multistub = new MultiRemote();
            Naming.rebind("rmi://localhost:5002/multi", multistub); 
            System.out.println("multi stud open");

            Div Divstub = new DivRemote();
            Naming.rebind("rmi://localhost:5003/div", Divstub); 
            System.out.println("div stud open");


        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
