package ajayS;

import java.util.Scanner;

public class SeparateDigitAndCharacterInArray {
	void separateDigitAndCharacter(String[] array) {//method to separate numbers and words in string array

		String newString = "";
		String digits = "";
		String words = "";

		for (int i = 0; i < array.length; i++) {
			int dcount = 0;
			int wcount = 0;
			for (int j = 0; j < array[i].length(); j++) {
				if (array[i].charAt(j) == '0' || array[i].charAt(j) == '1' || array[i].charAt(j) == '2'
						|| array[i].charAt(j) == '3' || array[i].charAt(j) == '4' || array[i].charAt(j) == '5'
						|| array[i].charAt(j) == '6' || array[i].charAt(j) == '7' || array[i].charAt(j) == '8'
						|| array[i].charAt(j) == '9') {
					digits = digits + array[i].charAt(j);
					dcount++;
				} else {
					words = words + array[i].charAt(j);
					wcount++;
				}

			}
			if (dcount > 0) {
				digits = digits + ", ";
			} else {
				words = words + ", ";
			}
		}
		System.out.println("numbers: " + digits);
		System.out.println("words: " + words);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter the string");
		String string = scanner.nextLine();
		String[] array = string.split(" ");
		SeparateDigitAndCharacterInArray separateDigitAndCharacterInArray = new SeparateDigitAndCharacterInArray();
		separateDigitAndCharacterInArray.separateDigitAndCharacter(array);
	}
}
