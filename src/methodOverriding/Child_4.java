package methodOverriding;

public class Child_4 extends Parent_3 {

	// @Override
	public static void show() {
		System.out.println("Child_4 method ");
	}

	public static void main(String[] args) {
		Parent_3 obj = new Parent_3();
		// As per method overriding rule child method should be called since
		// static method cannot be overridden, it's called
		// parent method
		obj.show();
	}

}
