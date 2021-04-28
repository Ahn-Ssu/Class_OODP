class OuterClass {
  int x = 10;
  static class InnerClass {
    int y = 5;
  }
}
public class MyInnerClass {
  public static void main(String[] args) {
    OuterClass.InnerClass myOuter = new OuterClass.InnerClass();

    // OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println (myInner.y);
  }
} // Outputs 15 (5 + 10)


