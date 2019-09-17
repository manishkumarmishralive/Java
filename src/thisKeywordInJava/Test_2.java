package thisKeywordInJava;

//3. Using ‘this’ keyword to return the current class instance

//Java code for using 'this' keyword  
//to return the current class instance
public class Test_2 {
	int a;
	int b;

	// Default constructor
	Test_2() {
		a = 10;
		b = 20;
	}

	// Method that returns current class instance
	Test_2 get() {
		return this;

	}

	// Displaying value of variables a and b
	void display() {
		System.out.println("a: " + a + "\nb: " + b);
	}

	public static void main(String[] args) {
		Test_2 obj = new Test_2();
		obj.display();
	}

}
