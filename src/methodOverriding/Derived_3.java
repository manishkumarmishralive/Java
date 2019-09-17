package methodOverriding;

public class Derived_3 extends Base_3 {

	public static void m1() {
		System.out.println("child static method m1()");
	}

	public void m2() {
		System.out.println("child non static method m2()");
	}

	public static void main(String[] args) {
		// Base_3 obj1 = new Base_3();
		// obj1.m1();
		// obj1.m2();

		Base_3 obj2 = new Derived_3();
		obj2.m1();
		obj2.m2();

	}

}
