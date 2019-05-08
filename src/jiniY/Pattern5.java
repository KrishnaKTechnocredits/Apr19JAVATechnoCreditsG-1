package jiniY;

public class Pattern5 {
	void pattern5() {
		for (int i = 1; i <= 3; i++) {//first two for loop to print first three row

			for (int j = 1; j <= i; j++) {
				System.out.print(j+"\t");
			}
			System.out.println("");
		}
		for (int k = 2; k >= 1; k--) {// to print last two rows below two for loops is used
			for (int l = 1; l <= k; l++) {
				System.out.print(l+"\t");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		new Pattern5().pattern5();
	}

}
