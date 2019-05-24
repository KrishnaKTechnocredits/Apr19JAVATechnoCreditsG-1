package swapanaW;

//To Print the pattern

// 3  6  9
// 12 15 18
// 21 24 27

public class PatternSix {

	public static void main(String[] args) {
		patternsix();
	}

	static void patternsix() {
		int count = 3;

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print(count + " ");
				count = count + 3;
			}
			System.out.println();
		}
	}
}