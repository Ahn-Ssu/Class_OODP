package assn2;

import java.util.ArrayList;
import java.util.List;

public class Sensor implements Runnable {
	private List<Controler> controlers;

	public Sensor() {
		this.controlers = new ArrayList<>();
	}

	@Override
	public void run() {

		for (int i = 0; i < 15; i++) {
			int nowEvent = ((int) (Math.random() * 8));
			for (Controler one : this.controlers) {

				one.receiveEvent(nowEvent);
			}
			try {
				Thread.sleep(950); // 950 으로 잡아서 이벤트의 갱신이 가장 먼저 되게 두었습니다.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void addControler(Controler newControler) {
		this.controlers.add(newControler);
	}

}