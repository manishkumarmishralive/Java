package abstraction_Concept;

public class Derived_2 extends Base_1 {
	Derived_2() {
		System.out.println("derived class constructor called");
	}

	void fun() {
		System.out.println("derived fun() method called");
	}

	public static void main(String[] args) {
		Derived_2 d = new Derived_2();
		d.fun();
		d.ConcreteMethod();
	}

}
