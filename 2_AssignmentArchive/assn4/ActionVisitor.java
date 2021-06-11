public class ActionVisitor implements Visitor {
 
    private final String actionText = "Action";

    @Override
    public void visit(Wheel wheel) {
        System.out.println("Acting on "+wheel.position+" Axle");
        
        if (wheel.eventFlag){
            String eventString = actionText+", Removing Mud/Dust from "+wheel.position+" Axle";
            Blackbox.getInstance().record(eventString);
            System.out.println("--> "+eventString);
        }
        else{
            System.out.println("No Action on "+wheel.position+" Axle");
        }
    }

    @Override
    public void visit(Motor motor) {
        System.out.println("Acting on "+motor.position+" motor");
        
        if (motor.eventFlag){
            String eventString = actionText+", Supply more power to "+motor.position+" motor";
            Blackbox.getInstance().record(eventString);
            System.out.println("==> "+eventString);
        }
        else{
            System.out.println("No Action on "+motor.position);
        }
    }

    @Override
    public void visit(SolarPanel solarPanel) {
        System.out.println("Action on Solar Panel "+solarPanel.position);
        
        if (solarPanel.eventFlag){
            String eventString = actionText+": Replacing Solar Panel "+ solarPanel.position;
            Blackbox.getInstance().record(eventString);

            eventString = actionText+": repairing Solar Panel "+ solarPanel.position;
            System.out.println("==> "+ eventString);

            RoverBooter.getInstance().replaceSolarPanel(solarPanel.position);
            
        }
        else{
            System.out.println("No Action on Solar Panel "+solarPanel.position);
        }
    }

    @Override
    public void visit(Arm arm) {
        System.out.println("Action RobotArm");

        if  (arm.eventFlag){
            String eventString = actionText+": "+arm.position +" Robot Arm Replaced by Prototype "+arm.position+" Arm Clone";
            Blackbox.getInstance().record(eventString);
            System.out.println("==> "+eventString);
            
            try {
                RoverBooter.getInstance().replaceArm(arm.position);
                System.out.println(arm.position+" Robot Arm Clone Made from Prototype");
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            
        }
        else{
            System.out.println("No Action on Robot Arm");
        }
    }

    @Override
    public void visit(Camera cam) {
        System.out.println("Action on camera");
        
        if (cam.eventFlag){
            String eventString = actionText+": Repair Camera";
            Blackbox.getInstance().record(eventString);
            System.out.println("==> "+ eventString);
        }
        else{
            System.out.println("No Action on Camera");
        }
    }

    
    
}
