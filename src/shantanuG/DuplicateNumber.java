package shantanuG;

import java.util.Scanner;

public class DuplicateNumber {
	void findDuplicateNumber(int n[])
	{
		boolean flag=false;
		for(int i=0;i<n.length;i++)
		{
			for(int j=i+1;j<n.length;j++)
			{
				if(n[i]!=n[j])
					continue;
				else
				{
					flag=true;
					System.out.println(n[i]+" is duplicate");
					break;
				}
					
			}
			
		}
		if(flag==false)
			System.out.println("No duplicate element is present in the array");
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter maximum limit of the array:");
		//int max=Integer.parseInt(sc.nextLine());
		System.out.println("Enter elements of the array:");
		String allNumbers=sc.nextLine();
		String[] number=allNumbers.split(" ");
		int[] num=new int[number.length];
		for(int i=0;i<number.length;i++)
			num[i]=Integer.parseInt(number[i]);
		
		DuplicateNumber duplicateNumber=new DuplicateNumber();
		duplicateNumber.findDuplicateNumber(num);
	}

}
