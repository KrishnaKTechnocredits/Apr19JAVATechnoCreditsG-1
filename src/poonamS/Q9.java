package poonamS;

import java.util.Scanner;

public class Q9 {

	//WAP to swap two numbers without using the third variable.
	
	public static void main(String[] args) {
		
		int x;
		int y;
		
		System.out.println("Enter x and y");
		
		Scanner s = new Scanner (System.in);
		
		x= s.nextInt();
		y= s.nextInt();
		
		System.out.println("Before Swap : " + "x = "+ x + " , y = " + y);
		
		x= x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("After Swap : " + "x = "+ x + " , y = " + y);
	}
}
