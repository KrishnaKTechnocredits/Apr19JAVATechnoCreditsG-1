package mainyS;

import java.util.Scanner;

//WAP to call the Bank class methiod
public class ClientBank extends Bank {
	public static void main(String[] args) {
		boolean flag = false;
		do {
			System.out.println("1. insertData" + "\n" + "2. deposite" + "\n" + "3. withdrawal" + "\n"
					+ "4. checkBalance" + "\n" + "4. displayDetails");
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the opertaion you want to perform");
			str = sc.nextLine();
			System.out.println("Please enter user account number");
			account_no = sc.nextLine();
			System.out.println("Please enter user name");
			name = sc.nextLine();
			System.out.println("Please enter the amount");
			amount = sc.nextFloat();
			System.out.println("Information added sucessfully");
		} while (flag);
		{

		}

		Bank bk = new Bank();
		bk.bank();
	}
}
