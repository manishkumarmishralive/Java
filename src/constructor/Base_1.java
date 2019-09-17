package constructor;

class Base_1 {
	String name;

	// constructor 1
	Base_1() {
		this("");
		System.out.println("No-argument constructor of" + " base class");
	}

	// constructor 2
	Base_1(String name) {
		this.name = name;
		System.out.println("Calling parameterized constructor" + " of base");
	}
}
