package shantanuG;

import java.util.Scanner;

public class Grades {

	void findGrade(int marks)
	{
		if(marks>=0 && marks<50)
			System.out.println("Failed");
		else if(marks>=50 && marks<75)
			System.out.println("First Class");
		else if(marks>=75 && marks<=100)
			System.out.println("Distinction");
		else
			System.out.println("Please enter valid marks");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks obtained out of 100");
		int marks=sc.nextInt();
		
		Grades grades=new Grades();
		grades.findGrade(marks);
	}
}
