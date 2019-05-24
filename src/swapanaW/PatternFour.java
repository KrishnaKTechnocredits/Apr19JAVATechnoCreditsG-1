package swapanaW;

/* To Print the pattern

 1 * 3 *
 * 2 * 4
 1 * 3 *
 * 2 * 4
 * 
*/

public class PatternFour {

	public static void main(String[] args) {
		patternfour();
	}

	static void patternfour() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j < 2; j++) {
				if (i % 2 != 0) {
					System.out.print("1 * 3 *");
				} else {
					System.out.print("* 2 * 4 ");
				}
			}
			System.out.println();
		}
	}
}