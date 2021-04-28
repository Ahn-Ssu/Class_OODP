public class SwapArray {
  public static void main(String[] args) {
    int[] num = { 1, 2 };
    System.out.println("Before  swap");
    System.out.println("#1: " + num[0]);
    System.out.println("#2: " + num[1]);

    swap(num);

    System.out.println("After  swap");
    System.out.println("#1: " + num[0]);
    System.out.println("#2: " + num[1]);
  }
  public static void swap(int[] source) {
    if (source != null && source.length > 1) {
      int temp = source[0];
      source[0] = source[1];
      source[1] = temp;
    }
  }
}
