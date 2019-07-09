package shantanuG;

import java.util.Scanner;

public class Fibonacci {
	void printFibonacci(int len)
	{
		int num1=0;
		int num2=1;
		int temp=0;
		//System.out.print(num1+" "+num2);
		for(int i=1;i<=len;i++)
		{
			System.out.print(num1+" ");
			temp=num1+num2;
			num1=num2;
			num2=temp;
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of the fibonacci series");
		int len=sc.nextInt();
		
		Fibonacci fibonacci=new Fibonacci();
		fibonacci.printFibonacci(len);
	}
}
