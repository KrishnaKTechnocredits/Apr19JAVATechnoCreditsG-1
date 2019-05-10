package ajayS;

public class PatternPrinting3 {//method to display pattern3

	void pattern2(int rows) {
		for (int i = 1; i <= rows; i++) {//outer loop for number of rows

			for (int j = rows; j >= i; j--) {//inner loop for columns in row in decreasing order

				System.out.print(j + " ");

			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
		new PatternPrinting3().pattern2(4);

	}
}
