package shantanuG;

import java.util.Scanner;

public class Palindrome {
	void isPalindrome(String str)
	{
		String original=str;
		String temp="";
		for(int i=str.length()-1;i>=0;i--)
		{
			temp=temp+str.charAt(i);
		}
		if(original.equals(temp))
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		
		Palindrome palindrome=new Palindrome();
		palindrome.isPalindrome(str);
	}

}
