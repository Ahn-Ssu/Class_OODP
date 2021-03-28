package assn2;

public class BlackBOX {
//	public static final int SPEED = 0;
//	public static final int Lane = -> 1
//	public static final int TemperUp = -> 2
//	public static final int TemperDown = -> 3
//	public static final int Pedestrian = -> 4
//	public static final int Animal = -> 5
//	public static final int Traffic = -> 6 
//	public static final int Distance = -> 7

	private int Animals = 0;
	private int Pedestrian = 0;
	private int RedLights = 0;
	private int Distance = 0;
	private int Heater = 0;
	private int Aircon = 0;
	private int LaneCenter = 0;

	public void recordEvent(int event) {
		if (event == 1) {
			this.LaneCenter ++;
		} else if (event == 2) {
			this.Heater ++;
		} else if (event == 3) {
			this.Aircon++;
		} else if (event == 4) {
			this.Pedestrian++;
		} else if (event == 5) {
			this.Animals++;
		} else if (event == 6) {
			this.RedLights++;
		} else if (event == 7) {
			this.Distance++;
		}
	}

	public void showAll() {
		System.out.println("=== Black Box Data ===");
		System.out.println("Number of Animals Sensed: "+Animals);
		System.out.println("Number of Pedestrian Sensed: "+Pedestrian);
		System.out.println("Number of Red Traffic Lights Sensed: "+ RedLights);
		System.out.println("Number of Distance Control: "+Distance);
		System.out.println("Number of Heater Turned On: "+ Heater);
		System.out.println("Number of Aircon Turned On: "+ Aircon);
		System.out.println("Number of Lane Centering Activated: "+LaneCenter);
		System.out.println("=== Black Box in Sleep Mode ===");
	}
}
