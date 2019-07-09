package shantanuG;

import java.util.Scanner;

public class SeparateDigAndChar {
	void separate(String str)
	{
		String characters="";
		String digits="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='0'||str.charAt(i)=='1'||str.charAt(i)=='2'||str.charAt(i)=='3'||str.charAt(i)=='4'||str.charAt(i)=='5'||str.charAt(i)=='6'||str.charAt(i)=='7'||str.charAt(i)=='8'||str.charAt(i)=='9')
				digits=digits+str.charAt(i);
			else
				characters=characters+str.charAt(i);
		}
		System.out.println(digits+" "+characters);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		
		SeparateDigAndChar separateDigAndChar=new SeparateDigAndChar();
		separateDigAndChar.separate(str);
	}

}
