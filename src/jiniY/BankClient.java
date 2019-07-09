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

public class BankClient extends Bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Bank Accoutant Name");
		String name = sc.next();

		System.out.println("Enter Account Number");
		String account_number = sc.next();

		System.out.println("Enter amount");
		double amount = sc.nextDouble();

		BankClient client = new BankClient();
		System.out.println("Enter your choice:" + " " + "1.InsertData" + " " + "2.Deposit" + " " + "3.Withdraw" + " "
				+ "4.CheckBalance" + " " + "5.CheckDetails" + " " + "6.Exit");
		int ch = sc.nextInt();

		switch (ch) {
		case 1:
			client.insertData(name, account_number, amount);
			break;

		case 2:
			client.deposit(amount, sc);
			break;
		case 3:
			client.withdraw(amount, sc);
			break;
		case 4:
			client.checkBalance(amount);
			break;
		case 5:
			client.checkDetails(name, account_number, amount);
			break;
		case 6:
			System.exit(0);
			break;

		}

	}
}

