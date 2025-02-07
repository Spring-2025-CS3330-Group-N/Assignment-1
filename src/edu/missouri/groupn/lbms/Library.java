package edu.missouri.groupn.lbms;

public class Library {	
	private Book[] books = new Book[5];
	private int count = 0;
	
	public boolean addBook(Book book) {
		if (this.count >= 5) {
			System.err.println("The library is full!");
			return false;
		}
		this.books[count] = book;
		(this.count)++;
		return true;
	}
}
