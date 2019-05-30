package shantanuG;

public class Employee {

	int empId;
	String empName;
	float empSal;
	Employee(int empID,String empName,float empSal)
	{
		this.empId=empID;
		this.empName=empName;
		this.empSal=empSal;
	}
	
	void display()
	{
		System.out.println("Employee ID is:"+empId);
		System.out.println("Employee name is:"+empName);
		System.out.println("Employee salary is:"+empSal);
	}
}
