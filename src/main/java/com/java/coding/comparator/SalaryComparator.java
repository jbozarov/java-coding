package com.java.coding.comparator;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employer> {
    @Override
    public int compare(Employer o1, Employer o2) {
        if (o1.getSalary() > o2.getSalary()) {
            return 1;
        } else if (o1.getSalary() < o2.getSalary()) {
            return -1;
        }
        return 0;
    }
}
