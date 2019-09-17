package methodOverriding;

//Inherited class
public class Child extends Parent {
	// This method overrides show() of Parent
	@Override
	void show() {
		System.out.println("Child show()'s ");
	}

	public static void main(String[] args) {
		// If a Parent type reference refers
		// to a Parent object, then Parent's
		// show is called
		Parent obj = new Parent();
		obj.show();
		// If a Parent type reference refers
		// to a Child object Child's show()
		// is called. This is called RUN TIME
		// POLYMORPHISM.
		Parent obj1 = new Child();
		obj1.show();

	}

}
