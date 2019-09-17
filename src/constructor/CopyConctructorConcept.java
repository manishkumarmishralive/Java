package constructor;

public class CopyConctructorConcept {
	int re;
	int me;

	// A normal parameterized constructor
	CopyConctructorConcept(int re, int me) {
		this.re = re;
		this.me = me;
	}

	// copy constructor
	CopyConctructorConcept(CopyConctructorConcept c) {
		System.out.println("Copy constructor called");
		re = c.re;
		me = c.me;

	}

	// Overriding the toString of Object class
	@Override
	public String toString() {
		return ("re:" + re + "  \nme:" + me);

	}

	public static void main(String[] args) {
		CopyConctructorConcept c1 = new CopyConctructorConcept(10, 15);
		// Following involves a copy constructor call
		CopyConctructorConcept c2 = new CopyConctructorConcept(c1);
		// Note that following doesn't involve a copy constructor call as
		// non-primitive variables are just references.
		CopyConctructorConcept c3 = c2;
		// toString() of c2 is called here
		System.out.println(c2);
	}

}
