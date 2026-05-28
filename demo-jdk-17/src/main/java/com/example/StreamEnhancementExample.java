package com.example;

import java.util.List;
import java.util.stream.Stream;

/**
 * 演示 Stream 增强方法，例如 takeWhile、dropWhile 和 ofNullable。
 */
public class StreamEnhancementExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 1, 2);

        numbers.stream()
                .takeWhile(n -> n < 4)
                .forEach(System.out::println);

        System.out.println("---");

        numbers.stream()
                .dropWhile(n -> n < 4)
                .forEach(System.out::println);

        System.out.println("---");

        Stream.ofNullable(null)
                .forEach(System.out::println);

        Stream.ofNullable("hello")
                .forEach(System.out::println);
    }
}
