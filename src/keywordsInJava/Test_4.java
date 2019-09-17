package keywordsInJava;

public class Test_4 {
	// Static variable
	static int a = 10;
	// Instance variable
	int b = 20;

	// static method
	static void m1() {
		a = 10;
		System.out.println("from m1()");

		// Cannot make a static reference to the non-static field b
		// b=20;//compilation error
		// Cannot make a static reference to the
		// non-static method m2() from the type Test
		// m2();//compilation error

		// Cannot use super in a static context
		// System.out.println(super.a);//compilation error
	}

	void m2() {
		System.out.println("from m2()");
	}

	public static void main(String[] args) {
		System.out.println(a);
		Test_4.m1();
		Test_4 obj = new Test_4();
		obj.m2();
		int b = obj.b;
		System.out.println(b);
	}

}
