package com.java.coding.biPredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionalChain {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        List<Integer> allFunctions = list
                .stream()
                .map(FunctionalChain::func10)
                .map(FunctionalChain::func20)
                .map(FunctionalChain::func30)
                .map(FunctionalChain::func40)
                .collect(Collectors.toList());

        System.out.println(Arrays.toString(allFunctions.toArray())); // [240000, 480000, 720000, 960000, 1200000]


        Function<Integer, Integer> function10 = i -> i * 10;
        Function<Integer, Integer> function20 = i -> i * 20;
        Function<Integer, Integer> function30 = i -> i * 30;
        Function<Integer, Integer> function40 = i -> i * 40;

        List<Integer> allFunctionChain = list
                .stream()
                .map(function10)
                .map(function20)
                .map(function30)
                .map(function40)
                .collect(Collectors.toList());

        System.out.println(Arrays.toString(allFunctionChain.toArray())); // [240000, 480000, 720000, 960000, 1200000]

        Integer i = function10.andThen(function20).andThen(function30).andThen(function40).apply(30);
        System.out.println("i is " + i); // i is 7200000

        List<Integer> chain = list.stream().map(function10.andThen(function20.andThen(function30.andThen(function40)))).collect(Collectors.toList());
        System.out.println(Arrays.toString(chain.toArray())); // [240000, 480000, 720000, 960000, 1200000]
    }

    public static Integer func10(Integer i) {
        return i * 10;
    }


    public static Integer func20(Integer i) {
        return i * 20;
    }


    public static Integer func30(Integer i) {
        return i * 30;
    }


    public static Integer func40(Integer i) {
        return i * 40;
    }

}
