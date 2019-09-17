package abstraction_Concept;

public class Rectangle extends Drawable {
	void draw() {
		System.out.println("Draw rectangle");
	}

	public static void main(String[] args) {
		Drawable d = new Rectangle();
		d.draw();
		Drawable c = new Circle();
		c.draw();
	}

}
