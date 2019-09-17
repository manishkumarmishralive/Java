package constructor;

public class Constructor_Overloading_Concept {
	// constructor with one argument
	Constructor_Overloading_Concept(String name) {
		System.out.println("Constructor with one argument is called" + name);
	}

	// constructor with two arguments
	Constructor_Overloading_Concept(int roll, String name) {
		System.out.println("Constructor with two argument Name is :" + name + "Roll Number is :" + roll);
	}

	// Constructor with one argument but with different
	// type than previous..
	Constructor_Overloading_Concept(long id) {
		System.out.println("Constructor with different argument is called" + id);
	}

	public static void main(String[] args) {
		// Creating the objects of the class named
		// 'Constructor_Overloading_Concept'
		// by passing different arguments

		// Invoke the constructor with one argument of
		// type 'String'.
		Constructor_Overloading_Concept con1 = new Constructor_Overloading_Concept("Maneesh");
		// Invoke the constructor with two arguments
		Constructor_Overloading_Concept con2 = new Constructor_Overloading_Concept(10, "Munna");
		// Invoke the constructor with one argument of
		// type 'Long'.
		Constructor_Overloading_Concept con3 = new Constructor_Overloading_Concept(4556565);
	}

}
