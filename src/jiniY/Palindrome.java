package jiniY;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args)
	{
		String original,reverse="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word:");
		original=sc.nextLine();//from first line take word
		int length_original=original.length();//length of original word
		
		
		
		
		new Palindrome().palindrome(original,reverse,length_original);
	}

	
	void palindrome(String original,String reverse,int len)
	{
		for(int i=len-1;i>=0;i--)//compare length-1 till i is greater than 0
		{
			reverse=reverse+original.charAt(i);//condition true print each character
		}
		
		if(original.equals(reverse))
		{
			System.out.println("String is palindrome" +original  +" "+reverse);
		}
		
		else
		{
			System.out.println("String is not palindrome"+original +" " +reverse);
		}
	}
}
