package poonamS;

public class StringQ5 {

	// 5) WAP to check if a number is Armstrong or not
	// Example:-
	// input:- 153
	// output:-153
	// hint:- (1*1*1)+(5*5*5)+(3*3*3)
	// 1+125+27
	// 153

	void armstrongNumber(int num) {
		double reminder, addition = 0;
		int tempnum;
		tempnum = num;

		while (tempnum != 0) {
			reminder = tempnum % 10;
			addition = addition + Math.pow(reminder, 3);
			tempnum = tempnum / 10;
		}
		if (addition == num) {
			System.out.println(num + " is Armstrong Number");
		} else
			System.out.println(num + " is not Armstrong Number");
	}

	public static void main(String[] args) {

		StringQ5 q5 = new StringQ5();
		int number = 153;
		q5.armstrongNumber(number);
	}

}
