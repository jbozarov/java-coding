package com.java.coding.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employer e1 = new Employer("Ali", 2, 12);
        Employer e2 = new Employer("Bli", 1, 9);
        Employer e3 = new Employer("Cli", 3, 92);

        List<Employer> employerList = new ArrayList<>();

        employerList.add(e3);
        employerList.add(e1);
        employerList.add(e2);

        Collections.sort(employerList);
        employerList.stream().forEach(System.out::println);

        int x = 0;
        int y = 10;
        int z = y / x;
    }
}
