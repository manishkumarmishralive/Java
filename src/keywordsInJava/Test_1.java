package keywordsInJava;

public class Test_1 {
	// static int i = 10;
	static int i;
	int j;

	static {
		i = 10;
		System.out.println("static block called");
	}

	public static void main(String[] args) {
		// 1. 1st way to call i
		// System.out.println(i);
		// 2. 2nd way to call i using class name
		System.out.println(Test_1.i);
	}

}
