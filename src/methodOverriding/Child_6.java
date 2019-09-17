package methodOverriding;

public class Child_6 extends Parent_5 {

	void show() {
		super.show();
		System.out.println("child show()");
	}

	public static void main(String[] args) {
		// Parent_5 obj1 = new Parent_5();
		// obj1.show();

		Parent_5 obj2 = new Child_6();
		obj2.show();
	}

}
