package swapanaW;

// To Print the pattern
//  # * # *
//  * # * #
//  # * # *
//  * # * #

public class PatternTwo {

	public static void main(String[] args) {
		patterntwo();
	}

	static void patterntwo() {

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j < 3; j++) {
				if (i % 2 != 0) {
					System.out.print("# * ");
				} else {
					System.out.print("* # ");
				}
			}
			System.out.println();
		}
	}
}