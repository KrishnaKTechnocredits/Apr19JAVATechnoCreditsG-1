package shantanuG;

import java.util.Scanner;

public class ReverseString2 {
	void stringReverse(String[] words)
	{
		String str="";
		for(int i=0;i<words.length;i++)
		{
			for(int j=words[i].length()-1;j>=0;j--)
			{
				str=str+words[i].charAt(j);
				
			}
			str=str+" ";
		}
		System.out.println(str);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		String[] words=str.split(" ");
		
		ReverseString2 reverseString2=new ReverseString2();
		reverseString2.stringReverse(words);
	}

}
