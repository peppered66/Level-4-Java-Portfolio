
public class Bookshelf {

	public static void main(String[] args) {
		Book Book1 = new Book("A great book", "James Graham", "Penguin", "2022");
		System.out.println(Book1.toString());
		Book1.setTitle("A whales Tale");
		Book1.setCrdate("1998");
		System.out.println(Book1.getTitle());
		System.out.println(Book1.getCrdate());
		
		System.out.println(Book1.toString());
		
		
		Book Book2 = new Book("A great book", "James Graham", "Penguin", "2022");
		System.out.println(Book2.toString());
		Book2.setAuthor("Graham James");
		Book2.setPublisher("Pigeon");
		System.out.println(Book2.getAuthor());
		System.out.println(Book2.getPublisher());
		System.out.println(Book2.toString());

		
	}

}
