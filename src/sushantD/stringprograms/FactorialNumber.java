package sushantD.stringprograms;

import java.util.Scanner;

public class FactorialNumber {
	
	public static void main(String[] args) {
		
		factorialNumb();
		
	}
	
	static void factorialNumb() {
		
		System.out.println("Please Enter the number");
		Scanner sc = new Scanner(System.in);
		int number=sc.nextInt();
		int fact=1;
		for(int i =number;i >=1;i--){
			
			fact=(fact*i);
			
		}
		
		System.out.println("Factorial of the  number "+number+" "+ "is"+" "+fact);
		
	}

}
