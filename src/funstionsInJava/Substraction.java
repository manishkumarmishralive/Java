package funstionsInJava;

public class Substraction {
	int sub = 0;

	public int subTwoInt(int a, int b) {
		sub = a - b;
		return sub;

	}

	public static void main(String[] args) {
		Substraction obj = new Substraction();

		int sub = obj.subTwoInt(100, 50);
		System.out.println("Substraction of two intgeger values are :" + sub);

	}

}
