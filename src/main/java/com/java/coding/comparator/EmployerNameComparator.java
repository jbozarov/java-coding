package com.java.coding.comparator;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Comparator;

@NoArgsConstructor
@Data
public class EmployerNameComparator implements Comparator<Employer> {
    @Override
    public int compare(Employer o1, Employer o2) {
        if (o1.getName().compareTo(o2.getName()) > 0) {
            return 1;
        } else if (o1.getName().compareTo(o2.getName()) == 0) {
            return 0;
        }
        return -1;
    }
}
