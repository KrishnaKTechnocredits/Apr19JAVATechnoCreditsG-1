package sushantD;

import java.util.Scanner;

public class SingleCharFrequency {
	
	

	    public static void main(String[] args) {
	    	System.out.println("Please Enter the String");
			Scanner sc= new Scanner(System.in);
			String str=sc.nextLine();
			
	      
	        char ch = 'e';
	        int frequency = 0;

	        for(int i = 0; i < str.length(); i++) {
	            if(ch == str.charAt(i)) {
	                ++frequency;
	            }
	        }

	        System.out.println("Frequency of " + ch + " = " + frequency);
	    }
	}

