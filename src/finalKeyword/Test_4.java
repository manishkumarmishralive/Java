package finalKeyword;

public class Test_4 {

	static final int id = 4;

	Test_4() {
		// id = 5;
	}

	static {
		// id=5;
	}

	public static void main(String[] args) {
		// re-assigning final variable
		// will throw compile-time error
		// id = 5;
	}

}
