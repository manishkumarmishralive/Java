package thisKeywordInJava;

//5. Using ‘this’ keyword to invoke current class method
public class Test_4 {

	// calling function show()
	void display() {
		this.show();
		System.out.println("inside display() method");
	}

	void show() {
		System.out.println("inside show() method");
	}

	public static void main(String[] args) {
		Test_4 obj = new Test_4();
		obj.display();
	}

}
