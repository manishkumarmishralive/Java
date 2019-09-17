package superKeywordInJava;

public class Child extends Parent {
	Child() {
		super();
		System.out.println("thois is child class constructor");
	}

	void display() {
		System.out.println("this is dispaly() method");
	}

	public static void main(String[] args) {
		Child ch = new Child();
		ch.display();
	}

}
