package assn2;

public class SpeedControler extends Controler implements Runnable {
    

    public SpeedControler(BlackBOX myBlackBox, Sensor sensor){
        super(myBlackBox,sensor);
    }
    
    @Override
    public void run(){
    	System.out.println("Speed Control at work.");
    	System.out.println("Speed set to "+ Car.getInstance().getSetVelo());
    	
    	for(int i = 0 ; i < 15 ; i++) {
    		
    		// 주행으로 인한 속도 변화 적용 
    		Car.getInstance().setVelocity( 
    				Car.getInstance().getVelocity() - ((int)(Math.random()*10 -5)));
    		System.out.println("Thread for Speed Control, current speed : "+Car.getInstance().getVelocity());
    		
//    		public static final int SPEED = 0;
//    		public static final int Lane = -> 1
//    		public static final int TemperUp = -> 2
//    		public static final int TemperDown = -> 3
//    		public static final int Pedestrian = -> 4
//    		public static final int Animal = -> 5
//    		public static final int Traffic = -> 6 
//    		public static final int Distance = -> 7
    		
    		
    		if(super.Event < 4 ) { // [0,1,2,3] = 속도조절(이벤트x), 차선이탈, 온도 증가, 온도 하락일 때 스피드 스레드가 속도 조
    			if (Car.getInstance().getVelocity() > Car.getInstance().getSetVelo()) {
    				System.out.println("Push brake to slow down speed");
    				Car.getInstance().setVelocity(Car.getInstance().getSetVelo());
        		}
        		else if (Car.getInstance().getVelocity() < Car.getInstance().getSetVelo()) {
        			System.out.println("Pick up speed");
        			Car.getInstance().setVelocity( Car.getInstance().getSetVelo());
        		}
    		}
    	
    		
    		try {
    			Thread.sleep(1000);
    		} catch ( InterruptedException e) {}
    	}
        
        
    }

	@Override
	public void receiveEvent(int event) {
		super.Event = event;
		
	}

}
