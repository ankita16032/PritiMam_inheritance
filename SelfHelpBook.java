package inheritance;

public class SelfHelpBook extends AudioBook{

	protected String Audience;

	public SelfHelpBook(String bookName, String author, int pageCount, double duration, double size, String language,
			String audience) {
		super(bookName, author, pageCount, duration, size, language);
		Audience = audience;
	}

	@Override
	public String toString() {
		return "SelfHelpBook [Audience=" + Audience + ", duration=" + duration + ", size=" + size + ", Language="
				+ Language + ", bookName=" + bookName + ", author=" + author + ", PageCount=" + PageCount + "]";
	}

}
