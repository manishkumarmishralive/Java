package stringConcept;

public class StringBufferConcept {

	public static void main(String[] args) {

		// 1. Length and capacity:
		// The length of a StringBuffer can be found by the length( ) method,
		// while the total allocated capacity can be found by the capacity( )
		// method.

		StringBuffer sb = new StringBuffer("geekforgeeks");
		int p = sb.length();
		System.out.println("Length of the String geekforgeeks :" + p);

		int cap = sb.capacity();
		System.out.println("Capacity of the string geekforgeeks :" + cap);

		// 2.append( ): It is used to add text at the end of the existence text.
		// Here are a few of its forms:

		StringBuffer sb1 = new StringBuffer("geekfor");
		sb1.append("geeks");
		System.out.println(sb1);
		sb1.append(1);

		System.out.println(sb1);
		sb1.append("-Maneesh");
		System.out.println(sb1);
		sb1.append("-cse123");
		System.out.println(sb1);

		// 3. insert( ): It is used to insert text at the specified index
		// position. These are a few of its forms:

		StringBuffer sb2 = new StringBuffer("Geekgeeks");

		sb2.insert(4, "for");
		System.out.println("New String :" + sb2);

		sb2.insert(5, 5);
		System.out.println("New String1: " + sb2);

		char geeks_arr[] = { 'm', 'a', 'n', 'i', 's', 'h' };

		sb1.insert(5, geeks_arr);
		sb2.insert(3, geeks_arr);
		System.out.println("new char set: " + sb1);
		System.out.println("New char set1: " + sb2);

		// 4.reverse( ): It can reverse the characters within a StringBuffer
		// object using reverse( ).
		// This method returns the reversed object on which it was called.
		StringBuffer sb3 = new StringBuffer("Geekforgeeks");
		sb3.reverse();
		System.out.println("Reverse String : " + sb3);

		// 5. delete( ) and deleteCharAt( ):It will return i to i-1 String
		StringBuffer sb4 = new StringBuffer("Selenium");
		sb4.delete(4, 6);
		System.out.println("Left String :" + sb4);
		// It will count from 0.
		StringBuffer sb5 = new StringBuffer("Selenium");
		sb5.deleteCharAt(3);
		System.out.println("Left String is :" + sb5);

		// 6. replace( ): It can replace one set of characters with another set
		// inside a StringBuffer object by calling replace( ).
		// It will replace within i to i-1.

		StringBuffer sb6 = new StringBuffer("Geekforgeeks");
		sb6.replace(4, 7, "are");
		System.out.println("New String : " + sb6);

	}

}
