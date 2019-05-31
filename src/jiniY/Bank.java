package jiniY;

/*Create Bank class with fields account_no, name and amount .Create the following methods: Make it menu Driven Program using switch.
Use Scanner class for taking inputs from User
a) insertData()… [To save account_no, name and amount given by user].
b) deposit()
c) withdraw()
d) checkBalance()
e) displayDetails()
Create BankClient class to test functionalities of Bank class.*/

import java.util.Scanner;

public class Bank {
	private static double total;
	private static double withdraw = 0;
	private static double deposit = 0;

	public static String insertData(String name, String account_number, double amount) {

		System.out.println(" Bank Accoutant Name is" + " " + name);
		System.out.println(" Account Number" + " " + account_number);
		System.out.println(" Amount" + " " + amount);
		return name + " " + account_number + "  " + amount;
	}

	public static double deposit(double amount, Scanner sc) {

		System.out.println("Enter amount you want to deposit");
		deposit = sc.nextDouble();
		total = amount + deposit;
		System.out.println("Total balance in bank is :" + " " + total);
		return total;
	}

	public static double withdraw(double amount, Scanner sc) {

		System.out.println("Enter amount you want to withdraw:");
		withdraw = sc.nextInt();
		total = amount + withdraw;
		System.out.println("Total balance in bank is :" + " " + total);
		return withdraw;

	}

	public static double checkBalance(double amount) {

		total = amount + deposit - withdraw;
		System.out.println("Balance in bank account is:" + total);
		return total;

	}

	public static String checkDetails(String name, String account_number, double amount) {

		System.out.println("Bank accountant_name" + name);
		System.out.println("Bank Number:" + account_number);
		System.out.println("Amount" + amount);
		System.out.println("Deposit" + deposit);
		System.out.println("Withdraw" + withdraw);
		System.out.println("Total balance " + total);
		return name;
	}

}
