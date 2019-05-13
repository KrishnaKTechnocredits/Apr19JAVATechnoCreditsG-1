package swapanaW;

//To Print the pattern

// 4 3 2 1
// 4 3 2
// 4 3
// 4 

public class PatternThree {

	public static void main(String[] args) {
		patternthree();
	}

	static void patternthree() {
		int count = 1;

		for (int i = 4; i >= 1; i--) {
			for (int k = 4; k >= count; k--) {
				System.out.print(k + " ");
			}
			count++;
			System.out.println();
		}
	}
}