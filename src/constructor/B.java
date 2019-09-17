package constructor;

public class B {

	// Since i is static final,
	// it must be assigned value here
	// or inside static block .
	static final int i;

	static {
		i = 10;
	}

	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.i);
	}

}
