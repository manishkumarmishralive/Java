package interface_concept;

public class Bike implements Vehicle {
	int gear;
	int speed;

	@Override
	public void changeGear(int newGear) {
		gear = newGear;

	}

	@Override
	public void speedUp(int increament) {

		speed = speed + increament;
	}

	@Override
	public void applyBreak(int decrement) {
		speed = speed - decrement;

	}

	public void printStates() {
		System.out.println("Speed is: " + speed + "   Gear is :" + gear);
	}

}
