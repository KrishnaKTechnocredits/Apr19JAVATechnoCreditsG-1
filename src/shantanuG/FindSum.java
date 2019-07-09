package shantanuG;

import java.util.Scanner;

public class FindSum {
	void findAddition(int sum,int[] array)
	{
		boolean flag=false;
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]+array[j]==sum)
				{
					flag=true;
					System.out.println("{"+array[i]+","+array[j]+"}");
				}
					
			}
		}
		if(flag==false)
			System.out.println("There is no pair in the array whose addition is: "+sum);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter required sum");
		int sum=Integer.parseInt(sc.nextLine());
		System.out.println("Enter elements of the array");
		String arrayElements=sc.nextLine();
		String[] element=arrayElements.split(" ");
		int[] array=new int[element.length];
		for(int i=0;i<element.length;i++)
			array[i]=Integer.parseInt(element[i]);
		
		FindSum findSum=new FindSum();
		findSum.findAddition(sum,array);
	}

}
