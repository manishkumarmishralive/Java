package constructor;

public class Default_Constructor {
	int num;
	String name;

	// this would be invoked while an object
	// of that class is created.
	Default_Constructor() {
		System.out.println("Constructor called");
	}

	public static void main(String[] args) {
		// this would invoke default constructor.
		Default_Constructor d = new Default_Constructor();
		// d.default_Constructor();
		// Default constructor provides the default
		// values to the object like 0, null
		System.out.println(d.name);
		System.out.println(d.num);
	}

}
