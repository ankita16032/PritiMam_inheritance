package inheritance;

public class TestBook {

	public static void main(String[] args) {
		System.out.println("---------------------------------------------------------------------");
		Book book = new Book("How to Win Friends and influence people", "dale Carnegie", 450);
		System.out.println(book);
		System.out.println("---------------------------------------------------------------------");

		AudioBook audiobook = new AudioBook("How to Win Friends and influence people", "dale Carnegie", 450, 1, 1024,
				"English");
		System.out.println(audiobook);
		System.out.println("---------------------------------------------------------------------");

		SelfHelpBook selfhelpbook = new SelfHelpBook("How to Win Friends and influence people", "dale Carnegie", 450, 1,
				1024, "English", "Adult");
		System.out.println(selfhelpbook);
		
//		System.out.println("********************************************************");
//		Book book1=new Book("How to Win Friends and influence people", "dale Carnegie", 450);
//		System.out.println(book1);
//		System.out.println("********************************************************");
//		
//		System.out.println(book1);
//		System.out.println("********************-************************************");
//		System.out.println(book1);
	}


}
