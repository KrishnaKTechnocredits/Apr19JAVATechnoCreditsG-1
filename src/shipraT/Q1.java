package shipraT;

import java.util.Scanner;

public class Q1 {
	void addition(int a, int b) { 
		System.out.println("addition is :" + (a+b));
		
	}
	
	void multiplication(int a, int b) {
		System.out.println("multiplication is :" +(a*b));
	}
	
	void substract(int a, int b) {
		System.out.println("substraction is :" +(a-b));
		
	}
	void devide(int a, int b) {
		System.out.println("Devide is :" +(a/b));
	}
	
	void reminder(int a, int b) {
		System.out.println("Reminder is :"+(a%b));
	}
	
	public static void main(String[] args) {
		Q1 qq = new Q1();
		 Scanner scanner = new Scanner(System.in);

		   System.out.println("Enter Two Numbers : ");
		    int first = scanner.nextInt(); //when we using scanner if print value by user
		    int second = scanner.nextInt();
		    
		      qq.addition(first, second);
		      qq.multiplication(first, second);
		      qq.devide(first, second);
		      qq.substract(first, second);
		      qq.reminder(first, second);
	}

}
