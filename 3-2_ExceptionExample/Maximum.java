public class Maximum {

  public static void main(String[] args) {
    
    if (args.length >= 2) {
      int i1 = Integer.parseInt(args[0]);
      int i2 = Integer.parseInt(args[1]);
      System.out.println("The maximum of " + i1 + " and " + i2 + " is: " +
                         ((i1 >= i2) ? i1 : i2));
    } else {
      System.out.println("Usage: java Maximum integer1 integer2");
    }
  }

}

