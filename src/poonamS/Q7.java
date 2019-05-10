package poonamS;

import java.util.Scanner;

public class Q7 {

	//Write a Java program to convert seconds to hour, minute and seconds.
	

		 public static void main(String[] args)
		    {
		        Scanner in = new Scanner(System.in);
		        System.out.print("Enter seconds: ");
				int s = in.nextInt(); 
		        int hour = s % 60;
		        int min = s / 60;
		        int sec = min % 60;
		        min = min / 60;
		        System.out.println(hour + " Hours " + min + " Minutes " + sec + " Seconds");
				
		    }    
}

