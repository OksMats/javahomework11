package org.example;

import java.util.stream.Stream;

public class StreamZipper {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        var firstIterator = first.iterator();
        var secondIterator = second.iterator();
        Stream.Builder<T> builder = Stream.builder();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            builder.accept(firstIterator.next());
            builder.accept(secondIterator.next());
        }
        return builder.build();
    }

    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3);
        Stream<Integer> stream2 = Stream.of(4, 5, 6, 7);
        Stream<Integer> zippedStream = zip(stream1, stream2);
        zippedStream.forEach(System.out::println);
    }
}
