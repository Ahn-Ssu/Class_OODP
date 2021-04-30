public abstract class CarTemplate {
        String mode = "";

    public void convertMode(String requestMode){
        if (this.mode.equals(requestMode)) {
			System.out.println("keep " +mode+ " car mode");
		}
		else {
			System.out.println("Convert from "+this.mode+" to "+ requestMode+" car mode");
		}
    }

    public abstract void controllComponent();
    public abstract void setBatteryWork();
    public void showCurrentSpeedwithMode(){
        System.out.println("("+mode+" Mode) Current Speed: "+ ((int) (Math.random() * 30) + 40));
    }

}
