package edu.missouri.groupn.lbms;

public class Book {
	public Book() {
		this.title = "Unknown";
		this.author = "Uknown";
		this.ISBN = "Unknown";
		this.price = 0.0;
	}
	
	public Book(String title, String author, String ISBN, double price) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
	}
	
	public Book(Book book) {
		this.title = book.getTitle();
		this.author = book.getAuthor();
		this.ISBN = book.getISBN();
		this.price = book.getPrice();
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "";
	}
	
	@Override
	public boolean equals(Object book) {
		return (book instanceof Book) && this.ISBN.equals(((Book) book).getISBN());
	}

	private String title;
	private String author;
	private String ISBN;
	private double price;
}
