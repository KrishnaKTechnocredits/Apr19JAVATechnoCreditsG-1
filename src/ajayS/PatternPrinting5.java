package ajayS;

public class PatternPrinting5 {// method display  pattern5
	void patttern3(int rows) {
		for (int i = 1; i <= rows; i++) {// outer loop for number of rows for above half of pattern
			for (int j = 1; j <= i; j++) {// inner loop for number of columns in row 
				System.out.print(j + " ");
			}
			System.out.println();

		}
		for (int i = rows - 1; i >= 1; i--) {// / outer loop for number of rows for lower half of pattern
			for (int j = 1; j <= i; j++) {// inner loop for number of columns in row 
				System.out.print(j + " ");
			}
			System.out.println();

		}

	}

	public static void main(String[] args) {
		new PatternPrinting5().patttern3(3);

	}
}
