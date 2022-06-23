package com.java.coding.exception.numberException;

public class InvalidNumberExceptionDemo extends Exception {
    public InvalidNumberExceptionDemo() {
        super("Number is invalid");
    }

    public InvalidNumberExceptionDemo(String message) {
        super(message);
    }
}
