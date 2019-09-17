package inheritance;
//constructor of base class with no argument gets automatically called in derived class constructor.

public class Derived extends Base {

	Derived() {
		System.out.println("Derived class constructor called");
	}

	public static void main(String[] args) {

		Derived d = new Derived();

	}

}
