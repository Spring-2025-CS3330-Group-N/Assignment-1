package edu.missouri.groupn.lbms;

public class Test {
	public static void main(String[] args) {
		var library = new Library();
		
		var books = new Book[]{
			new Book(
				"Clean Code",
				"Robert C. Martin",
				"978-0135166307",
				40.99
			),
			new Book(
				"Design Patterns",
				"Erich Gamma",
				"978-0201633610",
				50.99
			),
			new Book(
				"The Pragmatic Programmer",
				"Andrew Hunt",
				"978-0135957059",
				45.99
			)
		};
		
		if (Test.addBooks(library, books, 3)) {
			System.out.println("Books added successfully.");
			System.out.println();
		}
		
		var isbn = "978-0135166307";
		var book = Test.searchForBook(library, isbn);
		
		System.out.println();
		
		Test.displayLibrary(library);
		
		System.out.println();
		
		Test.attemptRemoveBook(library, book); // this should succeed
		
		System.out.println();
		
		Test.attemptRemoveBook(library, book); // this should fail
		
		System.out.println();
		
		Test.displayLibrary(library);
	}
	
	public static boolean addBooks(Library library, Book[] books, int length) {
		System.out.println("Adding books...");
		for (int i = 0; i < 3; ++i) {
			if (!library.addBook(books[i])) {
				System.err.println("The library is full!");
				return false;
			}
		}
		return true;
	}
	
	public static Book searchForBook(Library library, String isbn) {
		System.out.println("Searching for book with ISBN: " + isbn);
		var book = library.searchByISBN(isbn);
		System.out.println("Book found: " + book);
		return book;
	}
	
	public static void displayLibrary(Library library) {
		System.out.println("All books in the library:");
		library.displayBooks();
	}
	
	public static void attemptRemoveBook(Library library, Book book) {
		if (library.removeBook(book)) {
			System.out.println("Removed book: " + book); 
		} else {
			System.out.println("Cannot Remove book " + book + ", book does not exist!");
		}
	}
}
