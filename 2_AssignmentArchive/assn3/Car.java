public class Car extends CarTemplate {

    String before;

    public void checkNcontrollMode(String newEnv) {

        if (super.mode == null) {
            super.mode = newEnv;
        } else {
            before = super.mode;
            super.convertMode(newEnv);
            super.mode = newEnv;
        }

        controllComponent();
        setBatteryWork();
 
    }

    public void getSpeed() {
        super.showCurrentSpeedwithMode();
    }

    @Override
    public void controllComponent() {
        if (super.mode.equals("Fuel")) {
            System.out.println("( For " + super.mode + " Mode)Fuel Engine Started if engine is in sleep mode.");
            System.out.println("( For " + super.mode + " Mode)Cut electricity to motor");
            System.out.println("Continue to run fuel engine.");

        } else if (super.mode.equals("Hybrid")) {
            System.out.println("( For " + super.mode + " Mode) Fuel Engine Started if engine is in sleep mode.");
            System.out.println("Supply electricity to front motor of hybrid car");
            System.out.println("Continue to run fuel engine.");

        } else {
            System.out.println("( For " + super.mode + " Mode)Cut fuel to engine");
            System.out.println("Supply electricity to front and rear motors of electric car");
        }
    }

    @Override
    public void setBatteryWork() {
        if (super.mode.equals("Fuel")) {
            System.out.println("Main generator charges battery.");
            System.out.println("Regenerative brake energy charges battery.");

        } else if (super.mode.equals("Hybrid")) {
            System.out.println("Main generator charges battery.");
            System.out.println("Regenerative brake energy charges battery.");

        } else {
            System.out.println("Regenerative brake energy charges battery.");
        }

    }
}
