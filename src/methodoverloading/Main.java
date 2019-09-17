package methodoverloading;

public class Main {
	public static int show(int a) {
		return a;

	}

	public static char show(int a, int b) {
		return 'v';

	}

	public static void main(String[] args) {
		System.out.println(show(5));
		System.out.println(show(7, 9));

	}

}
