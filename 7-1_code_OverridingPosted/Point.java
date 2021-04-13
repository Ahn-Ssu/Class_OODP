public class Point {
protected double x, y;
 public String className = "Point";
 public Point() {
    x = 0.0; y = 0.0;
  }

  public Point(double x, double y) {
    this.x = x; this.y = y;
  }

  public String pointMethod() {
      return "Point Method";
  }
 static public String getDescription() {
    return "Point";
  }
}