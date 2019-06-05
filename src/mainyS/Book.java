package ClassObject;

import java.util.Scanner;

public class Book 
{
	static String title;
	static String bookPublisher;
	static String author;
	Book(String title,String bookPublisher,String author)
	{
		
	}
	
	void displayDetails()
	{
		System.out.println("Book Title : " + title +"\n"+"Book Publisher : "+ bookPublisher + "\n" +"Author : "+ author );
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter book name");
		title=sc.nextLine();
		System.out.println("Enter book publisher");
		bookPublisher=sc.nextLine();
		System.out.println("Enter author name");
		author=sc.nextLine();
		Book book = new Book(title,bookPublisher,author);
		book.displayDetails();
		sc.close();
	}
}
