package String;

import java.util.Scanner;

public class StringQ11 
{
	static void palidrome()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the palidrome");
		String arr = sc.nextLine();
		String arr1 = "";
	
		for(int j=arr.length()-1;j>=0;j--)
		{
				arr1=arr1+arr.charAt(j);
		}

		if(arr.equals(arr1))
		{
			System.out.println(arr + " is a palidrome");
		}
		else
		{
			System.out.println(arr + " is not a palidrome");
		}

	}
	
	public static void main(String[] args) {
		palidrome();
	}
}
