package swapanaW;

/*To Print the pattern
 1
 1 2
 1 2 3
 1 2
 1
 */

public class PatternFive {

	public static void main(String[] args) {
		patternfive();
	}

	static void patternfive() {
		int n = 3;
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print(j + " ");
			System.out.println();
		}
		for (int i = n; i >= 0; i--) {
			for (int j = 1; j <= i; j++)
				System.out.print(j + " ");
			System.out.println();
		}
		System.out.println();
	}
}