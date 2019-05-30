package swapanaW;

import java.util.Scanner;

//Student marks by condition.

public class StudentGrades {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks for student :");
		int x = sc.nextInt();

		StudentGrades std = new StudentGrades();
		std.marks(x);
	}

	void marks(int grade) {
		if (grade > 0 && grade < 50) {
			System.out.println("Failed");
		} else if (grade >= 50 && grade < 75) {
			System.out.println("First class");
		} else if (grade >= 75 && grade < 100) {
			System.out.println("Distinction");
		}
	}
}
