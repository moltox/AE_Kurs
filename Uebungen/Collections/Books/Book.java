package Books;

public class Book {
	private String author;
	private String title;
	private int issue;
	
	public Book(String author, String title, int issue) {
		setAuthor(author);
		setTitle(title);
		setIssue(issue);
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getIssue() {
		return issue;
	}

	public void setIssue(int issue) {
		this.issue = issue;
	}
}
