package com.java.coding.kids.projects;

import java.util.Scanner;

public class EvenNumberChecker {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the number you want to check:");
        int n = s.nextInt();

        if ( n%2 == 0 ) {
            System.out.println(n + " is even number");
        } else {
            System.out.println(n + " is an odd number");
        }


        for ( int i = 0; i <= n; i++ ) {
            System.out.println("Counting from 0 to  " + n + " and next number is " + i);
        }
        System.out.println(" ");
        System.out.println("Counting is done !");

    }
}
