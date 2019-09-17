package constructor;

public class Race {
	// Default constructor
	Race() {
		System.out.println("default");
	}

	// parameterized constructor 2
	Race(int x) {
		this(4, 6, "maneesh");
		System.out.println("4th constructor called");
	}

	// parameterized constructor 3
	Race(int x, int y) {

		this(8, "maneesh", 9);
		System.out.println("5th constructor called");
	}

	// parameterized constructor 4
	Race(int x, int y, String Maneesh) {

		this();
		System.out.println("Default constructor called");
	}

	// parameterized constructor 5
	Race(int x, String man, float f) {

		this(9);
		System.out.println("2nd constructor called");
	}

	public static void main(String[] args) {
		Race r = new Race(8, "maneesh", 5);
	}

}
