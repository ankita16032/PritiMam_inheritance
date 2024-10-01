package inheritance;

public class Book {

	protected String bookName;
	protected String author;
	protected int PageCount;

	public Book(String bookName, String author, int pageCount) {
		// super();
		this.bookName = bookName;
		this.author = author;
		PageCount = pageCount;
	}

	public void display() {
		System.out.println("Parent class Book");
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", author=" + author + ", PageCount=" + PageCount + "]";
	}

}
