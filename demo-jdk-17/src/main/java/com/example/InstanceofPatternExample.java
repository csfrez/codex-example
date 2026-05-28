package com.example;

/**
 * 演示 instanceof 模式匹配。
 */
public class InstanceofPatternExample {
    public static void main(String[] args) {
        printLength("Hello JDK 17");
        printLength(123);
    }

    static void printLength(Object obj) {
        if (obj instanceof String text) {
            System.out.println("字符串长度：" + text.length());
        } else {
            System.out.println("不是字符串：" + obj);
        }
    }
}
