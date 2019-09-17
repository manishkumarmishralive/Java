package superKeywordInJava;

public class Car extends Vehicle {
	int maxSpeed = 120;

	void display() {
		System.out.println("Max speed vehicle is :" + super.maxSpeed);
	}

	public static void main(String[] args) {
		Car small = new Car();
		small.display();
	}

}
