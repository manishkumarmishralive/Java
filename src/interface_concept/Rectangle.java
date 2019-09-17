package interface_concept;

public class Rectangle implements Drawable {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.draw();
		Circle c = new Circle();
		c.draw();

	}

	public void draw() {
		System.out.println("Drawing rectangle");

	}

}
