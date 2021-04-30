public class adaptorMain {

	public static void main(String[] args) {

		int battery_1st, battery_2nd;

		CarController myController = new CarController();

		for (int i = 0; i < 10; i++) {
			battery_1st = (int) (Math.random() * 60) + 40; // range [40 ~ 100]
			battery_2nd = (int) (Math.random() * 60) + 40; // range [40 ~ 100]

			if (battery_1st >= 75 && battery_2nd >= 75) {
				myController.changeMode(new ElectricCarEnv(battery_1st, battery_2nd).showBatteryInfo());

			} else if (battery_1st >= 75) {
				
				myController.changeMode(new HybridCarEnv(battery_1st, battery_2nd).showBatteryInfo());
				
			} else {
				
				myController.changeMode(new FuelCarEnv(battery_1st, battery_2nd).showBatteryInfo());
			}

			myController.showSpeed();

			System.out.println("");
		}

	}
}
