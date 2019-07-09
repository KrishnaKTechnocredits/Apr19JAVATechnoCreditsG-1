package jiniY;

public class Employee {

	
	int employee_id;
	String employee_name;
	int salary;
	Employee(int employee_id,String employee_name,int salary)//constructor 
	{
		this.employee_id=employee_id;//when both name are same this keyword is used
		this.employee_name=employee_name;//when both name are same this keyword is used
		this.salary= salary;//when both name are same this keyword is used
		
		
	}
	
	void display()
	{
		System.out.println("Employee id is:" +" "+employee_id);
		System.out.println("Employee name is :" +" " +employee_name);
		System.out.println("Employee salary is:"+" "+salary);
	}
}