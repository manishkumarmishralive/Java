package interface_concept;

public class Bicycle implements Vehicle {
	int gear;
	int speed;

	@Override
	public void changeGear(int newGear) {
		gear = newGear;
	}

	@Override
	public void speedUp(int increment) {
		speed = speed + increment;
	}

	@Override
	public void applyBreak(int decrement) {
		speed = speed - decrement;
	}

	public void printStatus() {
		System.out.println("Gear: " + gear + "  Speed: " + speed);
	}

	public static void main(String[] args) {
		Bicycle bi = new Bicycle();
		bi.changeGear(4);
		bi.speedUp(50);
		bi.applyBreak(30);
		bi.printStatus();
		System.out.println("Bicycle present states :");
		bi.printStatus();

		Bike b = new Bike();
		b.changeGear(3);
		b.speedUp(55);
		b.applyBreak(20);
		System.out.println("Bike present states :");
		b.printStates();
	}

}
