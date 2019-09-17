package inheritance;

//Parent class
public class Fruit {

	public void fruit() {
		System.out.println("Super class constructor");
		System.out.println("Super class object hashcode :" + this.hashCode());
		System.out.println(this.getClass().getName());
	}

}
