package poonamS;

import java.util.Scanner;

public class Q2 {

	//WAP to print the details of Student As Roll No, Name and Marks by taking input from the user
	
	public static void main(String[] args) {
		
		int rollnum;
		String name;
		float marks;
		
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter Roll Number");
		rollnum= s2.nextInt();
		
		System.out.println("Enter Name");
		name= s2.nextLine();
		
		System.out.println("Enter Marks");
		marks = s2.nextFloat();
		
		System.out.println("Student with Roll Number = "+rollnum + " And Name = " + name + " has scored " + marks );
	}
	
}
