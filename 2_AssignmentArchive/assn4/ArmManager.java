import java.util.HashMap;

public class ArmManager {
    private HashMap<String, Arm> showcase = new HashMap<String, Arm>();

    public void register(String position, Arm arm) {
        showcase.put(position, arm);
    }
    public Arm create(String armName) throws CloneNotSupportedException {
        Arm p = (Arm)showcase.get(armName);
        return p.clone();
    }
}
