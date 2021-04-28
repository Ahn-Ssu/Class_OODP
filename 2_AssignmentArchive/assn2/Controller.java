package assn2;

public abstract class Controller {
	protected Sensor sensor;
	protected BlackBOX blackbox;
	protected static int Event;

	public Controller(BlackBOX blackbox) {
		this.blackbox = blackbox;
	}

	public abstract void receiveEvent(int event);
}
