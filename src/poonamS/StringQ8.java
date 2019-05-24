package poonamS;

public class StringQ8 {

	// Separate digits and characters from user defined String.
	// i/p = 1a2s3dd5; o/p = asdd 1235

	void separateDigitsAndChar(String word) {
		String temp1 = "";
		String temp2 = "";
		for (int i = 0; i < word.length(); i++) {
			if (Character.isDigit(word.charAt(i))) {
				temp1 = temp1 + word.charAt(i);
			} else {
				temp2 = temp2 + word.charAt(i);
			}
		}

		System.out.println(temp1 + temp2);
	}

	public static void main(String[] args) {
		String word = "1a2s3dd5";
		StringQ8 q8 = new StringQ8();
		q8.separateDigitsAndChar(word);
	}
}
