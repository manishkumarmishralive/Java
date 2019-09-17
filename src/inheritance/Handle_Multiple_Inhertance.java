package inheritance;

public class Handle_Multiple_Inhertance implements Handle_Multiple_Inheritance_1, Handle_Multiple_Inheritance_2 {

	public void Handle_Multiple_Inheritance_2() {
		// use super keyword to call the Handle_Multiple_Inheritance_2
		// method of Handle_Multiple_Inheritance_1 interface
		Handle_Multiple_Inheritance_1.super.Handle_Multiple_Inheritance_2();
		// use super keyword to call the Handle_Multiple_Inheritance_2
		// method of Handle_Multiple_Inheritance_2 interface
		Handle_Multiple_Inheritance_2.super.Handle_Multiple_Inheritance_2();
		// System.out.println("Handle Multiple inheritance using default
		// method");
	}

	public static void main(String[] args) {
		Handle_Multiple_Inhertance hmi = new Handle_Multiple_Inhertance();
		hmi.Handle_Multiple_Inheritance_2();

	}

}
