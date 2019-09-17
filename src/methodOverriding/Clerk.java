package methodOverriding;

public class Clerk extends Employee {
	int salary() {
		return base + 10000;
	}
}
