package swapanaW;

import java.util.Scanner;

/*Create a class called Employee, having 3 fields Employee Name, DeptId and Salary (input using scanner). 
* Create 3 parameterized constructor for same.Take data for 2 employees and 
* write a method which takes 2 arguments (instance of both employees) and print all the details of employee having max salary.
*/
public class EmployeeScanner {

	String empName;
	int deptId;
	double salary;

	EmployeeScanner(String empName, int deptId, double salary) {
		this.empName = empName;
		this.deptId = deptId;
		this.salary = salary;
	}

	static void compareEmpSalary(EmployeeScanner e1, EmployeeScanner e2) {
		{
			if (e1.salary > e2.salary) {
				System.out.println("----------------------------------------------");
				System.out.println("Highest Salary is of Employee 1: " + e1.empName);
				System.out.println("Department of employee is: " + e1.deptId);
				System.out.println("Salary of employee is: " + e1.salary);
				System.out.println("----------------------------------------------");
			}

			else {
				System.out.println("----------------------------------------------");
				System.out.println("Highest Salary is of Employee 2: " + e2.empName);
				System.out.println("Department of employee is: " + e2.deptId);
				System.out.println("Salary of employee is: " + e2.salary);
				System.out.println("----------------------------------------------");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter details for first Employee: ");
		System.out.println("Enter Employee1 name: ");
		String empName1 = sc.next();
		System.out.println("Enter Employee1 Dept Id: ");
		int deptId1 = sc.nextInt();
		System.out.println("Enter Employee1 Salary: ");
		double salary1 = sc.nextDouble();

		System.out.println("Enter details for second Employee");
		System.out.println("Enter Employee2 name: ");
		String empName2 = sc.next();
		System.out.println("Enter Employee2 Dept Id: ");
		int deptId2 = sc.nextInt();
		System.out.println("Enter Employee2 Salary: ");
		double salary2 = sc.nextDouble();

		EmployeeScanner e1 = new EmployeeScanner(empName1, deptId1, salary1);
		EmployeeScanner e2 = new EmployeeScanner(empName2, deptId2, salary2);
		compareEmpSalary(e1, e2);

	}
}