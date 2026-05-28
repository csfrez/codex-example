package com.example;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 演示不可变集合工厂方法。
 */
public class CollectionFactoryExample {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Cindy");
        Set<String> roles = Set.of("ADMIN", "USER");
        Map<String, Integer> scores = Map.of(
                "Alice", 90,
                "Bob", 85
        );

        System.out.println(names);
        System.out.println(roles);
        System.out.println(scores);
    }
}
