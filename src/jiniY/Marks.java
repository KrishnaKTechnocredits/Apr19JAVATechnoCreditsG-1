package jiniY;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your marks to get your result grades:");// get
																					// user
																					// input
		int num = sc.nextInt();

		new Marks().marks(num);// send input in method
	}

	static void marks(int num) {
		if ((num > 0) && (num < 50))// check input value in condition
		{
			System.out.println("You result is : FAILED");
		}

		else if ((num >= 50) && (num < 75))// check input value in else if
											// condition if previous condition
											// gets false
		{
			System.out.println("Your result is : First Class");
		} else if ((num >= 75) && (num < 100))// check input value in else if
												// condition if previous
												// condition gets false
		{
			System.out.println("Your result is : Distinction");
		}
	}
}
