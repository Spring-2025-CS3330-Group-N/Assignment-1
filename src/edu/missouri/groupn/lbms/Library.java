package edu.missouri.groupn.lbms;

/**
 * This class stores data relating to a library.
 * The library will contain an array of Book objects within it
 * as well as an integer count of the number of books currently in it.
 */
public class Library {
	/**
	 * Book object array to store books within the library.
	 * Current maximum is set to 5 books.
	 */
	private Book[] books = new Book[5];
	/**
	 * Integer count of number of books currently stored in the library.
	 */
	private int count = 0;
	
	/**
	 * Book Adder:
	 * This method will first check if the library it is called upon is full.
	 * If the library is not full, it will add the passed book to the library and return true.
	 * If the library is full, it will print an error and return false.
	 * @param book Book object to be added to library.
	 * @return Boolean true or false depending on if it is successful (true) or not (false).
	 */
	
	public boolean addBook(Book book) {
		if (this.count >= 5) {
			return false;
		}
		this.books[count] = book;
		this.count++;
		return true;
	}
	
	/**
	 * removeBook:
	 * This method removes a book from the library using the value passed in as a Book argument (if it exists)
	 * @param Book book object to be removed from the library
	 * @return Boolean true upon successful book removal, false if book does not exist in library
	 */
	public boolean removeBook(Book book) {
		for (int i=0; i < ((this.count) -1); i++) {
			// null check
			if (book == null) {
				break;
			}
			// compare book argument to books in the library, delete if a match is found
			if (this.books[i] == book) {
				// System.out.println("Book found in library: " + books[i].toString());
				this.books[i] = null;
				this.count--;
				// System.out.println("Book is successfully removed.");
				return true;
			}
		}
		return false;
	}
	
	/**
	 * searchByISBN:
	 * This method searches for a book using the ISBN value passed in as a String argument
	 * @param String ISBN value used to search for a specific book
	 * @return Book object corresponding to the given ISBN if successful, null if unsuccessful
	 */
	public Book searchByISBN(String ISBN) {
		for (int i=0; i < ((this.count)); i++) {
			if ((this.books[i] != null) && (this.books[i].getISBN()).equalsIgnoreCase(ISBN)) {
				return this.books[i];
			}
		}
		return null;
	}
	
	/**
	 * displayBook:
	 * This method prints details of all books in the library using toString()
	 */
	public void displayBooks() {
		for (int i=0; i < ((this.count)); i++) {
			if (this.books[i] != null) {
				System.out.println(this.books[i].toString());
			}
		}
	}
	
}
