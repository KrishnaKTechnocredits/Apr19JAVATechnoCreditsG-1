package poonamS;

public class StringQ4 {

	// 4) WAP to revers number (Consider Input as Integer not as String).
	// Example:-
	// input:- 12345
	// output:- 54321

	void reverseNumber(int num) {
		int n;
		int m;
		while (num > 0) {
			n = num % 10;
			m = num / 10;
			num = m;
			System.out.print(n);
		}
	}

	public static void main(String[] args) {
		int num = 123456;
		StringQ4 q4 = new StringQ4();
		q4.reverseNumber(num);
	}
}
