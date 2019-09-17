package methodoverloading;

public class Sum {
	// Overloaded sum(). This sum takes two int parameters
	public int sum(int x, int y) {
		return x + y;

	}

	// Overloaded sum(). This sum takes three int parameters
	public int sum(int x, int y, int z) {
		return x + y + z;

	}

	// Overloaded sum(). This sum takes two double parameters
	public double sum(double x, double y) {
		return x + y;

	}

	public static void main(String[] args) {
		Sum sum = new Sum();
		System.out.println("sum: " + sum.sum(5, 7));
		System.out.println("sum: " + sum.sum(9.5, 10.5));
		System.out.println("Sum is: " + sum.sum(3, 8, 1));

	}

}
