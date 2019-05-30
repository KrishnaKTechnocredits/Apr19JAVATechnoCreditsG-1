package swapanaW;

// TestEmployee class to test Employee class functionality.

public class TestEmployee extends Employee {

	TestEmployee(int empId, String empName, double salary) {
		super(empId, empName, salary);
	}

	public static void main(String[] args) {
		Employee emp = new Employee(101, "Swapna", 40000);
		emp.display();
	}
}
