package methodoverloading;

//Method overloading by no of input parameter is different
public class Test_3 {
	public int sum(int a) {
		return a;

	}

	public int sum(int a, int b) {
		return a + b;

	}

	public int sum(int a, int b, int c) {
		return a + b + c;

	}

	public static void main(String[] args) {
		Test_3 t = new Test_3();
		System.out.println("a is : " + t.sum(5));
		System.out.println("Sum of a & b is :" + t.sum(8, 9));
		System.out.println("Sum of a, b & c is :" + t.sum(7, 8, 9));

	}

}
