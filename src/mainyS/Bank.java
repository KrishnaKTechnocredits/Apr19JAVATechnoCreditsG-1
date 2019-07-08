package mainyS;

import java.util.Scanner;

//WAP to give Bank info of users
public class Bank {
	static String account_no = "";
	static String name = "";
	static float amount = 0;
	static String str = "";
	static boolean str1 = false;

	void bank() {
		Scanner sc = new Scanner(System.in);
		switch (str) {
		case "insertData":
			System.out.println("Please enter user account number");
			account_no = sc.nextLine();
			System.out.println("Please enter user name");
			name = sc.nextLine();
			System.out.println("Please enter the amount");
			amount = sc.nextFloat();
			System.out.println("Information added sucessfully");
			break;

		case "deposite":
			System.out.println("Please enter the amount you want to deposite");
			float num = sc.nextFloat();
			amount = amount + num;
			System.out.println(num + " is deposite successfully");
			break;

		case "withdraw":
			System.out.println("Please enter amount you want to withdraw");
			float num1 = sc.nextFloat();
			amount = amount - num1;
			System.out.println(num1 + " is withdraw successfully");
			break;

		case "checkBalance":
			System.out.println("Your account balance is : " + amount);
			break;

		case "displayDetails":
			System.out.println("Account Number : " + account_no + "Name : " + name + "Amount :" + amount + "/-");
			break;
		}
	}
}
