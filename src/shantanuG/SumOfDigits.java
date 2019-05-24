package shantanuG;

import java.util.Scanner;

public class SumOfDigits {
	void findSum(int n)
	{
		int temp=0;
		while(n!=0)
		{
			temp=temp+n%10;
			n=n/10;
		}
		System.out.println(temp);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		SumOfDigits sumOfDigits=new SumOfDigits();
		sumOfDigits.findSum(num);
	}

}
