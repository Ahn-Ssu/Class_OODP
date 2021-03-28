package assn2;

public class BreakControler extends Controler implements Runnable {

    public BreakControler(BlackBOX myBlackBox, Sensor sensor){
        super(myBlackBox, sensor);
    }
    
    @Override
    public void run(){
    	System.out.println("Break Control at work.");
    	
    	for(int i = 0 ; i < 15 ; i++) {
    		
//    		public static final int SPEED = 0;
//    		public static final int Lane = -> 1
//    		public static final int TemperUp = -> 2
//    		public static final int TemperDown = -> 3
//    		public static final int Pedestrian = -> 4
//    		public static final int Animal = -> 5
//    		public static final int Traffic = -> 6 
//    		public static final int Distance = -> 7

    		
    		if (super.Event == 4 ) { // 4 -> 보행자 출현, 정지에 가까운 서행 수행 
    			System.out.println("Event Generated -- Pedestrian");
    			super.blackbox.recordEvent(Event);
    			System.out.println("Pedestrian Crossing the Road: slow down to stop!");
    			
    			int slowDown = Car.getInstance().getVelocity()/((int)(Math.random()*1)+8) + ((int)(Math.random()*3));
    			System.out.println("Current Decreased Speed while a Pedestrain Crossing :"+ slowDown);
    			Car.getInstance().setVelocity(slowDown);
    			
    			System.out.println("Now the car made a full stop for pedestrians");
    			Car.getInstance().setVelocity(0);
    			
    			System.out.println("Now the Pedestrian in Safe Area and the Road Cleared");
    			
    			int slowUp = Car.getInstance().getSetVelo()/((int)(Math.random()*1)+7) + ((int)(Math.random()*3));
    			System.out.println("Current Increased Speed after Passing a Pedestrian in Safe Area :"+slowUp);
    			Car.getInstance().setVelocity(slowUp);
    			
    			Car.getInstance().setVelocity(Car.getInstance().getSetVelo());
    		}
    		else if (super.Event == 5) { // 5-> 동물 출현, 서행 
    			System.out.println("Event Generated -- Animal");
    			super.blackbox.recordEvent(Event);
    			System.out.println("Animal Crossing Sensed: slow down ...!");
    			int slowDown = Car.getInstance().getVelocity()/((int)(Math.random()*1)+4) + ((int)(Math.random()*3));
    			System.out.println("Current Decreased Speed in front of an Animal: "+slowDown);
    			Car.getInstance().setVelocity(slowDown);
    			
    			System.out.println("Road Cleared of Animal : Increase Speed");
    			
    			int slowUp = Car.getInstance().getSetVelo()/((int)(Math.random()*1)+3) + ((int)(Math.random()*3));
    			System.out.println("Current Increased Speed after Passing an Animal : "+ slowUp);
    			Car.getInstance().setVelocity(slowUp);
    			
    			Car.getInstance().setVelocity(Car.getInstance().getSetVelo());
    		}
    		else if(super.Event == 6 ) { // 6 -> 빨간 불, 서행, 정
    			System.out.println("Event Generated -- Red Traffic Light");
    			super.blackbox.recordEvent(Event);
    			System.out.println("Slowing down speed to stop at red light...");
    			
    			int slowDown = Car.getInstance().getVelocity()/((int)(Math.random()*1)+8) + ((int)(Math.random()*3));
    			System.out.println("Current Decreased Speed in Front of Red Light :"+ slowDown);
    			Car.getInstance().setVelocity(slowDown);
    			
    			System.out.println("Now the car made a complete stop");
    			Car.getInstance().setVelocity(0);
    			
    			System.out.println("Now Green Light Turned on");
    			
    			int slowUp = Car.getInstance().getSetVelo()/((int)(Math.random()*1)+7) + ((int)(Math.random()*3));
    			System.out.println("Current Increased Speed on Green Traffic Light :"+slowUp);
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
		super.Event = event;
		
	}

}
