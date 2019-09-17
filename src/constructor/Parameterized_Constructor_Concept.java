package constructor;

public class Parameterized_Constructor_Concept {
	// data members of the class.
	int num;
	String name;

	// constructor would initialize data members
	// with the values of passed arguments while
	// object of that class created.

	Parameterized_Constructor_Concept(int num, String name) {
		this.num = num;
		this.name = name;
		System.out.println("Parameterized constructor called");
	}

	public static void main(String[] args) {
		// this would invoke the parameterized constructor.
		Parameterized_Constructor_Concept p = new Parameterized_Constructor_Concept(10, "Maneesh");
		System.out.println("Name is :" + p.name);
		System.out.println("Number is: " + p.num);
	}

}
