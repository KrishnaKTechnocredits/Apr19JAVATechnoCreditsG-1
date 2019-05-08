package jiniY;

public class Pattern6 {
	void pattern6() {
		for (int i = 1; i <= 1; i++) {// to print number 1 to 3 in row
			for (int j = 1; j <= 3; j++) {
				System.out.print(j * 3 + "\t");// after number is printed
												// multiply by 3
			}
			System.out.println("");
		}
		for (int i = 1; i <= 1; i++) {// to print number 4 to 6 in row
			for (int j = 4; j <= 6; j++) {
				System.out.print(j * 3 + "\t");// after number is printed
												// multiply by 3
			}
			System.out.println("");
		}
		for (int i = 1; i <= 1; i++) {// to print number 7 to 9 in row
			for (int j = 7; j <= 9; j++) {
				System.out.print(j * 3 + "\t");// after number is printed
												// multiply by 3
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		new Pattern6().pattern6();

	}
}
