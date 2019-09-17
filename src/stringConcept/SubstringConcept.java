package stringConcept;

//Return the substring from the ith  index character to end.
public class SubstringConcept {

	public static void main(String[] args) {
		// 1.Return the substring from the ith index character to end.
		// counting will be started from 0 and substring will be count including
		// given index.
		// Returns a string that is a substring of this string. The substring
		// begins with the character at the specified
		// index and extends to the end of this string.
		String s1 = "Selenium";
		String s2 = "geekforgeeks";
		String s3 = "My name is Maneesh Mishra";
		System.out.println("==========================");
		System.out.println("subSting s1: " + s1.substring(3));
		System.out.println("Substring s1: " + s1.substring(5));
		System.out.println("substring s2: " + s2.substring(5));
		System.out.println("substring s3 : " + s3.substring(11));

		// 2. Returns the substring from i to j-1 index.
		System.out.println("==========================");
		System.out.println("Substring s1: " + s1.substring(2, 5));
		System.out.println("Substring s2: " + s2.substring(3, 6));
		System.out.println("Substring s3: " + s3.substring(7, 20));

	}

}
