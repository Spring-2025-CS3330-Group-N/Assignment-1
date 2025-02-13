package edu.missouri.groupn.lbms;

/**
 * LibraryApp testing class for Library Book Management System
 */
public class LibraryApp {
	public static void main(String[] args) {
		// Create a new Library and books to add to it
		Library library = new Library();
		Book book1 = new Book("The History", "Keehin", "12345678", 40.00);
		Book book2 = new Book("Science World", "Keehin", "1232034", 400.00);
		Book book3 = new Book("Tech Town", "Keehin", "9090909090", 4000.00);
		Book book4 = new Book("Lab Help 101", "Keehin", "203459", 0.01);
		// Print each book that was added successfully.
		System.out.println("Adding books...");
		if (library.addBook(book1)) {
			System.out.println(book1 + " added successfully.");
		}
		if (library.addBook(book2)) {
			System.out.println(book2 + " added successfully.");
		}
		if (library.addBook(book3)) {
			System.out.println(book3 + " added successfully.");
		}
		System.out.println("");
		System.out.println("Searching for book with ISBN: " + book3.getISBN());
		System.out.println("Book found: " + library.searchByISBN(book3.getISBN()));
		System.out.println("");
		System.out.println("All books in the library:");
		library.displayBooks();
		System.out.println("");
		System.out.println("Removing book: " + book2);
		// Try to remove book, if successful, print that it was, or if not, print that it wasn't.
		if (library.removeBook(book2)) {
			System.out.println("Removal was successful.");
		} else {
			System.out.println("Removal was unsuccessful.");
		}
		System.out.println("");
		System.out.println("All books in the library:");
		library.displayBooks();
		System.out.println("");
		System.out.println("Removing book: " + book4);
		if (library.removeBook(book4)) {
			System.out.println("Removal was successful.");
		} else {
			System.out.println("Removal was unsuccessful.");
		}
	}

}