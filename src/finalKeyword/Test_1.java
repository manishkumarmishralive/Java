package finalKeyword;

public class Test_1 {
	// final variable
	final int id = 23567;
	// blank final variable
	final int ide;
	// static final variable
	static final double capacity = 10.23;
	// static blank final variable
	static final double size;

	// blank final variable
	final int PI;

	// instance initializer block for
	// initializing ide
	{
		ide = 123;
	}
	// static initializer block for
	// initializing size
	static {
		size = 3;
	}

	// constructor for initializing PI
	// Note that if there are more than one
	// constructor, you must initialize size
	// in them also
	public Test_1() {
		PI = 3;
	}
}
