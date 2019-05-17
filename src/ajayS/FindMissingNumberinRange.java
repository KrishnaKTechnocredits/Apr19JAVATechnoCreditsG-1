package ajayS;

import java.util.Scanner;

class FindMissingNumberinRange {

	void finfMissingNumber(int minRange, int maxRnage, int[] number1) {// method
																		// to
																		// find
																		// missing
																		// number
																		// in a
																		// user
																		// given
																		// range

		for (int i = minRange; i <= maxRnage; i++) {// outer loop to run in
													// range of number sin which
													// we need to find missing
													// number
			boolean flag = false;
			for (int j = 0; j < number1.length; j++) {// inner loop to match
														// number form user
														// passed array to
														// numbers in given
														// range
				if (i == number1[j]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println("missing number is" + i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the minRange  and maxRange ");// minRange
																		// will
																		// decide
																		// lowest
																		// number
																		// from
																		// where
																		// program
																		// will
																		// start
																		// searching
																		// till
																		// the
																		// maxRange
																		// number
																		// for
																		// all
																		// the
																		// missing
																		// number
		int minRange = Integer.parseInt(sc.nextLine());
		int maxRange = Integer.parseInt(sc.nextLine());
		System.out.println("please enter the  numbers");
		String input = sc.nextLine();
		String[] data = input.split(" ");
		int[] number = new int[data.length];
		for (int i = 0; i < number.length; i++) {
			number[i] = Integer.parseInt(data[i]);
		}
		FindMissingNumberinRange exp = new FindMissingNumberinRange();
		exp.finfMissingNumber(minRange, maxRange, number);
		sc.close();
	}
}