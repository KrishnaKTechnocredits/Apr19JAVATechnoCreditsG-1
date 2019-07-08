package mainyS;

import java.util.Scanner;

//WAP to reverse full string and particular word
public class StringQuestion2 {
	static void reverse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the String Value : ");
		String array = sc.nextLine();

		for (int i = array.length() - 1; i >= 0; i--) {
			System.out.print(array.charAt(i));
		}
		sc.close();

	}

	public static void main(String[] args) {
		reverse();
	}
}
