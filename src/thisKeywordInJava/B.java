package thisKeywordInJava;

class B {
	int x = 5;

	// Default Constructor that create a object of A
	// with passing this as an argument in the
	// constructor
	B() {
		A obj = new A(this);
	}

	// method to show value of x
	void display() {
		System.out.println("Value of x in Class B : " + x);
	}

	public static void main(String[] args) {
		B obj = new B();
	}
}
