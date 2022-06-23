package com.java.coding.comparable;


import com.java.coding.comparator.EmployerNameComparator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employer implements Comparable<Employer> {
    private String name;
    private int id;
    private int salary;


    @Override
    public int compareTo(Employer o) {
        if (salary > o.getSalary()) {
            return 1;
        } else if (salary < o.getSalary()) {
            return -1;
        }
        return 0;
    }
}
