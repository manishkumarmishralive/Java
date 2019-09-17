package keywordsInJava;

public class Student_1 {
	String name;
	int rollNumber;
	static String collegeName;

	static int counter = 0;

	Student_1(String name) {
		this.name = name;
		this.rollNumber = setRollNumber();
	}

	static int setRollNumber() {
		counter++;
		return counter;

	}

	static void setcollegeName(String clgName) {
		collegeName = clgName;
	}

	void printStudentInfo() {
		System.out.println("name: " + this.name);
		System.out.println("Roll Number:" + this.rollNumber);
		System.out.println("College Name:" + collegeName);
	}

	public static void main(String[] args) {
		Student_1.setcollegeName("VGI");

		Student_1 s1 = new Student_1("Pankaj");
		Student_1 s2 = new Student_1("Mahesh");
		System.out.println("===================Student-1 detailed information==============");
		s1.printStudentInfo();
		System.out.println("===================Student-2 detailed information==============");
		s2.printStudentInfo();

	}

}
