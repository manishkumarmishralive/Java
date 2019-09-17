package interface_concept;

public class Bicycle_2 implements Vehicle_2 {
	int gear;
	int speed;

	public static void main(String[] args) {
		Bicycle_2 bi = new Bicycle_2();
		bi.changeGear(1);
		bi.speed(16);
		bi.applyBrakes(5);
		System.out.println("Present states of Bicycle is :");
		bi.printStates();

	}

	// to change gear
	@Override
	public void changeGear(int newGear) {
		gear = newGear;

	}

	// to increase speed
	@Override
	public void speed(int increment) {
		speed = speed + increment;

	}

	// to decrease speed
	@Override
	public void applyBrakes(int decrement) {

		speed = speed - decrement;
	}

	void printStates() {
		System.out.println("speed: " + speed + "  gear: " + gear);
	}

}
