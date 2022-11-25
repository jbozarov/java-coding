package com.java.coding.copyConstructor;

public class Book {
    private int id;
    private String name;

    public Book () {

    }

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Book(Book book) {
        this.id = book.getId();
        this.name = book.getName();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
