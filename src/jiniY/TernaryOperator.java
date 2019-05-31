package jiniY;

import java.util.Scanner;

public class TernaryOperator {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int a= sc.nextInt();
		
		System.out.println("Enter second number");
		int b = sc.nextInt();
		
		int max;
		      //(a greater than b)? then print a: else print b
		max = (a>b)? a:b;
		
		System.out.println("Largest number between" +" " +a +" " +"and " +b +"" +" is" +" " +max +". ");
		
	}
}
