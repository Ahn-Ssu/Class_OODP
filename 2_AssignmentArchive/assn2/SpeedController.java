package assn2;

public class SpeedController extends Controller implements Runnable {
    

    public SpeedController(BlackBOX myBlackBox){
        super(myBlackBox);
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
