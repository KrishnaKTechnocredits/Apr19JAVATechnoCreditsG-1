package swapanaW;

import java.util.Scanner;

// Write a Java Program and create Calculator using switch statement

public class CalculatorSwitch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first no :");
		int a = sc.nextInt();
		System.out.println("Enter second no :");
		int b = sc.nextInt();
		System.out.println("Select the operation to perform (+ , - , / , *)");

		char operator = sc.next().charAt(0);

		switch (operator) {
		case '+':
			System.out.println("Addition : " + (a + b));
			break;
		case '-':
			System.out.println("Subtraction : " + (a + b));
			break;
		case '*':
			System.out.println("Multiplication : " + (a + b));
			break;
		case '/':
			System.out.println("Division : " + (a + b));
			break;
		default:
			System.out.println("Invalid operator");
		}
	}
}