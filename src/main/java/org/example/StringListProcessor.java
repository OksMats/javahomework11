package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringListProcessor {
    public static List<String> sortAndConvertToUpperCase(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "Peter", "Mary", "John", "Anna");
        List<String> result = sortAndConvertToUpperCase(names);
        result.forEach(System.out::println);
    }
}