package thisKeywordInJava;

//4. Using ‘this’ keyword as method parameter
public class Test_3 {
	int a;
	int b;

	// Default constructor
	Test_3() {
		a = 10;
		b = 20;
	}

	// Method that receives 'this' keyword as parameter
	void display(Test_3 obj) {
		System.out.println("a: " + a + "\nb: " + b);
	}

	// Method that returns current class instance
	void get() {
		display(this);
	}

	public static void main(String[] args) {
		Test_3 object = new Test_3();
		// object.display(object);
		object.get();
	}

}
