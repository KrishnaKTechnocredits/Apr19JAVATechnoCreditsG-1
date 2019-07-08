package mainyS;

import java.util.Scanner;

//WAP to character occurrence in user defined string and char
public class StringQuestion10 {
	static void character() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String[] str = sc.nextLine().split("");
		System.out.println("Input char");
		String input = sc.next();
		int count = 0;
		for (int i = 0; i < str.length; i++) {
			if (input.equals(str[i])) {
				count++;
			}
		}
		System.out.println("char is : " + input + " and occurence of char is : " + count);
		sc.close();
	}

	public static void main(String[] args) {
		character();
	}
}
