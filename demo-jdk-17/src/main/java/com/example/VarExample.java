package com.example;

import java.util.List;
import java.util.Map;

/**
 * 演示 var 局部变量类型推断。
 */
public class VarExample {
    public static void main(String[] args) {
        var name = "Tom";
        var age = 18;
        var users = List.of("Alice", "Bob", "Cindy");
        var scores = Map.of("Alice", 90, "Bob", 85);

        System.out.println(name);
        System.out.println(age);
        System.out.println(users);
        System.out.println(scores);
    }
}
