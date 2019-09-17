package abstraction_Concept;

public class Derived_1 extends Base {

	void fun() {
		System.out.println("Derived fun() method called");
	}

	public static void main(String[] args) {
		// Uncommenting the following line will cause compiler error as the
		// line tries to create an instance of abstract class.
		// 1.Base b = new Base();
		// 2. we can create object like below
		// Derived_1 d = new Derived_1();
		// d.fun();
		// 3. We can create object like below
		Base b = new Derived_1();
		b.fun();
	}

}
