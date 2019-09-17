package abstraction_Concept;

public class Derived_5 extends Base_4 {

	public static void main(String[] args) {
		// Derived_5 d = new Derived_5();
		Base_4 b = new Derived_5();
		b.fun();
		// d.fun();
	}

	void fun() {
		System.out.println("Hello");

	}

}
