package shantanuG;

import java.util.Scanner;

public class ReverseString1 {
	void stringReverse(String[] words)
	{
		String str = "";
		for(int i=words.length-1;i>=0;i--)
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
		System.out.println("Enter a sentence");
		String sentence=sc.nextLine();
		String[] words=sentence.split(" ");
		
		ReverseString1 reverseString1=new ReverseString1();
		reverseString1.stringReverse(words);
	}

}
