package jiniY;

import java.util.Scanner;

public class Book {
	String title;//instance variables
	String book_publisher;//instance variables
	String author;//instance variables
	
	
	Book(String title,String book_publisher,String author)//declaring consructor with parameters
	{
		this.title=title;
		this.book_publisher=book_publisher;
		this.author=author;
	}
	
	void displayDetails()//define method with body
	{
		System.out.println(" ");
		System.out.println(" Book title is:" +" "+title);
		System.out.println(" Book publisher name is:" +" "+book_publisher);
		System.out.println(" Book author is:"+" "+author);
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter book title");
		String title = sc.nextLine();
		System.out.println("Enter book publisher name");
		String book_publisher = sc.nextLine();
		System.out.println("Enter book author");
		String author = sc.nextLine();
		Book book= new Book(title,book_publisher,author);//constructor caling
		book.displayDetails();//calling method
	}

}
