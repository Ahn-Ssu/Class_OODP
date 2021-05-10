public class FactoryClient {
   public static void main(String args[]) {
       MammalsFactory mf = new MammalsFactory();
       System.out.println(mf.getMammalObject("Dog").doWalking());
        System.out.println(mf.getMammalObject("Cat").doWalking());
   }
}
