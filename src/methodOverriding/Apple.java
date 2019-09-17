package methodOverriding;

public class Apple extends Fruit {
	@Override
	public void sweet() {
		System.out.println("more sweet method called");
	}

	public static void main(String[] args) {
		// Fruit f = new Fruit();
		Fruit f1 = new Apple();
		f1.sweet();
		// f.sweet();
	}

}
