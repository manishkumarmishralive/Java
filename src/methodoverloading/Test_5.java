package methodoverloading;

public class Test_5 {
	public static void main(String[] args) {
		System.out.println("main with String[] args");
		Test_5.main();
		Test_5.main("geek");
	}

	public static void main(String args) {
		System.out.println("main witout []");
	}

	public static void main() {
		System.out.println("main witout String[] args");
	}

}
