
public class Book {
	private String title, author, publisher, copyrightDate;
	
	//constructor which accepts creates instance data 
	public Book(String newTitle,String newAuthor,String newPublisher,String newCopyrightDate) {
		title = newTitle;
		author = newAuthor;
		publisher = newPublisher;
		copyrightDate = newCopyrightDate;
	}
	//get and set methods for values
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getCrdate() {
		return copyrightDate;
	}
	
	public void setCrdate(String copyrightDate) {
		this.copyrightDate = copyrightDate;
	}
	
	
	public String toString() {
		return "The title of the book is " + title + ".\nThe author is the book is " + author + ".\nThe publisher of the book is " + publisher + ".\nThe copyright date of the book is " + copyrightDate + ".\n";

	}
}
