 
public class movementVisitor implements Visitor {

    private Director myDirector;
    private HTMLBuilder htmlBuilder;
    private boolean[] recordFlag = new boolean[5];

    public movementVisitor() {
        htmlBuilder = new HTMLBuilder();
        myDirector = new Director(htmlBuilder);

        for (int i = 0; i < 5; i++) {
            recordFlag[i] = true;
        }
    }

    @Override
    public void visit(Wheel wheel) {
        if (recordFlag[0]) {
            myDirector.makeCustomString("Each Wheel Turns Adapting to Terrain State");
            recordFlag[0] = false;
        }

        String eventString = "";
        int groundCase = Utils.generateRandomNum(0, 2);
        if (groundCase == 0) { // Pebble
            eventString = "Pebble Ground --> Enlarge " + wheel.position + " Wheel Thread";
        } else if (groundCase == 1) { // Mushy
            eventString = "Mushy Ground --> Widen " + wheel.position + " Wheel Width";
        } else { // Slippery
            eventString = "Slippery Ground --> Extrude Spike from " + wheel.position + " Wheel Shoe";
        }

        myDirector.makeCustomItems(new String[] { "Turning " + wheel.position + " wheel", eventString });
    }

    @Override
    public void visit(Motor motor) {
        if (recordFlag[1]) {
            myDirector.makeCustomString("Each Motor Conrols Power Consumption");
            recordFlag[1] = false;
        }

        int rpmCase = Utils.generateRandomNum(0, 2);
        String eventString = "";
        if (rpmCase == 0) { // Increase
            eventString = "RPM Increased --> Decrease Power to " + motor.position + " Motor";
        } else if (rpmCase == 1) { // Constant
            eventString = "Constant RPM --> Kepp the Same Power to " + motor.position + " Motor";
        } else { // Decresed
            eventString = "RPM Dcreased --> Increase Power to " + motor.position + " Motor";
        }

        myDirector.makeCustomItems(new String[] { "Control of " + motor.position + " Motor", eventString });
    }

    @Override
    public void visit(SolarPanel solarPanel) {
        if (recordFlag[2]) {
            myDirector.makeCustomString("Solar Panel Generating Electricity");
            recordFlag[2] = false;
        }

        int KW = Utils.generateRandomNum(0, 10) + 10;
        myDirector.makeCustomItems(new String[] { "Solar Panel " + solarPanel.position + " Generating Electricity...",
                "Charging " + String.valueOf(KW) + "KW" });

    }

    @Override
    public void visit(Arm arm) {
        if (recordFlag[3]) {
            myDirector.makeCustomString("Robot Arm in Operation");

            int calibrationCase = Utils.generateRandomNum(0, 3);
            String eventString = "";
            if (calibrationCase == 0) { // Increase
                eventString = "Rear Robot Arm in Fine Calibration";
            } else if (calibrationCase == 1) { // Constant
                eventString = "Front Robot Arm in Fine Calibration";
            } else if (calibrationCase == 2) { // Constant
                eventString = "Both Front and Rear Robot Arms in Fine Calibration";
            } else { // Decresed
                eventString = "Robot Arm in Complete Calibration";
            }

            myDirector.makeCustomItems(new String[] { eventString });

            recordFlag[3] = false;
        }

    }

    @Override
    public void visit(Camera cam) {
        if (recordFlag[4]) {
            myDirector.makeCustomString("Camera in Operation");
            recordFlag[4] = false;
        }

        int degreeCase = Utils.generateRandomNum(0, 2);
        String degree = "0";
        if (degreeCase == 0)
            degree = "180";
        else if (degreeCase == 2)
            degree = "270";
        else
            degree = "360";

        
        myDirector.makeCustomItems(new String[] { "Camera Taking Pictures of "+degree+" degrees View" });

        myDirector.callClose();
        
        System.out.println(Utils.makeBoldString(htmlBuilder.getResult() + " is made.\n"));
        
    }

}
