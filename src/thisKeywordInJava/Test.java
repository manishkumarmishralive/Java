package thisKeywordInJava;

//1. Using ‘this’ keyword to refer current class instance variables
public class Test {
	int a;
	int b;
	String name;

	Test(int a, int b, String name) {
		this.a = a;
		this.b = b;
		this.name = name;
	}

	void display() {
		System.out.println("A is: " + a + " \nB is :" + b + "\nName is : " + name);
	}

	public static void main(String[] args) {
		Test obj = new Test(10, 16, "Maneesh");
		obj.display();
	}

}
