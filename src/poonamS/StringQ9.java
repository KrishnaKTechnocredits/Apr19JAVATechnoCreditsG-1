package poonamS;

public class StringQ9 {

	// 9) WAP to reverse the word.
	// Example:-
	// input :- hello good morning to all
	// output:- olleh doog gninrom ot lla

	void reverseWord(String[] line) {
		for (int i = 0; i < line.length; i++) {

			for (int j = (line[i].length() - 1); j >= 0; j--) {
				System.out.print(line[i].charAt(j));
			}
			System.out.print(" ");
		}
	}

	public static void main(String[] args) {

		String line = "hello good morning to all";
		String[] word = line.split(" ");

		StringQ9 q9 = new StringQ9();
		q9.reverseWord(word);

	}

}
