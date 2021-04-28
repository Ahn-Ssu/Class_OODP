//import java.util.*;
public class MySingleton {

    private static  MySingleton theObject;

    private MySingleton() {
    }

    public static MySingleton createMySingleton() {

        if (theObject == null)
            theObject = new MySingleton();
        return theObject;
    }

}
