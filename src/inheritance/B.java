package inheritance;

public class B extends A {

	public void print_B() {
		System.out.println("print B");
	}

	public static void main(String[] args) {

		B b = new B();
		b.print_A();
		b.print_B();

	}

}
