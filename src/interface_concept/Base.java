package interface_concept;

public class Base implements Printable_1, Showable {

	public static void main(String[] args) {
		Base b = new Base();
		b.show();
		b.print();
	}

	public void show() {
		System.out.println("show method called");

	}

	public void print() {
		System.out.println("print method called");

	}

}
