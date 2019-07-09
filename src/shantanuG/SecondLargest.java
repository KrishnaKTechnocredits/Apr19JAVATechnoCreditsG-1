package shantanuG;

import java.util.Scanner;

public class SecondLargest {

	void findSecondLargestNumber(int[] array)
	{
		int largest=array[0];
		int secondLargest=array[0];
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>largest)
			{
				secondLargest=largest;
				largest=array[i];
			}
			else if(array[i]>secondLargest)
			{
				secondLargest=array[i];
			}
		}
		System.out.println("Second largest number is: "+secondLargest);
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
		
		SecondLargest secondLargest=new SecondLargest();
		secondLargest.findSecondLargestNumber(array);
	}
}
