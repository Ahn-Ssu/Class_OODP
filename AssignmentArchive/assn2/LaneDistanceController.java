package assn2;

public class LaneDistanceController extends Controller implements Runnable {

	public LaneDistanceController(BlackBOX myBlackBox) {
		super(myBlackBox);
	}

	@Override
	public void run() {
		for (int i = 0; i < 15; i++) {

			if (super.Event == 1) {
				System.out.println("Event Generated -- Not in Lane Center");
				super.blackbox.recordEvent(Event);
				System.out.println("Not in Lane Center");

				System.out.println("Correcting Car Position on Lane Center...");
			} else if (super.Event == 7) {
				System.out.println("Event Generated -- Distance Getting Closer from the Front Car");
				super.blackbox.recordEvent(Event);
				System.out.println("the Speed of Front Car Dropping Fast : slow down to keep distance...");

				int slowDown = Car.getInstance().getVelocity() / ((int) (Math.random() * 1) + 4)
						+ ((int) (Math.random() * 3));
				System.out.println("Current Decreased Speed for Distance from the Car Ahead: " + slowDown);
				Car.getInstance().setVelocity(slowDown);

				int slowUp = Car.getInstance().getSetVelo() / ((int) (Math.random() * 1) + 3)
						+ ((int) (Math.random() * 3));
				System.out.println("Current Increased Speed Following the Front Car Increasing Speed : " + slowUp);
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
