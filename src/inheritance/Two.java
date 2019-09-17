package inheritance;
//Java program to illustrate the  

//concept of single inheritance 

public class Two extends One {

	public void print_for() {
		System.out.println("for");
	}

	public static void main(String[] args) {
		Two t = new Two();
		t.print_Geek();
		t.print_for();
		t.print_Geek();

	}
}
