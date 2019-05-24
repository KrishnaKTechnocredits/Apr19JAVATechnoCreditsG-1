package shantanuG;

import java.util.Scanner;

public class LargestAndSmallestNumber {
	void findLargestAndSmallestNumber(int[] array)
	{
		int max=array[0];
		int min=array[0];
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>max)
				max=array[i];
			if(array[i]<min)
				min=array[i];
		}
		System.out.println("Largest number is: "+max);
		System.out.println("Smallest number is: "+min);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements of the array");
		String arrayElements=sc.nextLine();
		String[] element=arrayElements.split(" ");
		int[] array=new int[element.length];
		for(int i=0;i<element.length;i++)
			array[i]=Integer.parseInt(element[i]);
		
		LargestAndSmallestNumber largestAndSmallestNumber=new LargestAndSmallestNumber();
		largestAndSmallestNumber.findLargestAndSmallestNumber(array);
	}

}
