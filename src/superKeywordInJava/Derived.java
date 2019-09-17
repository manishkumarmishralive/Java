package superKeywordInJava;

public class Derived extends Base {
	int maxSpeed = 180;

	void display() {

		System.out.println("maxspeed is: " + super.maxSpeed);
	}

	public static void main(String[] args) {
		Derived obj = new Derived();
		obj.display();
	}

}
