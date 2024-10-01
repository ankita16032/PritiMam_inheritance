package inheritance;

public class AudioBook extends Book{

	protected double duration;
	protected double size;
	protected String Language;

	public AudioBook(String bookName, String author, int pageCount, double duration, double size, String language) {
		super(bookName, author, pageCount);
		this.duration = duration;
		this.size = size;
		Language = language;
	}

	public void display() {
		super.display();
		System.out.println("Display the details of child");
	}

	@Override
	public String toString() {
		return "AudioBook [duration=" + duration + ", size=" + size + ", Language=" + Language + ", bookName="
				+ bookName + ", author=" + author + ", PageCount=" + PageCount + "]";
	}


}
