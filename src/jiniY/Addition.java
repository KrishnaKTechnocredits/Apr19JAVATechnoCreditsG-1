package jiniY;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input value to add two integer value");// get
																			// values
																			// of
																			// two
																			// integer
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("Enter input value to add two floating value");// get
																			// values
																			// of
																			// two
																			// float
		float c = sc.nextFloat();
		float d = sc.nextFloat();

		System.out.println("Enter input value to add two String value");// get
																		// values
																		// of
																		// two
																		// float
		String e = sc.next();
		String f = sc.next();

		Addition add = new Addition();// object creation with default
										// constructor
		add.add(a, b);// method calling
		add.add(c, d);// method calling
		add.add(e, f);// method calling
	}

	void add(int a, int b) {// method define and body
		int sum;
		sum = a + b;
		System.out.println("Addition of two integer value is:" + sum);
	}

	void add(float c, float d) {// method define and body
		float sum;
		sum = c + d;
		System.out.println("Addition of two integer value is:" + sum);
	}

	void add(String e, String f) {// method define and body
		int sum;
		sum = Integer.parseInt(e) + Integer.parseInt(f);// convert String to int
		System.out.println("Addition of two integer value is:" + sum);
	}
}
