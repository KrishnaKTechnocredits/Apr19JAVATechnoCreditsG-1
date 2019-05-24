package shantanuG;

import java.util.Scanner;

public class OccurenceOfCharacter {
	void findOccurence(String str,char[] character)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==character[0])
				count++;
		}
		System.out.println("Occurence: "+count);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		System.out.println("Enter the character");
		char[] character=sc.nextLine().toCharArray();
		
		OccurenceOfCharacter occurenceOfCharacter=new OccurenceOfCharacter();
		occurenceOfCharacter.findOccurence(str,character);
	}

}
