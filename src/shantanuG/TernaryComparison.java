package shantanuG;

import java.util.Scanner;

public class TernaryComparison {
	int compare(int num1,int num2)
	{
		return num1>num2?num1:num2;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		
		TernaryComparison ternaryComparison=new TernaryComparison();
		System.out.println("Greater number is: "+ternaryComparison.compare(num1,num2));
		
	}

}
