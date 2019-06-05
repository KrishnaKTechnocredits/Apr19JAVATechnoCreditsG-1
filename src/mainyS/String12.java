package String;

import java.util.Scanner;
//WAP to separate numberic and string value from the array
public class String12
{
	static void separte()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String that contains number and letters");
		String[] arr = sc.nextLine().split(" ");
		String arr1 ="";
		String digit="";
		for(int i=0;i<arr.length;i++)
		{
			if(Character.isLetter((arr[i]).charAt(0)))
			{
				arr1=arr1+arr[i]+",";
			}
			else
			{
				digit=digit+arr[i]+",";
			}
		}
		System.out.println(arr1);
		System.out.println(digit);
	}
	public static void main(String[] args) {
		separte();
	}

	
}
