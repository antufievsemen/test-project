package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {
    final List<String> list = List.of("1", "2", "3", "4");

    public void case1() {
        list.stream()
                .peek(System.out::println)
                .findFirst();
        //only 1 element will displayed
    }

    public void case2() {
        list.stream()
                .peek(System.out::println)
                .sorted()
                .findFirst();
        //all will be displayed
    }

    public void case3() {
        list.stream()
                .parallel()
                .peek(System.out::println)
                .findFirst();
        //? element will displayed
    }

    public void case4() {
        final Stream<String> peek = list.stream()
                .parallel()
                .peek(System.out::println);
        peek.findAny();
        //order?
    }

    public void case5() {
        list.stream()
                .peek(System.out::println)
                .findAny();
    }
}
