package methodOverriding;

public class Child_5 extends Parent_4 {
	// This method hides m1() in Parent
	public static void m1() {
		System.out.println("from child m1() static method ");
	}

	// This method overrides m2() in Parent
	@Override
	public void m2() {
		System.out.println("from child m2() non static method");
	}

	public static void main(String[] args) {
		Parent_4 obj = new Parent_4();
		// As per overriding rules this
		// should call to class Child static
		// overridden method. Since static
		// method can not be overridden, it
		// calls Parent's m1()
		obj.m1();
		Parent_4 obj2 = new Child_5();
		// Here overriding works
		// and Child's m2() is called
		obj2.m2();
	}

}
