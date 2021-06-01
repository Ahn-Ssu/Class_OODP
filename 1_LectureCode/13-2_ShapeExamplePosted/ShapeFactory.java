import java.util.HashMap;
public class ShapeFactory {
// 그러면 prototype이나 flyweight나 new keywork에 대한 접근을 제한 시켜야 하는 것이 아닌가용? 
   private static final HashMap circleMap = new HashMap();
   public static Shape getCircle(String color) {
      Circle circle = (Circle)circleMap.get(color);
      if(circle == null) { // 이게 없는 경우에는 필요한데 없는 것으로 새로 만들어 냄 
         circle = new Circle(color);
         circleMap.put(color, circle); 
         System.out.println("Creating circle of color : " + color);
      }
      return circle;
   }
}
