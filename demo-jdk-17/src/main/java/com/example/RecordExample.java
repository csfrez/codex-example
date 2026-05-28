package com.example;

/**
 * 演示 record 记录类，用于简洁地定义不可变数据载体。
 */
public class RecordExample {
    public static void main(String[] args) {
        User user = new User(1L, "Tom", 18);

        System.out.println(user.id());
        System.out.println(user.name());
        System.out.println(user.age());
        System.out.println(user);
    }
}

/**
 * record 会自动提供构造方法、访问器、equals、hashCode 和 toString。
 */
record User(Long id, String name, int age) {
}
