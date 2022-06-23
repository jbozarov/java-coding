package com.java.coding.exception.numberException;

public class Main {
    public static void main(String[] args) {

        try {
            if (!getPositiveNumber(-12, 2)) {
                throw new InvalidNumberExceptionDemo();
            }
        } catch (InvalidNumberExceptionDemo invalidNumberExceptionDemo) {
            System.out.println();
            invalidNumberExceptionDemo.printStackTrace();
        }
    }

    public static boolean getPositiveNumber(int a, int b) {
        if (a > 0 && b > 0) {
            return true;
        } else if ( a - b > 0 ) {
            return true;
        } else if ( a / b > 0 ) {
            return true;
        }
        return false;
    }
}
