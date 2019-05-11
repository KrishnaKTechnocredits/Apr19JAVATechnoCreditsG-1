package sushantD;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {

		int roll_Num, marks;
		String name;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Name");
		name = sc.nextLine();
		

		System.out.println("Enter your Roll Number");
		roll_Num = sc.nextInt();
		

		System.out.println("Enter your Marks");
		marks = sc.nextInt();
		
		System.out.println(" Name you enter is:" + name);
		System.out.println(" Roll number  you enter is:" + roll_Num);
		System.out.println(" Marks you enter is:" + marks);

	}

}
