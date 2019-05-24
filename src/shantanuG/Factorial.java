package shantanuG;

import java.util.Scanner;

public class Factorial {
	void findFactorial(int n)
	{
		int fact=1;
		for(int i=n;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+n+" is: "+fact);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		
		Factorial factorial=new Factorial();
		factorial.findFactorial(num);
	}

}
