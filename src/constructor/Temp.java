package constructor;

public class Temp {
	// default constructor 1
	// default constructor will call another constructor
	// using this keyword from same class
	Temp() {
		// Call constructor 2
		this(6);
		System.out.println("The default constructor");
	}

	// parameterized constructor 2
	Temp(int x) {
		// calls constructor 3
		this(5, 8);
		System.out.println(x);
	}

	// parameterized constructor 3
	Temp(int x, int y) {
		System.out.println(x * y);

	}

	public static void main(String[] args) {
		// invokes default constructor first
		Temp t = new Temp();
	}

}
