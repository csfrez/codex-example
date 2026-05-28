package com.example;

/**
 * 演示 String 增强方法，例如 isBlank、strip、repeat、lines 和 formatted。
 */
public class StringEnhancementExample {
    public static void main(String[] args) {
        String blank = "   ";
        String text = "  hello  ";
        String multiLine = "a\nb\nc";

        System.out.println(blank.isBlank());
        System.out.println(text.strip());
        System.out.println("Java".repeat(3));

        multiLine.lines()
                .forEach(System.out::println);

        String message = "name=%s, age=%d".formatted("Tom", 18);
        System.out.println(message);
    }
}
