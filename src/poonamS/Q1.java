package poonamS;

import java.util.Scanner;

public class Q1 {

	//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers given by user

	public static void main(String[] args) {
		
		int a;
		int b;
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter 1st number");
		a= s1.nextInt();
		System.out.println("Enter 2nd number");
		b= s1.nextInt();
		
		System.out.println("The sum of given numbers is " + (a+b));
		System.out.println("The multiplication of given numbers is " + (a*b));
		System.out.println("The subtraction of given numbers is " + (a-b));
		System.out.println("The division of given numbers is " + (a/b));
		System.out.println("The remainder of given numbers is " + (a%b));
		
	}
	
	
	
	
	



}
