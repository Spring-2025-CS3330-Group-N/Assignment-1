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
			System.err.println("The library is full!");
			return false;
		}
		this.books[count] = book;
		(this.count)++;
		return true;
	}
}
