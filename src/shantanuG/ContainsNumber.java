package shantanuG;

import java.util.Scanner;

public class ContainsNumber {
	void findNumber(int e[], int num)
	{
		boolean flag=false;
		for(int i=0;i<e.length;i++)
		{
			if(e[i]==num)
			{
				flag=true;
				System.out.println("Number is present in the array.");
				break;
			}
		}
		if(flag==false)
			System.out.println("Number is not present in the array");
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to be found:");
		int num=Integer.parseInt(sc.nextLine());
		System.out.println("Enter elements of the array:");
		String allElements=sc.nextLine();
		String[] element=allElements.split(" ");
		int[] e=new int[element.length];
		for(int i=0;i<element.length;i++)
			e[i]=Integer.parseInt(element[i]);
		
		ContainsNumber containsNumber=new ContainsNumber();
		containsNumber.findNumber(e,num);
	}

}
