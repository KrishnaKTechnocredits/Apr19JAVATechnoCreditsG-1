package jiniY;

import java.util.Scanner;

public class ReverseWord {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = "" ;
		System.out.println(str);
		
		str = sc.nextLine();
		
		String[] arr = str.split(" ");
		for(int i =0;i<arr.length;i++)
		{
			//System.out.println(arr[i]);
			String str1=arr[i];
			for(int j=str1.length()-1;j>=0;j--)
			{
				System.out.print(str1.charAt(j));
			}
			System.out.print(" ");
		}
		
		
		
		}

}
