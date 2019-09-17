package inheritance;
//Java program to illustrate the  

//concept of Multilevel inheritance

public class Three extends Two {

	public void print_Geeks() {
		System.out.println("geeks");
	}

	public static void main(String[] args) {
		Three t = new Three();
		t.print_Geek();
		t.print_for();
		t.print_Geeks();

	}
}
