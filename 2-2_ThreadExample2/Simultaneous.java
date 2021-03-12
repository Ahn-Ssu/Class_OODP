
public class Simultaneous {


   public static void main (String[] args) {

      Soda one = new Soda ("Coke");
      Soda two = new Soda ("Pepsi");
      Soda three = new Soda ("Diet-Coke");

      one.start();
      two.start();
      three.start();

   }

}

class Soda extends Thread {

   private String name;


   Soda (String str) {
      name = str;
   }  // constructor Soda


   public void run() {
      for (int count = 0; count < 10; count++)
         System.out.print (name+" ");
   }

}
