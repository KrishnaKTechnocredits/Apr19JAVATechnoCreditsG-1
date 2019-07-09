package jiniY;

import java.util.Scanner;

public class EmployeeC {
	String employee_name;
	String deptId;
	int salary;

	EmployeeC(String employee_name, String deptId, int salary) {
		this.employee_name = employee_name;
		this.deptId = deptId;
		this.salary = salary;
	}

	static void compareSalary(EmployeeC e1, EmployeeC e2) {

		if (e1.salary > e2.salary) {
			System.out.println("Highest Salary is of Employee 1:");
			System.out.println("Name of employee is:" + e1.employee_name);
			System.out.println("Department of employee is:" + e1.deptId);
			System.out.println("Salary of employee is:" + e1.salary);
		}

		else {
			System.out.println("Highest Salary is of Employee 2:");
			System.out.println("Name of employee is:" + e2.employee_name);
			System.out.println("Department of employee is:" + e2.deptId);
			System.out.println("Salary of employee is:" + e2.salary);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Details for Employee");
		System.out.println("Enter Employee1_name");
		String employee1_name = sc.nextLine();
		System.out.println("Enter Employee1-Department Id");
		String deptId1 = sc.nextLine();
		System.out.println("Enter Employee1_Salary");
		int salary1 = sc.nextInt();

		System.out.println("Enter Details for Employee");
		System.out.println("Enter Employee2_name");
		String employee2_name = sc.next();
		System.out.println("Enter Employee2-Department Id");
		String deptId2 = sc.next();
		System.out.println("Enter Employee2_Salary");
		int salary2 = sc.nextInt();

		EmployeeC e1 = new EmployeeC(employee1_name, deptId1, salary1);
		EmployeeC e2 = new EmployeeC(employee2_name, deptId2, salary2);
		compareSalary(e1, e2);

	}
}