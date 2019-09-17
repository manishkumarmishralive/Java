package methodoverloading;

public class Show {

	public void show(int x) {
		System.out.println("an int :" + x);

	}

	public void show(String x) {
		System.out.println("a double :" + x);
	}

	public void show(byte b) {
		System.out.println(" byte b :" + b);
	}

	public static void main(String[] args) {
		byte a = 5;
		Show show = new Show();
		show.show(a);
		show.show(8);
		show.show("a");
		show.show('a');// Since char is
		// not available, so the datatype
		// higher than char in terms of
		// range is int.
		// show.show(2.5);// since float datatype
		// is not available and so it's higher
		// datatype, so at this step their
		// will be an error.
	}

}
