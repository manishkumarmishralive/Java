package funstionsInJava;

public class Test_2 {
	int i, j;
	static int temp;

	public static void swap(Integer i, Integer j) {
		Integer temp = new Integer(i);
		i = j;
		j = temp;

	}

	public static void main(String[] args) {
		Integer i = new Integer(20);
		Integer j = new Integer(30);
		swap(i, j);
		System.out.println("after swap: " + i + " \nAfter swaping j :" + j);

	}

}
