class Babble2 extends Thread {
  static boolean doYield;
  static int howOften;
  String word;
  Babble2(String whatToSay) {
     word = whatToSay;
     }

public void run() {
for (int i= 0; i<howOften; i++) {

   for (int j=1;j<3;j++) {
    System.out.println(word);
      if (doYield)   yield();
    }
 }
  }
  public static void main(String[] args) {
    howOften = Integer.parseInt(args[1]);
    doYield =
      new Boolean(args[0]).booleanValue();
      for (int i = 2; i< args.length; i++)
      new Babble2(args[i]).start();
   }
  }
