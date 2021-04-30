// public abstract class EnvTemplate {

//     String mode = "";

//     public void convertMode(String requestMode){
//         System.out.println("request mode : "+requestMode +" || now mode");
//         if (this.mode.equals(requestMode)) {
// 			System.out.println("keep " +mode+ " car mode");
// 		}
// 		else {
// 			System.out.println("Convert from "+requestMode+" to "+ this.mode+" car mode");
// 		}
//     }
//     public abstract void setBatteryWork();
//     public void showCurrentSpeedwithMode(){
//         System.out.println("("+mode+" Mode) Current Speed: "+ ((int) (Math.random() * 30) + 40));
//     }
// }

public interface EnvTemplate{
    public String showBatteryInfo();
}