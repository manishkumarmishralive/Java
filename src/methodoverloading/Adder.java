package methodoverloading;

public class Adder {
	public static int add(int a, int b) {
		return a + b;

	}

	public static double add(double a, double b) {
		return a + b;

	}

	public static void main(String[] args) {
		System.out.println(Adder.add(5, 7));
		System.out.println(Adder.add(8, 9));
	}

}
