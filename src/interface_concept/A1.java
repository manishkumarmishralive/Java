package interface_concept;

public class A1 implements Printable {

	public static void main(String[] args) {
		A1 a = new A1();
		a.print();

	}

	public void print() {
		System.out.println("print method called");
	}

}
