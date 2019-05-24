package poonamS;

public class StringQ12 {

	// 12) WAP to separate numeric and string value from the array
	// Example:-
	// input:- Object Array = {"xyz", "77", "101", "99", "abc”}
	// output:- numeric 77, 101, 99
	// string xyz, abc

	void parseArray(String[] a) {

		String a1 = "";
		String a2 = "";

		for (int i = 0; i < a.length; i++) {
			if (Character.isAlphabetic(a[i].charAt(0))) {
				a1 = a1 + " " + a[i];

			} else {
				a2 = a2 + " " + a[i];

			}
		}

		System.out.println("String values are " + a1);
		System.out.println("Numeric values are " + a2);

	}

	public static void main(String[] args) {

		String[] ar = { "xyz", "77", "101", "99", "abc" };

		StringQ12 q12 = new StringQ12();
		q12.parseArray(ar);
	}
}
