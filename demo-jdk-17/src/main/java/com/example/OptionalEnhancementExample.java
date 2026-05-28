package com.example;

import java.util.Optional;

/**
 * 演示 Optional 增强方法，例如 ifPresentOrElse、or 和 stream。
 */
public class OptionalEnhancementExample {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Tom");
        Optional<String> empty = Optional.empty();

        name.ifPresentOrElse(
                value -> System.out.println("姓名：" + value),
                () -> System.out.println("姓名为空")
        );

        String result = empty
                .or(() -> Optional.of("默认用户"))
                .get();

        System.out.println(result);

        long count = name.stream().count();
        System.out.println(count);
    }
}
