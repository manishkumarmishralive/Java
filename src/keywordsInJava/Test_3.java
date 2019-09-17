package keywordsInJava;

public class Test_3 {
	// static variable
	static int a = m1();
	// static block
	static {
		System.out.println("inside static block");
	}

	// static method
	static int m1() {
		System.out.println("from m1()");
		return 20;

	}

	public static void main(String[] args) {
		System.out.println("value of a: " + a);
		System.out.println("from main");
	}

}
