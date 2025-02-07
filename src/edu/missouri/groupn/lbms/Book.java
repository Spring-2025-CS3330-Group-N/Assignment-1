package edu.missouri.groupn.lbms;

public class Book {
	/**
	 * Title of the book as a string
	 */
	private String title;
	/**
	 * Author of the book as a string
	 */
	private String author;
	/**
	 * ISBN number of the book as a string
	 */
	private String ISBN;
	/**
	 * Price of the book as a double
	 */
	private double price;
	/**
	 * Default constructor:
	 * This method initializes a new Book with default values.
	 * Sets all strings to "Unknown" and price to 0.0.
	 */
	public Book() {
		this.title = "Unknown";
		this.author = "Uknown";
		this.ISBN = "Unknown";
		this.price = 0.0;
	}
	
	/**
	 * Parameterized constructor:
	 * This method initializes a new Book with values given by the passed arguments.
	 * @param title Title of the Book
	 * @param author Author of the Book
	 * @param ISBN ISBN of the Book
	 * @param price Price of the Book
	 */
	public Book(String title, String author, String ISBN, double price) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
	}
	
	/**
	 * Copy constructor:
	 * This method initializes a Book copy with the passed Book object.
	 * @param book Book to be copied
	 */
	public Book(Book book) {
		this.title = book.getTitle();
		this.author = book.getAuthor();
		this.ISBN = book.getISBN();
		this.price = book.getPrice();
	}
	
	/**
	 * This method returns the title of the book.
	 * @return Title of the book
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * This method sets the title of the book.
	 * @param title Title of book
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * This method returns the author of the book.
	 * @return Author of the book
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * This method sets the author of the book.
	 * @param author Author of the book
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * This method returns the ISBN of the book.
	 * @return ISBN of the book.
	 */
	public String getISBN() {
		return ISBN;
	}

	/**
	 * This method sets the ISBN of the book.
	 * @param isbn ISBN of the book
	 */
	public void setISBN(String isbn) {
		ISBN = isbn;
	}

	/**
	 * This method returns the price of the book.
	 * @return Price of the book
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * This method sets the price of the book.
	 * @param price Price of the book
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * Returns a string representation of the object.
	 * Formatted as "'title' by 'author' (ISBN: 'isbn', $'price')"
	 * @return String representation of book
	 */
	@Override
	public String toString() {
		return new String (this.title + " by " + this.author + " (ISBN: " + this.ISBN + ", $" + this.price + ")");
	}
	
	/**
	 * Returns if the passed book equals the book the method is called upon by comparing ISBN strings.
	 * @return Boolean True if the book ISBNs are equal and False if not
	 */
	@Override
	public boolean equals(Object book) {
		return (book instanceof Book) && this.ISBN.equals(((Book) book).getISBN());
	}
}
