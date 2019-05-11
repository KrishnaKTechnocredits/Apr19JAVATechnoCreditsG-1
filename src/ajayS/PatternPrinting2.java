package ajayS;

public class PatternPrinting2 {//method to display pattern2

	void pattern4(int rows) {//method to print rows and same number of columns with * and # alternativly 
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows; j++) {
				if (i % 2 == 0) {
					if (j % 2 == 0)
						System.out.print("# ");
					else
						System.out.print("* ");
				} else {
					if (j % 2 == 0)
						System.out.print("* ");
					else
						System.out.print("# ");
				}

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new PatternPrinting2().pattern4(4);

	}
}
