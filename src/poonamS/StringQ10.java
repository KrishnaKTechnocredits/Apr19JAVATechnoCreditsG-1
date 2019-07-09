package poonamS;

public class StringQ10 {

	// 10) WAP to find the character occurring in user defined String and
	// Character
	// Example :-
	// Input String :- hello how are you harsh?
	// Input char :- h
	// Output:- char is : h and number of occurrence = 4.

	void findFrequencyOfChar(String line, char c) {
		int count = 0;
		for (int i = 0; i < line.length(); i++)
			if (line.charAt(i) == c) {
				count = count + 1;
			}
		System.out.println("Character is : " + c + " and number of occurence = " + count);
	}

	public static void main(String[] args) {

		String ip = "hello how are you Poonam";
		char ch = 'o';
		StringQ10 q10 = new StringQ10();
		q10.findFrequencyOfChar(ip, ch);
	}
}
