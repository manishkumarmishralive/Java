package keywordsInJava;

public class Student {
	int rollno;
	String name;

	// Static variable
	static String collegeName;
	// static counter to set unique roll no
	static int counter = 0;

	Student(String name) {
		this.name = name;
		this.rollno = setRollNo();

	}

	// getting unique rollNo
	// through static variable(counter)
	static int setRollNo() {
		counter++;
		return counter;

	}

	static void setCllgName(String name) {
		collegeName = name;
	}

	void getStudentInfo() {
		System.out.println("name: " + this.name);
		System.out.println("rollNo: " + this.rollno);
		System.out.println("college Name: " + collegeName);

	}

	public static void main(String[] args) {
		Student.setCllgName("VGI");
		Student s1 = new Student("Bob");
		Student s2 = new Student("Rajesh");
		s1.getStudentInfo();
		s2.getStudentInfo();
	}

}
