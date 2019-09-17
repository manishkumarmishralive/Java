package constructor;

public class A {
	// i could be assigned a value here
	// or constructor or init block also.
	final int i;

	A() {
		i = 10;
	}

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.i);
	}

}
