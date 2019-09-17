package methodOverriding;

//Inherited class
public class Derived extends Base {
	// This method overrides show() of Parent
	@Override
	public void show() {
		super.show();
		System.out.println("child's show() called");
	}

	public static void main(String[] args) {
		// Base obj = new Base();
		Base obj1 = new Derived();

		obj1.show();
	}

}
