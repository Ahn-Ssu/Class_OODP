public class OverridingTest {
   public static void main(String[] args) {
     ColorPoint p1 = new ColorPoint(10.0, 10.0, "red");
     Point p2 = p1;// binding occurring at compile time
     System.out.println(ColorPoint.getDescription());
     System.out.println(Point.getDescription());
     System.out.println(p1.className);
     System.out.println(p2.className);
     System.out.println(p1.pointMethod());
     System.out.println(p2.pointMethod());
   }
}
