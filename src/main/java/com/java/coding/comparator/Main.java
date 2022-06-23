package com.java.coding.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

        System.out.println("Default: ");
        employerList.stream().forEach(System.out::println); // C, A, B
        System.out.println("-------------------------------");


        EmployerNameComparator employerNameComparator = new EmployerNameComparator();
        Collections.sort(employerList, employerNameComparator);
        employerList.stream().forEach(System.out::println); // By name: A, B, C
        System.out.println("-------------------------------");

        SalaryComparator salaryComparator = new SalaryComparator();
        Collections.sort(employerList, salaryComparator);
        employerList.stream().forEach(System.out::println); // By salary B, A, C
    }
}
