package mainyS;

import java.util.Scanner;
//WAP in java that takes year from user and print whether that year is leap or not
public class CoreJava3 
{
	void leapYear()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the year");
		int yr = sc.nextInt();
		boolean flag= false;
		if(yr%4==0 || yr%400==0)
		{
			flag= true;
		}
		else if(yr%100==0)
		{
			flag=false;
		}
		if(flag)
		{
			System.out.println(yr +" is a leap year");
		}
		else
		{
			System.out.println(yr +" is not a leap year");
		}
	}
	
	public static void main(String[] args) {
		CoreJava3 yr = new CoreJava3();
		yr.leapYear();
	}
}
