package com.java.coding.biPredicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> list = List.of(11, 2, 3, 4, 2, 5, 8, 5, 9, 9, 11);
        System.out.println(Arrays.toString(loops(list).toArray()));

    }

    public static List<Integer> loops (List<Integer> list) {
        List<Integer> doubles = new ArrayList<>();
        for (int i = 0; i < list.size(); i++ ) {
            for ( int k = i+1; k < list.size(); k++ ) {
                if (list.get(i) == list.get(k)) {
                    doubles.add(list.get(i));
                }
            }
        }
        return doubles;
    }
}
