package shantanuG;

import java.util.Scanner;

public class EqualityOfArrays {
	void findEquality(int[] first,int[] second)
	{
		boolean flag=false;
		if(first.length!=second.length)
			System.out.println("Arrays are not equal");
		else
		{
			for(int i=0,j=0;j<second.length;j++,i++)
			{
				if(first[i]!=second[j])
				{
					flag=true;
					System.out.println("Arrays are not equal");
					break;
				}
			}
			if(flag==false)
				System.out.println("Arrays are equal");
		}
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements of first array");
		String firstDetails=sc.nextLine();
		String[] first=firstDetails.split(" ");
		int[] firstArray=new int[first.length];
		for(int i=0;i<first.length;i++)
			firstArray[i]=Integer.parseInt(first[i]);
		System.out.println("Enter the elements of second array");
		String secondDetails=sc.nextLine();
		String[] second=secondDetails.split(" ");
		int[] secondArray=new int[second.length];
		for(int i=0;i<second.length;i++)
			secondArray[i]=Integer.parseInt(second[i]);
		
		EqualityOfArrays equalityOfArrays=new EqualityOfArrays();
		equalityOfArrays.findEquality(firstArray,secondArray);
	}

}
