
 import java.io.*;
public class Main {
    public void createSingleton() {

        MySingleton ms1 = MySingleton.createMySingleton();

        MySingleton ms2 = MySingleton.createMySingleton();

        System.out.println( ms1 == ms2 );
    }

    public static void main(String[] args) {
      new  Main().createSingleton();
    }
}
