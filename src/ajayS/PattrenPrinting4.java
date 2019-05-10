package ajayS;

public class PattrenPrinting4 {
	void pattern4(int rows) {// method to display pattern4
		for (int i = 1; i <= rows; i++) {// outer loop for number of rows
			for (int j = 1; j <= rows; j++) {// inner loop for number of columns
												// in row
				if (i % 2 == 0) {// condition to print * instead of j if i is
									// even and j is odd
					if (j % 2 == 0)
						System.out.print(j + " ");
					else
						System.out.print("* ");
				} else {// condition to print * instead of j if i is odd and
						// j is even
					if (j % 2 == 0)
						System.out.print("* ");
					else
						System.out.print(j + " ");
				}

			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
		new PattrenPrinting4().pattern4(4);
	}
}
