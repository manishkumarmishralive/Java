package thisKeywordInJava;

public class Test_5 {
	// calling function show()
	void display() {
		this.show();
		System.out.println("inside display() method ");
	}

	// calling function print()
	void show() {
		this.print();
		System.out.println("Inside show() method ");
	}

	void print() {
		System.out.println("Inside print() method ");
	}

	public static void main(String[] args) {
		Test_4 obj = new Test_4();
		obj.display();
		obj.show();
	}

}
