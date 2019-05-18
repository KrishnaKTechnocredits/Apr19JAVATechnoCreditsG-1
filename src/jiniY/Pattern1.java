package jiniY;

public class Pattern1 {

	void pattern() {
		for (int i = 1; i <= 4; i++) {// for outer loop
			for (int j = 1; j <= i; j++) {// for inner loop

				if (i % 2 != 0)// check for odd row
					System.out.print("*" +"\t");
				else// for even row

					System.out.print("#" +"\t");

			}
			System.out.println("");// to break line
		}

	}

	public static void main(String[] args) {
		new Pattern1().pattern();// call method

	}

}
