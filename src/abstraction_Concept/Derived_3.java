package abstraction_Concept;

public class Derived_3 extends Base_2 {
	void fun1() {
		System.out.println("Inherited method called");
	}

	public static void main(String[] args) {
		Derived_3 d = new Derived_3();
		d.fun();
		d.fun1();
	}

}
