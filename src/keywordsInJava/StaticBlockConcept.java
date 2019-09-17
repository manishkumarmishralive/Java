package keywordsInJava;

public class StaticBlockConcept {
	static int a = 10;
	static int b;

	static {
		System.out.println("static block initialized");

		b = a * 10;

	}

	public static void main(String[] args) {
		System.out.println("from main");
		System.out.println("value of a: " + a);
		System.out.println("value of b :" + b);
	}

}
