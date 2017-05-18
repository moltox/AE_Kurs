package dbaccess;

public class Book {
	private String author;
	private String title;
	private String issue;
	
	Book (String author, String title, String issue) {
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

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}
}
