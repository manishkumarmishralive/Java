package inheritance;

// if we want to call parameterized constructor of base class, then we can call it using super(). 
//The point to note is base class constructor call must be the first line in derived class constructor. 
//For example, in the following program, super(_x) is first line derived class constructor.

public class Derived_1 extends Base_1 {
	int y;

	Derived_1(int _x, int _y) {
		super(_x);
		y = _y;
	}

	public void dispaly() {
		System.out.println("Value of x is:" + x + "\nValue of y is :" + y);
	}

	public static void main(String[] args) {
		Derived_1 d = new Derived_1(10, 15);
		d.dispaly();

	}

}
