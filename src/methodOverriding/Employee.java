package methodOverriding;

public class Employee {
	public static int base = 10000;

	int salary() {
		return base;

	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println("Employee basic salary: " + emp.salary());
		Employee emp1 = new Manager();
		System.out.println("Manager Salary :" + emp1.salary());
		Employee emp2 = new Clerk();
		System.out.println("Clerk salary: " + emp2.salary());
	}

}