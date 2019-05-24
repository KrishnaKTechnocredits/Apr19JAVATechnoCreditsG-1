package sushantD;

import java.util.Scanner;

public class CharFrequency {
	public static void main(String[] args) {
		charfrequency();
		
	}
	
	static void charfrequency() {
		System.out.println("Please Enter the String");
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		
		char[] carray = str.toCharArray();
		int size= carray.length;
		int counter=0;
		for(int i=0;i<size;++i) {
			counter=0;// reset the value of counter for next char
			for(int j=0;j<size;++j) {
				
				if(j<i && carray[i]==carray[j]) {// same content
					break;
				}
				if(carray[j]==carray[i]) {
					counter++;
					
				}
				
				if(j==size -1) {
					System.out.println("The character"+" "+carray[i]+" "+"occurs :"+counter+" "+"times");

				}
			}
					}
		
	}

}
