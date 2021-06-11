public class AlramVisitor implements Visitor{
 
    private final String alramText = "Alarm";

    @Override
    public void visit(Wheel wheel) {
        System.out.println("Checking "+wheel.position+" Axle");
        if (wheel.eventFlag){
            
            String eventString = alramText+": Mud and Dust on wheel Axle of "+wheel.position+" wheel";
            Blackbox.getInstance().record(eventString);
            System.out.println(">>"+eventString);

        }
        else{
            System.out.println("wheel Axle OK");
        }
            
    }


    @Override
    public void visit(Motor motor) {
        System.out.println("Checking Motors "+motor.position+" motor");
        
        if (motor.eventFlag){
            String eventString = alramText+": Weak Power to "+motor.position+" motor";
            Blackbox.getInstance().record(eventString);
            System.out.println(">>>>"+eventString);
        }
        else{
            System.out.println("Power is OK");
        }
    }

    @Override
    public void visit(SolarPanel solarPanel) {
        System.out.println("Checking Solar Panel "+ solarPanel.position);

        if (solarPanel.eventFlag){
            String eventString = alramText+": Low Electricity Generated to Solar Panel "+solarPanel.position;
            Blackbox.getInstance().record(eventString);
            System.out.println(">>>>"+eventString);
        }
        else{
            System.out.println("Solar Panel is OK");
        }
    }

    @Override
    public void visit(Arm arm) {
        System.out.println("Checking robot arm");

        if  (arm.eventFlag){

            String eventString = alramText+": "+arm.position+" Robot Arm Not Working Properly";
            Blackbox.getInstance().record(eventString);
            System.out.println(".. "+eventString);
        }
        else{
            System.out.println("Robot Arm is OK");
        }
    }

    @Override
    public void visit(Camera cam) {
        System.out.println("Checking camera");
        
        if (cam.eventFlag){
            String eventString = alramText+": Camera Not Working Properly";
            Blackbox.getInstance().record(eventString);
            System.out.println(".. "+eventString);
        }
        else{
            System.out.println("Camera is OK");
        }
    }

    
    
}
