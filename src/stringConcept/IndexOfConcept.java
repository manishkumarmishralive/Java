package stringConcept;

public class IndexOfConcept {

	public static void main(String[] args) {
		String s1 = "Learn Share Learn";

		// 1.Returns the index within the string of the first occurrence of the
		// specified string.
		System.out.println("count is : " + s1.indexOf("Share"));
		// 2.Returns the index within the string of the first occurrence of the
		// specified string, starting at the specified index.
		System.out.println("count is :" + s1.indexOf("ea"));
		System.out.println(s1.indexOf("ea", 3));

		// 3.Returns the index within the string of the last occurrence of the
		// specified string.
		System.out.println(s1.lastIndexOf("a"));

		// 4. Compares this string to the specified object.

		String s2 = "Selenium";
		String s3 = "selenium";

		boolean b = s2.equals(s3);
		System.out.println(b);

		// 5. Compares string to another string, ignoring case considerations.
		boolean b1 = s2.equalsIgnoreCase(s3);
		System.out.println(b1);

		// 6.Converts all the characters in the String to lower case.
		String s4 = s2.toLowerCase();
		System.out.println(s4);
		// 7. Converts all the characters in the String to upper case.
		System.out.println("s5: " + s3.toUpperCase());

		// 8.Returns the copy of the String, by removing whitespace a
		// t both ends. It does not affect whitespace in the middle.

		String s6 = "   Hello Java   ";

		System.out.println("Trim string :" + s6.trim());

		// 9. String replace (char oldChar, char newChar):
		// Returns new string by replacing all occurrences of old Char with
		// newChar.

		String s7 = s2.replace('e', 'm');
		System.out.println(s7);

	}

}
