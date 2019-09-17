package superKeywordInJava;

public class Student extends Person {

	void message() {
		System.out.println("This is student class");
	}

	// Note that display() is only in Student class
	void display() {
		// will invoke or call current class message() method
		message();
		System.out.println("display() method");
		super.message();
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.display();
	}

}
