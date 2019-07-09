package poonamS;

public class StringQ2 {

	// 2) WAP to revers a full String and particular word also.
	// Example:-
	// input = “there is an apple”
	// output = “elppa na si ereht”

	void reverseString(String[] wordLine) {
		String temp;
		for (int i = (wordLine.length - 1); i >= 0; i--) {
			temp = wordLine[i];
			for (int j = (temp.length() - 1); j >= 0; j--) {
				char var;
				var = temp.charAt(j);
				System.out.print(var);
			}
			System.out.print(" ");
		}
	}

	public static void main(String[] args) {

		String line = "there is an apple";
		String[] w = line.split(" ");

		StringQ2 q2 = new StringQ2();
		q2.reverseString(w);

	}

}
