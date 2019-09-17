package funstionsInJava;

public class Addition_1 {
	double sum = 0;
	float fsum = 0;

	public double addTwoDouble(double d, double e) {
		sum = d + e;
		return sum;
	}

	public float addTwoFloatValue(float a, float b) {
		fsum = a + b;
		return fsum;

	}

	public static void main(String[] args) {
		Addition_1 obj = new Addition_1();
		double addition = obj.addTwoDouble(100.0, 50.0);
		System.out.println("Addition of two values is :" + addition);

		float faddition = obj.addTwoFloatValue(150f, 50f);
		System.out.println("Addition of two float value is :" + faddition);
	}

}
