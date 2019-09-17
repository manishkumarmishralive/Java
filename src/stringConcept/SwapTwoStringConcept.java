package stringConcept;

//Java program to swap two strings without using a temporary 
//variable.
public class SwapTwoStringConcept {

	public static void main(String[] args) {
		// Declare two strings
		String a = "Hellow";
		String b = "World";
		System.out.println("Initial length of a :" + a.length());

		// Print String before swapping
		System.out.println("String before swap \na: " + a + "\nb: " + b);
		// append 2nd string to 1st
		a = a + b;
		System.out.println("Now a :" + a);
		System.out.println("now lenght of a is :" + a.length());
		System.out.println("Initialy length of b is: " + b.length());

		// store initial string a in string b
		b = a.substring(0, a.length() - b.length());
		System.out.println("Now value of b is : " + b);
		// store initial string b in string a
		System.out.println("now length of b: " + b.length());
		// a = a.substring(b.length());
		System.out.println(a.substring(6));
		System.out.println("now Value of a is :" + a);
		System.out.println("String after swap \na: " + a + "\nb: " + b);

	}

}
