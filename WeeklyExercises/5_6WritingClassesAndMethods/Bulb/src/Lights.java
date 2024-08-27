
public class Lights {

	public static void main(String[] args) {
		Bulb Bulb1 = new Bulb();
		Bulb1.getState();
		Bulb1.turnOff();
		Bulb1.getState();
		
		Bulb Bulb2 = new Bulb();
		Bulb2.getState();
		Bulb2.turnOff();
		Bulb2.getState();
		Bulb2.turnOn();
		Bulb2.getState();

	}

}
