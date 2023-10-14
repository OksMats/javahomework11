package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayProcessor {
    public static String extractAndSortNumbers(String[] inputArray) {
        String result = Arrays.stream(inputArray)
                .flatMap(str -> Arrays.stream(str.split(",\\s*")))
                .map(String::trim)
                .map(Integer::parseInt)
                .sorted()
                .map(Object::toString)
                .collect(Collectors.joining(", "));

        return result;
    }

    public static void main(String[] args) {
        String[] inputArray = {"1, 2, 0", "4, 5"};
        String result = extractAndSortNumbers(inputArray);
        System.out.println(result);
    }
}
