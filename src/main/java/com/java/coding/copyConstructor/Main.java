package com.java.coding.copyConstructor;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(1, "bookOne");
        Book bookCopy = new Book(book1);

        System.out.println(bookCopy.getId());
        System.out.println(bookCopy.getName());
    }
}
