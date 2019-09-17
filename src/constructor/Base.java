package constructor;

//Java program to illustrate Constructor Chaining 
//within same class Using this() keyword 
//and changing order of constructors
public class Base {

	// default constructor 1
	Base() {
		System.out.println("Default");

	}

	// parameterized constructor 2
	Base(int x) {
		// invokes default constructor
		this();
		System.out.println(x);
	}

	// parameterized constructor 3
	Base(int x, int y) {
		// invokes parameterized constructor 2
		this(5);
		System.out.println(x * y);
	}

	public static void main(String[] args) {

		Base b = new Base(10, 19);
	}

}
