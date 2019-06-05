package CoreJava_Assignement;

import java.util.Scanner;

public class CoreJava6 
{
	void marks()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter you marks to find the grade");
		int num = sc.nextInt();
		
		if(num>0 && num<=50)
		{
			System.out.println("Your marks is " + num + " and Result is Failed ");
		}
		else if(num>50 && num<=75)
		{
			System.out.println("Your marks is " + num + " and Result is 1st Class ");
		}
		else if(num>75 && num<=100)
		{
			System.out.println("Your marks is " + num + " and Result is Distnction ");
		}
	}
	
	public static void main(String[] args) {
		CoreJava6 mrk = new CoreJava6();
		mrk.marks();
	}
}
