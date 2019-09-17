package funstionsInJava;

public class Addition {
	int sum = 0;

	public int addTwoNum(int a, int b) {
		sum = a + b;
		return sum;

	}

	public static void main(String[] args) {

		Addition obj = new Addition();
		System.out.println("Addition is :" + obj.addTwoNum(8, 9));
	}

}
