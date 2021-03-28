package assn2;

public class TemperControler extends Controler implements Runnable {
   
    
    public TemperControler(BlackBOX myBlackBox, Sensor sensor){
    	super(myBlackBox, sensor);
    }
    
    @Override
    public void run(){
    	System.out.println("Air Conditioner Control at work.");
    	for(int i = 0 ; i < 15 ; i++) {
//    		public static final int SPEED = 0;
//    		public static final int Lane = -> 1
//    		public static final int TemperUp = -> 2
//    		public static final int TemperDown = -> 3
//    		public static final int Pedestrian = -> 4
//    		public static final int Animal = -> 5
//    		public static final int Traffic = -> 6 
//    		public static final int Distance = -> 7
    		
    		
    		// 온도 변화 이벤트 외에 온도를 건들이지 않음 
    		if( super.Event == 2) { // 2 : Temper too high Event
    			Car.getInstance().setTemper(
        				Car.getInstance().getTemper()
        				+ (5 + (int)(Math.random()*5) ));
    		}
    		else if ( super.Event == 3 ) { // 3 : Temper too low Event
    			Car.getInstance().setTemper(
        				Car.getInstance().getTemper()
        				- (5 + (int)(Math.random()*5) ));
    		}
    		
    		System.out.println("Current for Air Conditioner Control, current Temperature :" + Car.getInstance().getTemper());
    		
//    		public static final int SPEED = 0;
//    		public static final int Pedestrian = 1; -> 4
//    		public static final int Animal = 2; -> 5
//    		public static final int Traffic = 3; -> 6 
//    		public static final int Distance = 4; -> 7
//    		public static final int Lane = 5; -> 1
//    		public static final int TemperUp = 6; -> 2
//    		public static final int TemperDown = 7; -> 3
    		
    		if (Car.getInstance().getTemper()> 26) {
    			System.out.println("Turn on aricon to lower temperature");
    			super.blackbox.recordEvent(Event);
    			Car.getInstance().setTemper(24);
    		}
    		else if ( Car.getInstance().getTemper() < 23) {
    			System.out.println("Turn on heater to increase temperature");
    			super.blackbox.recordEvent(Event);
    			Car.getInstance().setTemper(26);
    		}
    		else {
    			System.out.println("Temperature OK");
    		}
    		try {
				Thread.sleep(1020); // 가장 낮은 우선 순위의 
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
