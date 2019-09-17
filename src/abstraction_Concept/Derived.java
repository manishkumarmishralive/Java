package abstraction_Concept;

public class Derived extends Shape {
	void fun() {
		System.out.println("Derived fun() called");
	}

	public static void main(String[] args) {
		// 1) Like C++, in Java, an instance of an abstract class cannot be
		// created, we can have references of
		// abstract class type though.

		// Shape s = new Shape();
		// s.fun();
		// Uncommenting the following line will cause compiler error as the
		// line tries to create an instance of abstract class.
		// Base b = new Base();

		// We can have references of Base type.

		Shape s = new Derived();
		s.fun();
	}

}
