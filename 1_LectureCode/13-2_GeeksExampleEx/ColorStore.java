import java.util.HashMap;
import java.util.Map;
class ColorStore {

    private static Map<String, Color> colorMap = new HashMap<String, Color>();
// 이 문법은 무엇인가요 ... ??? -->> Static block : 클래스가 생성되면 블록이 선선된 순서대로 실행이 되는 것
// 또, prototype의 경우는 항상 모든 Instance를 미리 생성해서 HashMap 등에 저장을 해야 되는가 ?! 
// 
    static
    {
        colorMap.put("blue", new blueColor());
        colorMap.put("black", new blackColor());
    }

    public static Color getColor(String colorName)
    {
        return (Color) colorMap.get(colorName).clone();
    }
}
