package stringConcept;

public class LengthConcept {

	public static void main(String[] args) {
		// 1.To find length of the String: Returns the number of characters in
		// the String.
		String s = "Selenium";
		int length = s.length();
		System.out.println("Length of String s is :" + length);
		// or
		System.out.println("Length of the String s is :" + s.length());

		String s1 = "geekforgeeks";
		System.out.println("Lenght of s1: " + s1.length());
		// Counting is started from one and space is also count:
		String s2 = "My name is Maneesh Mishra";
		System.out.println("Length of the String s2 :" + s2.length());

	}

}
