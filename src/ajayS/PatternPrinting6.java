package ajayS;

public class PatternPrinting6 {
	void pattern6(int rows) {
		int count = 0;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows; j++) {
				count++;
				System.out.print(rows * count + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		new PatternPrinting6().pattern6(3);

	}
}