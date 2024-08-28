package com.bookstore.books;

public class Book {
    private String title;
    private String author;
    private String isbn;
    double price;

/*    public Book(String title, String author, String isbn, double price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }*/

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
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
     double getPrice() {
        return price;
    }
     void setPrice(double price) {
        this.price = price;

    }
    public String toString() {
        return getTitle() + " " + getAuthor() + " " + getIsbn()+" " + getPrice();
    }
}
