package swapanaW;

public class Student {

	String sname = "Swapna";
	int srollno = 123;
	int marks = 89;

	void details(int i) {

		System.out.println("Student's Name: " + sname + "," + " Roll no: " + srollno + "," + " Marks Obtained " + marks);
	}

	public static void main(String[] args) {

		new Student().details(0);
	}
}