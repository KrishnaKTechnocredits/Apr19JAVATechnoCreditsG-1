package swapanaW;

//Create Employee class and parameterized constructor with attributes empId , empName and salary. 
//Write a method to display the details of employees. 

public class Employee {

	int empId;
	String empName;
	double salary;

	Employee(int eId, String eName, double sal) {
		empId = eId;
		empName = eName;
		salary = sal;
	}

	void display() {
		System.out.println("Employee Id : " + empId);
		System.out.println("Employee Name : " + empName);
		System.out.println("Employee Salary : " + salary);
	}
}