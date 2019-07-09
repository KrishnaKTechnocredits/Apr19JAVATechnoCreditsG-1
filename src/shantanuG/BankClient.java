package shantanuG;

import java.util.Scanner;

public class BankClient {
	public static void main(String args[])
	{
		Bank bank=new Bank();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter account number");
		int accountNo=sc.nextInt();
		System.out.println("Enter name of account holder");
		String name=sc.next();
		System.out.println("Enter initial account balance");
		float amount=sc.nextFloat();
		bank.insertData(accountNo, name, amount);
		int ch=1;
		
		
		while(ch==1)
		{
			System.out.println("OPERATIONS");
			System.out.println("1. Deposit amount");
			System.out.println("2. Withdraw amount");
			System.out.println("3. Check Balance");
			System.out.println("4. Display details");
			System.out.println("Select your choice");
			int opt=sc.nextInt();
			switch(opt)
			{
			 case 1:
			 		System.out.println("Enter deposit amount");
				 	float depositAmount=sc.nextFloat();
				 	bank.deposit(depositAmount);
				 	break;
				 	
			 case 2:
				 	System.out.println("Enter withdrawal amount");
				 	float withdrawAmount=sc.nextFloat();
				 	bank.withdraw(withdrawAmount);
				 	break;
				 	
			 case 3:
				 	bank.checkBalance();
				 	break;
			
			 case 4:
				 	bank.displayDetails();
				 	break;
			
			default:
					System.out.println("Enter valid option");
					break;
				 	
			}
			System.out.println("Do you want to continue (1 for YES/0 for NO)?");
			ch=sc.nextInt();
			if(ch!=1)
				System.exit(0);
		}
		
		
	}

}
