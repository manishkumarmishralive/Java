package thisKeywordInJava;

//2. Using this() to invoke current class constructor
public class Test_1 {

	int a;
	int b;
	String name;

	// Default constructor
	Test_1() {
		this(10, 20, "Maneesh");
		System.out.println("Inside default constructor \n");
	}

	// Parameterized constructor
	Test_1(int a, int b, String name) {
		this.a = a;
		this.b = b;
		this.name = name;
		System.out.println("inside Parametrized constructor");
	}

	void display() {
		System.out.println("a: " + a + "\nb: " + b + "\nName is : " + name);
	}

	public static void main(String[] args) {
		Test_1 obj = new Test_1();
		obj.display();
	}

}
