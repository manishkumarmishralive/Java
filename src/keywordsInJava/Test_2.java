package keywordsInJava;

public class Test_2 {
	static int i;
	int j;
	static {
		i = 10;
		System.out.println("static block called");
	}

	Test_2() {
		System.out.println("Constructor called");
	}

	public static void main(String[] args) {
		// Although we have two objects, static block is executed only once.
		Test_2 obj1 = new Test_2();
		Test_2 obj2 = new Test_2();
		Test_2 obj3 = new Test_2();
		System.out.println(i);
	}

}
