package assn2;

public abstract class Controler {
	protected Sensor sensor;
	protected BlackBOX blackbox;
	protected static int Event;
	
	public Controler(BlackBOX blackbox, Sensor sensor) {
		this.sensor = sensor;
		this.blackbox = blackbox;
	}
	
	public abstract void receiveEvent(int event);
}
