package poonamS;

public class StringQ11 {
	//
	// 11) WAP to find given string is palidrome or not
	// Example:-
	// #palidrome defines as The characters read the same backward as forward
	// 1) input :- racecar
	// output:- racecar
	// 2) input:- nitin
	// output:- nitin

	void determinePalindrome(String name) {

		String name1 = "";
		for (int i = (name.length() - 1); i >= 0; i--) {
			name1 = name1 + name.charAt(i);
		}
		if (name.equals(name1))
			System.out.println(name + " is Palindrome");
		else
			System.out.println(name + " is not Palindrome");
	}

	public static void main(String[] args) {

		String word = "racecar";
		StringQ11 q11 = new StringQ11();
		q11.determinePalindrome(word);
	}
}
