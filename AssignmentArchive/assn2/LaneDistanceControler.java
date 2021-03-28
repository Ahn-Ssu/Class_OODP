package assn2;

public class LaneDistanceControler extends Controler implements Runnable {

    public LaneDistanceControler(BlackBOX myBlackBox, Sensor sensor){
        super(myBlackBox, sensor);
    }
    
    @Override
    public void run(){
    	for(int i = 0 ; i < 15 ; i++) {
//    		public static final int SPEED = 0;
//    		public static final int Pedestrian = 1; -> 4
//    		public static final int Animal = 2; -> 5
//    		public static final int Traffic = 3; -> 6 
//    		public static final int Distance = 4; -> 7
//    		public static final int Lane = 5; -> 1
//    		public static final int TemperUp = 6; -> 2
//    		public static final int TemperDown = 7; -> 3
    		
    		if(super.Event == 1 ) {
    			System.out.println("Event Generated -- Not in Lane Center");
    			System.out.println("Not in Lane Center");
    			
    			System.out.println("Correcting Car Position on Lane Center...");
    		}
    		else if(super.Event == 7) {
    			System.out.println("Event Generated -- Distance Getting Closer from the Front Car");
    			System.out.println("the Speed of Front Car Dropping Fast : slow down to keep distance...");
    			
    			int slowDown = Car.getInstance().getVelocity()/((int)(Math.random()*1)+4) + ((int)(Math.random()*3));
    			System.out.println("Current Decreased Speed for Distance from the Car Ahead: "+slowDown);
    			Car.getInstance().setVelocity(slowDown);
    			
    			int slowUp = Car.getInstance().getSetVelo()/((int)(Math.random()*1)+3) + ((int)(Math.random()*3));
    			System.out.println("Current Increased Speed Following the Front Car Increasing Speed : "+ slowUp);
    			Car.getInstance().setVelocity(slowUp);
    			
    			Car.getInstance().setVelocity(Car.getInstance().getSetVelo());
    		}
    	
    		
    		try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    	}
    	
    	
    	
        
    }

	@Override
	public void receiveEvent(int event) {
		// TODO Auto-generated method stub
		super.Event = event;
	}

}
