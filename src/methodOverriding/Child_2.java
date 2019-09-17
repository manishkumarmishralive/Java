package methodOverriding;

public class Child_2 extends Parent_1 {
	// new m1() method
	// unique to Child class
	private void m1() {
		System.out.println("from child_2 m1()");
	}

	// overriding method
	// with more accessibility
	@Override
	public void m2() {
		System.out.println("from child_2 m2() ");
	}

	public static void main(String[] args) {
		Parent_1 obj1 = new Parent_1();
		obj1.m2();
		// If a Parent type reference refers
		// to a Child object Child's show()
		// is called. This is called RUN TIME
		// POLYMORPHISM.
		Parent_1 obj2 = new Child_2();
		obj2.m2();

	}

}
