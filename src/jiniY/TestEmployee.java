package jiniY;

import java.util.Scanner;

public class TestEmployee {
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee_id:");
		int employee_id = sc.nextInt();
		System.out.println("Enter Employee_name:");
		String employee_name= sc.next();
		System.out.println("Enter Salary of Employee:");
		int salary = sc.nextInt();
		
		
		Employee employee = new Employee(employee_id,employee_name,salary);//for parameterized constructor
		employee.display();//call method
	}

}