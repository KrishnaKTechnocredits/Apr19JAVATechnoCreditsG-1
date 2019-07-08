package mainyS;

//WAP tp create employee class and parameterized constructor with attributes empID,empName and salary........
public class Employee {
	int id;
	String name;
	float sal;

	Employee(int id1, String name1, float sal1) {
		id = id1;
		name = name1;
		sal = sal1;
	}

	void display() {
		System.out.println("Employee Id is : " + id + "\n" + "Employee Name : " + name + "\n" + "Salary is: " + sal);
	}
}
