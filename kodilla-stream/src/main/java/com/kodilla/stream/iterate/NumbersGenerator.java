package com.kodilla.stream.iterate;

import java.util.stream.*;

public final class NumbersGenerator {
    public static void generateEven(int max) {
        Stream.iterate(11, n -> n + 1)
                .limit(max)
                .filter(n -> n % 3 == 0)
                .forEach(System.out::println);
    }
}