package thisKeywordInJava;

class A {
	B obj;

	// Parameterized constructor with object of B
	// as a parameter
	A(B obj) {
		this.obj = obj;

		// calling display method of class B
		obj.display();
	}

}
