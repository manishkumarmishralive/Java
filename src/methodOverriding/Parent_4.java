package methodOverriding;

//Java program to show that 
//if the static method is redefined by 
//a derived class, then it is not 
//overriding, it is hiding 
public class Parent_4 {
	// Static method in base class
	// which will be hidden in subclass
	public static void m1() {
		System.out.println("from Parent m1() static method");
	}

	// Non-static method which will
	// be overridden in derived class
	public void m2() {
		System.out.println("from Parent m2() non-static method ");
	}
}
