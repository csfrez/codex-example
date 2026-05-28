package com.example;

/**
 * 演示文本块，用于书写多行字符串。
 */
public class TextBlockExample {
    public static void main(String[] args) {
        String json = """
                {
                  "name": "Tom",
                  "age": 18,
                  "city": "Shanghai"
                }
                """;

        String sql = """
                SELECT id, name, age
                FROM users
                WHERE age >= 18
                ORDER BY id DESC
                """;

        System.out.println(json);
        System.out.println(sql);
    }
}
