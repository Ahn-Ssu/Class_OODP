public class ElectricCarEnv implements EnvTemplate {

	private int b1, b2;

	public ElectricCarEnv(int b1, int b2) {
		this.b1 = b1;
		this.b2 = b2;
	}

	public String showBatteryInfo() {
		System.out.println("Main and Secondary batteries have enough power.");
		System.out.println("Main Battery     :->" + b1 + " % Charged");
		System.out.println("Secondary Battery:->" + b2 + " % Charged");

		return "Electirc";
	}
}
