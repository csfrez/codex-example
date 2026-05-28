package com.example;

/**
 * 演示 switch 表达式，包括箭头标签和返回值。
 */
public class SwitchExpressionExample {
    public static void main(String[] args) {
        int status = 2;

        String result = switch (status) {
            case 1 -> "成功";
            case 2 -> "处理中";
            case 3 -> "失败";
            default -> "未知状态";
        };

        System.out.println(result);
    }
}
