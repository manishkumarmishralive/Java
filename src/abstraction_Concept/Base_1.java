package abstraction_Concept;

//An abstract class with constructor
abstract class Base_1 {
	// 2) Like C++, an abstract class can contain constructors in Java. And a
	// constructor of abstract class is called
	// when an instance of a inherited class is created. For example, the
	// following is a valid Java program
	Base_1() {
		System.out.println("Base constructor called");
	}

	abstract void fun();

	void ConcreteMethod() {
		System.out.println("Concrete method of Base Class called");
	}

}
