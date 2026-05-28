package com.example;

/**
 * 演示 sealed 密封类，用于限制哪些类可以继承指定类型。
 */
public class SealedClassExample {
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        Shape rectangle = new Rectangle(10, 20);

        System.out.println(circle.area());
        System.out.println(rectangle.area());
    }
}

/**
 * 密封基类，只允许 Circle 和 Rectangle 继承。
 */
sealed abstract class Shape permits Circle, Rectangle {
    abstract double area();
}

/**
 * Shape 允许的 final 子类。
 */
final class Circle extends Shape {
    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

/**
 * Shape 允许的 final 子类。
 */
final class Rectangle extends Shape {
    private final double width;
    private final double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}
