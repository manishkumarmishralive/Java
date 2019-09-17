package methodoverloading;

public class Test_2 {
	public static void show() {
		System.out.println("hi");
	}

	public static void show(int x) {
		System.out.println("print x");
	}

	public static void main(String[] args) {
		Test_2.show();
		Test_2.show(5);

	}

}
