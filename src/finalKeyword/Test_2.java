package finalKeyword;

public class Test_2 {

	public static void main(String[] args) {
		// a final reference variable sb
		final StringBuffer sb = new StringBuffer("geeek");

		System.out.println(sb);
		// changing internal state of object
		// reference by final reference variable sb
		sb.append("forgeeks");

		System.out.println(sb);
	}

}
