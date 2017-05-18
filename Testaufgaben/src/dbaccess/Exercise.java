package dbaccess;

import java.util.*;

public class Exercise {

	Exercise(String[] args) {
		
		String s = "";
		Book[] bookList = new Book[6];
		for(int i = 0; i < 6; i++) {
			s = String.valueOf(i);
			bookList[0] = new Book(s,s,s);
			
		if(args[0] == String.valueOf(6)) {
			part6(bookList);
		}
		if (args[0] == String.valueOf(7)) {
			part7();
		}
		if (args[0] == String.valueOf(8)) {
			part8();
		}			
	}
	public void part6(Book bookList[]) {
		ArrayList<Book> arrList = new ArrayList<Book>();
		
		for (int i = 0; i<6; i++) {
			arrList.add(bookList[i]);
		}
		
		
	}	
	
	public static void main (String[] args) {		
				
	}
}
