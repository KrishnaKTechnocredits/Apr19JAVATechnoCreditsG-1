package shantanuG;

public class Book {
	String title;
	String publisher;
	String author;
	
	Book(String title,String publisher,String author)
	{
		this.title=title;
		this.publisher=publisher;
		this.author=author;
	}

	void displayDetails()
	{
		System.out.println("Name of book is:"+title);
		System.out.println("Published By:"+publisher);
		System.out.println("Authored By:"+author);
	}
	
	public static void main(String args[])
	{
		Book book=new Book("Book_Name","Book_Publisher","Book_Author");
		book.displayDetails();
	}
}
