package methodOverriding;

public class Derived_2 extends Base_4 {
	// Private method are not overridden
	private void m1() {
		System.out.println("sub-class m1()");
	}

	public void m2() {
		System.out.println("sub class m2()");
	}

	public static void main(String[] args) {
		// Base_4 obj = new Base_4();
		// obj.m2();
		Base_4 obj1 = new Derived_2();
		obj1.m2();
	}

}
