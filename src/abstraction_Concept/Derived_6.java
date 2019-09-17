package abstraction_Concept;

public class Derived_6 extends Base_5 {

	void fun() {
		System.out.println("Hello Derived");
	}

	public static void main(String[] args) {
		Base_5 b = new Derived_6();
		b.fun();
	}

}
