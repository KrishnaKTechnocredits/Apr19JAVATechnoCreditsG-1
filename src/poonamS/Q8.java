package assignments;

import java.util.Scanner;

public class Q8 {

	//WAP to swap two numbers using the third variable

	public static void main(String[] args) {
		int x;
		int y;
		int temp;
		
		System.out.println("Enter x and y");
		
		Scanner s = new Scanner (System.in);
		
		x= s.nextInt();
		y= s.nextInt();
		
		System.out.println("Before Swap : " + "x = "+ x + " , y = " + y);
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("After Swap : " + "x = "+ x + " , y = " + y);
	}
}
