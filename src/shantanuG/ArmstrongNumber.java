package shantanuG;

import java.util.Scanner;

public class ArmstrongNumber {

	void isArmstrong(int n)
	{
		int no=0;
		int number=n;
		while(n!=0)
		{	
			int temp=n%10;
			no=no+temp*temp*temp;
			n=n/10;
		}
		if(no==number)
			System.out.println("Number is armstrong");
		else
			System.out.println("Number is not armstrong");
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the required number");
		int num=sc.nextInt();
		
		ArmstrongNumber armstrongNumber=new ArmstrongNumber();
		armstrongNumber.isArmstrong(num);
	}
}
