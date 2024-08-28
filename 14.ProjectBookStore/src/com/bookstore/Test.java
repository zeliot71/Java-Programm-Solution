package com.bookstore;

import com.bookstore.books.Book;
import com.bookstore.customers.Customer;

public class Test {
    public static void main(String[] args) {
        Book book = new Book("Al-Quran","Creator","TheOnlyUniqueBookInTheWorld");
        System.out.println(book);

        Customer customer = new Customer("Mankind","HumanKind@www.universe",100002123);
        System.out.println(customer);
    }
}
