package methodoverloading;

public class Main_1 {
	public static void foo() {
		System.out.println("foo() method called");
	}

	public static void foo(int x) {
		System.out.println("int foo() called");
	}

	public static void main(String[] args) {
		Main_1.foo();
		Main_1.foo(5);

	}

}
