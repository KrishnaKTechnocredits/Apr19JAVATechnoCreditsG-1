package mainyS;

import java.util.Scanner;

//WAP to reverse words
public class StringQuestion9 {
	static void wordReverse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string");
		String[] str = sc.nextLine().split(" ");
		for (int i = 0; i < str.length; i++) {
			for (int j = str[i].length() - 1; j >= 0; j--) {
				System.out.print(str[i].charAt(j));
			}
			System.out.print(" ");
		}
	}

	public static void main(String[] args) {
		wordReverse();
	}
}