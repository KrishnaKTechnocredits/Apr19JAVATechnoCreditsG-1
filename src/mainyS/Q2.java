package mainyS;
//WAP to print the details of Student as Roll No, Name, Marks by taking input from user.
public class Q2 {
	void student(int rollNo, String name, int marks) {
		System.out.println("Student RollNo is = " + rollNo);
		System.out.println("Student Name is = " + name);
		System.out.println("Student marks is = " + marks);
	}

	public static void main(String args[]) {
		Q2 q2 = new Q2();
		q2.student(1, "Mainy", 60);
	}

}
