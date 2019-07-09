package shantanuG;

import java.util.Scanner;

public class Bank {
	
	int accountNo;
	String name;
	static float amount;
	
	void insertData(int accountNo,String name,float amount)
	{
		this.accountNo=accountNo;
		this.name=name;
		this.amount=amount;
	}
	
	void deposit(float amount)
	{
		this.amount=this.amount+amount;
	}
	
	void withdraw(float amount)
	{
		if(this.amount<amount)
			System.out.println("Insufficient balance");
		else
			this.amount=this.amount-amount;
	}
	
	void checkBalance()
	{
		System.out.println("Available balance is:"+this.amount);
	}
	
	void displayDetails()
	{
		System.out.println("Account number is:"+this.accountNo);
		System.out.println("Name of account holder is:"+this.name);
		System.out.println("Available balance is:"+this.amount);
	}
	
}