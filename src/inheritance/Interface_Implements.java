package inheritance;

//Java program to demonstrate that a class can 
//implement multiple interfaces
//class implements both interfaces 
//and provides implementation to the method. 
public class Interface_Implements implements Interface_1, Interface_2 {

	public static void main(String[] args) {

		Interface_Implements ii = new Interface_Implements();
		// calling the method implemented
		// within the class.
		ii.m1();
		ii.m2();
	}

	@Override
	public void m2() {
		System.out.println("Welcome inside method m2");

	}

	@Override
	public void m1() {

		System.out.println("Welcome inside method m2");
	}

}
