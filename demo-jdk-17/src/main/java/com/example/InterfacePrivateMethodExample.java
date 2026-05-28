package com.example;

/**
 * 演示接口中的 private 辅助方法。
 */
public class InterfacePrivateMethodExample {
    public static void main(String[] args) {
        Logger logger = new ConsoleLogger();
        logger.info("系统启动");
        logger.error("连接失败");
    }
}

/**
 * 日志接口，多个 default 方法复用同一个 private 辅助方法。
 */
interface Logger {
    default void info(String message) {
        log("INFO", message);
    }

    default void error(String message) {
        log("ERROR", message);
    }

    private void log(String level, String message) {
        System.out.println("[" + level + "] " + message);
    }
}

/**
 * 最小实现类，直接继承 Logger 的 default 方法。
 */
class ConsoleLogger implements Logger {
}
