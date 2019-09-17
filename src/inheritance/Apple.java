package inheritance;

//sub class
//when subclass object is created, 
//a separate object of super class object will not be created. 
//Only a subclass object object is created that has super class variables.

public class Apple extends Fruit {

	public void apple() {
		System.out.println("*************Subclass constructor invoked*****************");
		System.out.println("Subclass object hashcode :" + this.hashCode());

		System.out.println(this.hashCode() + "   " + super.hashCode());

		System.out.println(this.getClass().getName() + "  " + super.getClass().getName());
	}

	public static void main(String[] args) {

		Apple a = new Apple();
		a.fruit();
		a.apple();
	}

}
