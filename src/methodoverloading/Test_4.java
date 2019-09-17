package methodoverloading;

//Method overloading by type of input parameter are different
public class Test_4 {
	public int sum(int a) {
		return a;

	}

	public float sum(float f, int b) {
		return f + b;

	}

	public double sum(double a, double b) {
		return a + b;

	}

	public String sum(String a) {
		return a;

	}

	public static void main(String[] args) {
		Test_4 t = new Test_4();
		System.out.println(t.sum(5));
		System.out.println(t.sum(2.5, 7));
		System.out.println(t.sum(8, 9));
		System.out.println(t.sum("Maneesh"));

	}

}
