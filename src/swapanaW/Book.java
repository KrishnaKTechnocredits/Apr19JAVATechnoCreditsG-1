package swapanaW;

//Class Book having Title, Book Publisher, Author with parameterized constructor using this.

public class Book {

	String title;
	String bookPublisher;
	String author;

	public Book(String title, String bookPublisher, String author) {
		this.title = title;
		this.bookPublisher = bookPublisher;
		this.author = author;
	}

	void display() {
		System.out.print(
				"The book title is " + title + " by " + author + " which is published by " + bookPublisher + ".");
	}
}