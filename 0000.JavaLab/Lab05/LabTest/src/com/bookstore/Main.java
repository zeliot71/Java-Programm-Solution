package com.bookstore;

import com.bookstore.books.Book;
import com.bookstore.customers.Customer;

public class Main extends Book{
    public static void main(String[] args) {

        Book book = new Book();
        book.setTitle("Book Title");
        book.setAuthor("Book Author");
        book.setIsbn("Habijabi");
     //  book.setPrice(150);
        System.out.println(book);

        Customer customer = new Customer();
        customer.setName("Customer Name");
        customer.setEmail("@mail.com");
        customer.setId(123);

        System.out.println(customer);
    }
}
