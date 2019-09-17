package methodoverloading;

public class OveloadingByReturnType {
	public int foo() {
		return 10;

	}

	// compiler error: foo() is already defined
	// public char foo(){
	// return 'c';
	// }
	public static void main(String[] args) {

	}

}
