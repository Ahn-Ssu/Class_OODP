
public class PrototypeTest {
        public static void main(String args[]) throws CloneNotSupportedException {
                Prototype prototype = new PrototypeImpl(1000);

                for (int i = 1; i < 10; i++) {
                        Prototype tempotype =  prototype.clone();

                        tempotype.setX( tempotype.getX() * i);
                        tempotype.printX();
                }
        }
}