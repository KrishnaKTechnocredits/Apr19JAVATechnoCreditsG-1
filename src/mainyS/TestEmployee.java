package mainyS;

import java.util.Scanner;

//WAP to call the employee class
public class TestEmployee extends Employee {

	TestEmployee(int id1, String name1, float sal1) {
		super(id1, name1, sal1);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter empName");
		String empName = sc.nextLine();
		System.out.println("Please enter salary");
		float salary = sc.nextFloat();
		System.out.println("Please enter empId");
		int empId = sc.nextInt();

		TestEmployee emp = new TestEmployee(empId, empName, salary);
		emp.display();
		sc.close();
	}
}
