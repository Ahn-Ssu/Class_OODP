package assn2;

import java.util.Scanner;

public class Car{
    private int velocity = 0;
    private int setVelo = 0;
	private int temper = 0;
	
	public static Car instance = new Car();

    
	public int nowEvent = 0 ; 
    
    public static BlackBOX myBlackBox = new BlackBOX();
    public static Sensor sharedSensor = new Sensor();

    public Car(){
        Scanner VeloSetter = new Scanner(System.in);
        while (true){
            System.out.print("Enter the Car Speed between 60 - 100 : ");
            this.velocity = VeloSetter.nextInt();
            this.setVelo = this.velocity;
            if(this.velocity >= 60 && this.velocity <= 100)
                break;
        }
        this.setTemper(((int)(Math.random()*3))+23); // 온도 23~26사이 생성 

    }
    public static void main(String[] args){
   
        
        
        Controler speedCheck = new SpeedControler(myBlackBox,sharedSensor);
        Controler BreakCheck = new BreakControler(myBlackBox,sharedSensor);
        Controler TemperCheck = new TemperControler(myBlackBox,sharedSensor);
        Controler CruseCheck = new LaneDistanceControler(myBlackBox, sharedSensor);
        
        sharedSensor.addControler(speedCheck);
        sharedSensor.addControler(BreakCheck);
        sharedSensor.addControler(TemperCheck);
        sharedSensor.addControler(CruseCheck);
        
        Thread speedThread = new Thread((Runnable) speedCheck);
        Thread BreakThread = new Thread((Runnable) BreakCheck);
        Thread TemperThread = new Thread((Runnable) TemperCheck);
        Thread CruseThread = new Thread((Runnable) CruseCheck);
        Thread SensorThread = new Thread(sharedSensor);
        
        speedThread.setPriority(Thread.NORM_PRIORITY);
        BreakThread.setPriority(Thread.NORM_PRIORITY);
        TemperThread.setPriority(Thread.MIN_PRIORITY);
        CruseThread.setPriority(Thread.NORM_PRIORITY);

//    	speedThread.start();
//    	BreakThread.start();
//    	SensorThread.start();
//    	TemperThread.start();
//    	CruseThread.start();
    	

    	
        	
        try {
        	speedThread.start();
        	BreakThread.start();
        	SensorThread.start();
        	TemperThread.start();
        	CruseThread.start();
			TemperThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}       
        
        myBlackBox.showAll();

        
    }
	public int getTemper() {
		return temper;
	}
	public void setTemper(int temper) {
		this.temper = temper;
	}
    public int getVelocity() {
		return velocity;
	}
	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}
	public static Car getInstance() {
		return instance;
	}
	public int getSetVelo() {
		return setVelo;
	}
}