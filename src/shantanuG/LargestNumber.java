package shantanuG;

import java.util.Scanner;

public class LargestNumber {
	void findLargest(int num1, int num2, int num3)
	{
		if(num1>num2 && num1>num3)
			System.out.println(num1+" is largest.");
		else if(num2>num1 && num2>num3)
			System.out.println(num2+" is largest.");
		else if(num3>num1 && num3>num2)
			System.out.println(num3+" is largest.");
		else
			System.out.println("The numbers are not distinct.");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		System.out.println("Enter third number");
		int num3=sc.nextInt();
		
		LargestNumber largestNumber=new LargestNumber();
		largestNumber.findLargest(num1,num2,num3);
	}

}
