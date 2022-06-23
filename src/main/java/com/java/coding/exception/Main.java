package com.java.coding.exception;

public class Main extends Exception {
    public static void main(String[] args) throws ExceptionClassDemo {
        // System.out.println(devide(23, 2));
        // System.out.println(devide(23, 0)); // throws exception

        devideTwo(23, 3);
        devideTwo(34, 0);



    }

    public static int devide(int a, int b) {
        return a/b;
    }

    public static void devideTwo  (int a, int b) throws ExceptionClassDemo {
        try {
            int i = a / b;
            System.out.println(i);
            throw new ExceptionClassDemo("not null");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
