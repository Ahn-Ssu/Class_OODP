public class FuelCarEnv implements EnvTemplate {

	private int b1, b2;

	public FuelCarEnv(int b1, int b2) {
		this.b1 = b1;
		this.b2 = b2;
	}

	public String showBatteryInfo() {
		System.out.println("Main battery and secondary battery have low power level.");
		System.out.println("Main Battery     :->" + b1 + " % Charged");
		System.out.println("Secondary Battery:->" + b2 + " % Charged");

		return "Fuel";
	}

}
