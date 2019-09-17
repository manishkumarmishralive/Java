package interface_concept;

public class Cube implements Drawable_1 {

	public static void main(String[] args) {
		int cube = Drawable_1.cube(5);
		System.out.println(cube);
		Cube c = new Cube();
		c.draw();
	}

	public void draw() {
		System.out.println("Cube draw");

	}

}
