import java.util.ArrayList;
import java.util.List;

public class RoverBooter {

    private List<Wheel> wheels = new ArrayList<>(4);
    private List<Motor> motors = new ArrayList<>(4);
    private List<SolarPanel> panels = new ArrayList<>(6);
    private Arm frontArm, rearArm;

    private Camera camera;
    private PanelCage panelCage;
    private ArmManager armManager; 

    private static RoverBooter instance = new RoverBooter();
    private RoverBooter(){
        // make 4 wheels
        wheels.add(new Wheel("Front Left"));
        wheels.add(new Wheel("Front Right"));
        wheels.add(new Wheel("Back Left"));
        wheels.add(new Wheel("Back Right"));

        // make 4 motors
        motors.add(new Motor("Front Left"));
        motors.add(new Motor("Front Right"));
        motors.add(new Motor("Back Left"));
        motors.add(new Motor("Back Right"));

        // make solar Panel by flyweight
        this.panelCage = new PanelCage();
        int init_KW = Utils.makeKW();
        this.panelCage.constructOne(init_KW);

        for(int i = 0 ; i < 6; i ++){
            SolarModule solarModule = panelCage.lookup(init_KW);
            SolarPanel solarPanel = new SolarPanel(String.valueOf(i+1), solarModule);
            panels.add(solarPanel);
        }

        // get&set Arm from Arm manager by cloning(Prototype)
        this.armManager = new ArmManager();
        armManager.register("Front", new Arm("Front"));
        armManager.register("Rear", new Arm("Rear"));

        try {
            this.frontArm = armManager.create("Front");
            this.rearArm = armManager.create("Rear");

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        camera = new Camera("Robot");
    }

    public static RoverBooter getInstance() {
        return instance;
    }

    public void startRover(){

        InspectionRover();
        makeHTML();
        Blackbox.getInstance().showAllRecord();

    }

    public void replaceArm(String position) throws CloneNotSupportedException{
        if (position.equals("Front")){
            this.frontArm = armManager.create("Front");
        }
        else if (position.equals("Rear")){
            this.rearArm = armManager.create("Rear");
        }
    }

    public void replaceSolarPanel(String position){

        SolarModule solarModule= panelCage.lookup(Utils.makeKW());
        SolarPanel solarPanel = new SolarPanel(position, solarModule);
        
        panels.set(Integer.parseInt(position)-1,solarPanel);

        System.out.printf("A Troublesome Panel Replaced by %d KW Panel\n",solarModule.getPanelKW());
    }
    

    private void InspectionRover(){
        AlramVisitor myAlram = new AlramVisitor();
        System.out.println("The "+ Utils.makeBoldString("First Visitor")+ " for Checking Components\n");


        // Wheel Check
        System.out.println("*** Start Checking "+Utils.makeBoldString("Wheel")+" ***");
        for(Wheel oneWheel : wheels){
            oneWheel.accept(myAlram);
        }
        System.out.println(""); // for enter the line

        // Motor Check
        System.out.println("### Start Checking "+Utils.makeBoldString("Motor")+" ###");
        for(Motor oneMotor : motors){
            oneMotor.accept(myAlram);
        }
        System.out.println(""); // for enter the line

        // Solar Panel Check
        System.out.println("!!! Start Checking "+Utils.makeBoldString("Solar Panel")+" !!!");
        for(SolarPanel onePanel : panels){
            onePanel.accept(myAlram);
        }
        System.out.println(""); // for enter the line

        // Arm Check
        System.out.println("... Start Checking "+Utils.makeBoldString("Robot Arm")+" ...");
        frontArm.accept(myAlram);
        rearArm.accept(myAlram);
        System.out.println(""); // for enter the line

        // Camera Check
        System.out.println("... Start Checking "+Utils.makeBoldString("Camera")+" ...");
        camera.accept(myAlram);
        System.out.println(""); // for enter the line

        repairRover();
    }

    private void repairRover(){
        ActionVisitor myAction = new ActionVisitor();
        System.out.println("The "+ Utils.makeBoldString("Second Visitor")+ " for Maintaining Components\n");

        // Wheel Check
        System.out.println("*** Start Working "+Utils.makeBoldString("Wheel")+" ***");
        for(Wheel oneWheel : wheels){
            oneWheel.accept(myAction);
        }
        System.out.println(""); // for enter the line

        // Motor Check
        System.out.println("### Start Working "+Utils.makeBoldString("Motor")+" ###");
        for(Motor oneMotor : motors){
            oneMotor.accept(myAction);
        }
        System.out.println(""); // for enter the line

        // Solar Panel Check
        System.out.println("!!! Start Working "+Utils.makeBoldString("Solar Panel")+" !!!");
        for(SolarPanel onePanel : panels){
            onePanel.accept(myAction);
        }
        System.out.println(""); // for enter the line


        // Arm Check
        System.out.println("... Start Working "+Utils.makeBoldString("Robot Arm")+" ...");
        frontArm.accept(myAction);
        rearArm.accept(myAction);
        System.out.println(""); // for enter the line

        // Camera Check
        System.out.println("... Start Working "+Utils.makeBoldString("Camera")+" ...");
        camera.accept(myAction);
        System.out.println(""); // for enter the line

    }

    private void makeHTML() {

        movementVisitor myMovement = new movementVisitor();
        System.out.println("The "+ Utils.makeBoldString("Third Visitor")+ " for Rover Movement\n");
        System.out.println("opeartion History Being "+ Utils.makeBoldString("Recorded in HTML file\n\n"));

        // Wheel Check
        for(Wheel oneWheel : wheels){
            oneWheel.accept(myMovement);
        }

        // Motor Check
        for(Motor oneMotor : motors){
            oneMotor.accept(myMovement);
        }

        // Solar Panel Check
        for(SolarPanel onePanel : panels){
            onePanel.accept(myMovement);
        }


        // Arm Check
        frontArm.accept(myMovement);
        rearArm.accept(myMovement);

        // Camera Check
        camera.accept(myMovement);

        
    }


    
}
