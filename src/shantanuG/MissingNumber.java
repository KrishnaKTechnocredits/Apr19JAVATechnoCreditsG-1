package shantanuG;

import java.util.Scanner;

public class MissingNumber {
	
	void display(int[] num)
	{
		for(int i=0;i<num.length;i++)
			System.out.println(num[i]);
	}
	
	void findMissingNumber(int[] number)
	{
		for(int i=1;i<=10;i++)
		{
			boolean flag=false;
			for(int j=0;j<number.length;j++)
			{
				if(i==number[j])
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				System.out.println("Missing number is: "+i);
				//break;
			}
		}
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int[] x=new int[10];
		System.out.println("Enter numbers:");
		for(int i=0;i<x.length;i++)
			x[i]=sc.nextInt();
		
		MissingNumber missingNumber=new MissingNumber();
		//missingNumber.display(x);
		missingNumber.findMissingNumber(x);
			
	}
}
