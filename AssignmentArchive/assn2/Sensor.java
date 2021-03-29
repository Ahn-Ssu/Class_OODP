package assn2;

import java.util.ArrayList;
import java.util.List;

public class Sensor implements Runnable {
	private List<Controller> controlers;

	public Sensor() {
		this.controlers = new ArrayList<>();
	}

	public void addControler(Controller newControler) {
		this.controlers.add(newControler);
	}

	@Override
	public void run() {

		for (int i = 0; i < 15; i++) {
			int nowEvent = ((int) (Math.random() * 8));
			for (Controller one : this.controlers) {

				one.receiveEvent(nowEvent);
			}
			try {
				Thread.sleep(950); // 950 으로 잡아서 이벤트의 갱신이 가장 먼저 되게 두었습니다.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}