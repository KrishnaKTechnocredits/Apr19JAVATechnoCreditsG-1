package jiniY;

import java.util.Scanner;

public class ReverseWordAndChar {

	public static void main(String[] args) {
		String str = "There is an apple";
		System.out.println(str);
		// System.out.println(str.length());
		System.out.println("Reverse String is:" + " ");
		for (int i = str.length() - 1; i >= 0; i--) {

			
			
			
			System.out.print(str.charAt(i));
		}
	}

}
