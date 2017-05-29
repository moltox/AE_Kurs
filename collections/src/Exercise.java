import java.util.*;

// ToDo 7 und 8

public class Exercise implements Comparator<Book> {

	Exercise(String option) {
		
		String s = "";
		Book[] bookList = new Book[6];
		for(int i = 0; i < bookList.length; i++) {
			s = String.valueOf(i);
			bookList[i] = new Book(s,s,s);
		} 
		if(option == "6") {
			part6(bookList);
		}
/*		if (args[0] == String.valueOf(7)) {
			part7();
		}
		if (args[0] == String.valueOf(8)) {
			part8();
		}
*/	
	}
	public void part6(Book bookList[]) {
		ArrayList<Book> arrBookList = new ArrayList<Book>();
		
		for (int i = 0; i<bookList.length; i++) {
			arrBookList.add(bookList[i]);
		}
		Iterator<Book> bookIter = arrBookList.iterator();
		
		// ...einfach ausgeben
		while(bookIter.hasNext()) {
			Book book = bookIter.next();
			System.out.println(book.getAuthor()+": "+"\""+
								book.getTitle()+"\"\tAuflage: " +book.getIssue());
		}
		
		// sortiert ausgeben
		Collections.sort(arrBookList);
		Iterator<Book> bookIterSortiert = arrBookList.iterator();
		while(bookIterSortiert.hasNext()) {
			Book book = bookIterSortiert.next();
			System.out.println(book.getAuthor()+": "+"\""+
								book.getTitle()+"\"\tAuflage: " +book.getIssue());
		}
		
		// absteigend sortiert ausgeben
		Collections.sort(arrBookList, new Comparator<Book>() {
			// @Override
			public int compare(Book book1, Book book2) {
				return book1.getAuthor().compareToIgnoreCase(book2.getAuthor()) * -1;
			}
		});
		Iterator<Book> bookIterAbsteigendSortiert = arrBookList.iterator();
		while(bookIterAbsteigendSortiert.hasNext()) {
			Book book = bookIterAbsteigendSortiert.next();
			System.out.println(book.getAuthor()+": "+"\""+
								book.getTitle()+"\"\tAuflage: " +book.getIssue());
		} 


	}	
	
	public static void main (String[] args) {		
		new Exercise("6");
	}
}
