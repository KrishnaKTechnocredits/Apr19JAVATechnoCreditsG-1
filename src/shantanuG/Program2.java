package shantanuG;

public class Program2 {
 void studentDetails(int rollNo, String name, int marks)
 {
	 System.out.println("Name of the student is:"+name);
	 System.out.println("Roll Number of "+name+" is:"+rollNo);
	 System.out.println("Marks of "+name+" is:"+marks);
 }
 public static void main(String args[])
 {
	 Program2 program2=new Program2();
	 program2.studentDetails(7, "Shantanu", 80);
 }
}
