class Babble extends Thread {
  private  static boolean doYield;
  private static int howOften;
  String word;
  Babble(String whatToSay) {
     word = whatToSay;
     }

public void run() {
for (int i= 0; i<howOften; i++) {


    System.out.println(word);
      if (doYield)   yield();

    }
  }
  public static void main(String[] args) {
    howOften = Integer.parseInt(args[1]);
    doYield =
      new Boolean(args[0]).booleanValue();
      for (int i = 2; i< args.length; i++)
      new Babble(args[i]).start();
   }
  }
