package assn2;

public class TemperController extends Controller implements Runnable {

	public TemperController(BlackBOX myBlackBox) {
		super(myBlackBox);
	}

	@Override
	public void run() {
		System.out.println("Air Conditioner Control at work.");
		for (int i = 0; i < 15; i++) {

			// 온도 변화 이벤트 외에 온도를 건들이지 않음
			if (super.Event == 2) { // 2 : Temper too high Event
				Car.getInstance().setTemper(Car.getInstance().getTemper() + (5 + (int) (Math.random() * 5)));
			} else if (super.Event == 3) { // 3 : Temper too low Event
				Car.getInstance().setTemper(Car.getInstance().getTemper() - (5 + (int) (Math.random() * 5)));
			}

			System.out.println(
					"Current for Air Conditioner Control, current Temperature :" + Car.getInstance().getTemper());

			if (Car.getInstance().getTemper() > 26) {
				System.out.println("Turn on aircon to lower temperature");
				super.blackbox.recordEvent(Event);
				Car.getInstance().setTemper(24);
			} else if (Car.getInstance().getTemper() < 23) {
				System.out.println("Turn on heater to increase temperature");
				super.blackbox.recordEvent(Event);
				Car.getInstance().setTemper(26);
			} else {
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
		super.Event = event;
	}

}
