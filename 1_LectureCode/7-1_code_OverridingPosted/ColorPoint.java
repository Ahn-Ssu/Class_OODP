public class ColorPoint extends Point {
  public String color = "while";
  public String className = "ColorPoint";
 public ColorPoint(double x, double y, String color) {
    super(x, y);
    this.color = color;
  }

  public ColorPoint(double x, double y) {
    this(x, y, "black"); //must be the first stmnt
}
  public ColorPoint() { // without argument provided
      color = "black";
      }
public String pointMethod() {
     return "Color Point Method";
     }
static public String getDescription() {
return "ColorPoint"; //hiding super¡¯s method
  }
}
