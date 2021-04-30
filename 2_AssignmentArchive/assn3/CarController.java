public class CarController extends Car implements RequestInterface {

	@Override
	public void showSpeed() {
		super.getSpeed();
	}

	@Override
	public void changeMode(String env) {
		super.checkNcontrollMode(env);
	}

}
