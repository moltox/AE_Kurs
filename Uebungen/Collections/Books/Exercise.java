package Books;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class Exercise {

	public static Book[] books = new Book[6];
	public static int maxLenAuthor = 0, maxLenTitle = 0, maxLenIssue = 0;

	public Exercise() {
		books[0] = new Book("Goethe", "Faust I", 20_000);
		books[1] = new Book("Schiller", "Wilhelm Tell", 10_000);
		books[2] = new Book("J.R.R. Tolkien", "Das Silmarillion", 32_000);
		books[3] = new Book("Stephen Hawking", "Eine kurze Geschichte der Zeit", 64_000);
		books[4] = new Book("Mario Puzo", "Der Pate", 128_000);
		books[5] = new Book("Fontane", "Effi Briest", 10_000);
		// Get Max Lengths;
		for (Book b : books) {
			maxLenAuthor = (b.getAuthor().length() > maxLenAuthor) ? b.getAuthor().length() : maxLenAuthor;
			maxLenTitle = (b.getTitle().length() > maxLenTitle) ? b.getTitle().length() : maxLenTitle;
			int issueLen = String.valueOf(b.getIssue()).length();
			maxLenIssue = (issueLen > maxLenIssue) ? issueLen : maxLenIssue;
		}

	}
	
	private static void printArrayList(ArrayList<Book> l){
		String[] spaces = {null, null, null};
		for(Book b : l){
			spaces[0] = new String(new char[maxLenAuthor - b.getAuthor().length() + 1]).replace("\0", " ");
			spaces[1] = new String(new char[maxLenTitle - b.getTitle().length()+1]).replace("\0", " ");
			spaces[2] = new String(new char[maxLenIssue - String.valueOf(b.getIssue()).length() +1]).replace("\0", " ");
			System.out.println(b.getAuthor()+spaces[0]+"\""+b.getTitle()+"\""+spaces[1]+"Auflage: "+b.getIssue()+spaces[2]+"Stueck");
		}
	}
	
	@SuppressWarnings("unused")
	private static void part6() {
		ArrayList<Book> bookList = new ArrayList<Book>(6);
		for(Book b : books){
			bookList.add(b);
		}
		//Ausgabe der Liste unsortiert
		printArrayList(bookList);	
		System.out.println("\n*** in umgekehrter Reihenfolge ***\n");
		Collections.reverse(bookList);
		printArrayList(bookList);
		System.out.println("\n*** in sortierter, umgekehrter Reihenfolge ***\n");
		Collections.sort(bookList);
		printArrayList(bookList);
	};

	private static void part7() {
		System.out.println("PART7 CALLED");
	};

	private static void part8() {
		System.out.println("PART8 CALLED");
	}

	private static void callMethod(String arg) {
		try {
			Method m;
			m = Exercise.class.getDeclaredMethod("part" + arg);
			try {
				m.invoke(null);
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				System.out.println("Methode : \"part" + arg + "\" konnte nicht aufgerufen werden");
			}
		} catch (NoSuchMethodException e) {
			System.out.println("Methode : \"part" + arg + "\" nicht Implementiert");
		}
	}

	public static void main(String[] args) {
		Exercise exe = new Exercise();
		if (args.length == 1) {
			callMethod(args[0]);
		} else {
			System.out.println("Programm erwartet 1 Argument: " + "\n6 - Ausgabe als ArrayList"
					+ "\n7 - HashMap Implementierung" + "\n8 - Set Implementierung");
		}
	}

}
