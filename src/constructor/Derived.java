package constructor;
//Note : Similar to constructor chaining in same class, 

//super() should be the first line of the constructor as super class’s 
//constructor are invoked before the sub class’s constructor.

class Derived extends Base_1 {
	// constructor 3
	Derived() {
		System.out.println("No-argument constructor " + "of derived");
	}

	// parameterized constructor 4
	Derived(String name) {
		// invokes base class constructor 2
		super(name);
		System.out.println("Calling parameterized " + "constructor of derived");
	}

	public static void main(String args[]) {
		// calls parameterized constructor 4
		Derived obj = new Derived("test");

		// Calls No-argument constructor
		// Derived obj = new Derived();
	}
}
