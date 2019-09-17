package interface_concept;

public interface Parent {
	final int id = 10;

	// An example to show that interfaces can
	// have methods from JDK 1.8 onwards
	default void show() {
		System.out.println("Show method called");
	}
}
