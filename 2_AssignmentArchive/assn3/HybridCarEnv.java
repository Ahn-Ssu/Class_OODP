public class HybridCarEnv implements EnvTemplate {

	private int b1, b2;

	public HybridCarEnv(int b1, int b2) {
		this.b1 = b1;
		this.b2 = b2;
	}

	public String showBatteryInfo() {

		System.out.println("Main battery hav enough power. But secondary battery needs more charging.");
		System.out.println("Main Battery     :->" + b1 + " % Charged");
		System.out.println("Secondary Battery:->" + b2 + " % Charged");

		return "Hybrid";
	}
}
