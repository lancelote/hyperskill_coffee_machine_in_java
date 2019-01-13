package stage6.hw18;

import java.util.Scanner;

/**
 * Given a class named Circle. The class has one double field radius.
 * <p>
 * Write two instance methods for this class:
 * <p>
 * - getLength returns the double length of the circumference﻿ of this circle;
 * - getArea returns the double area of this circle;
 * <p>
 * You may use the special constant Math.PI.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        Circle circle = new Circle();
        circle.radius = radius;
        System.out.println(circle.getLength() + " " + circle.getArea());
    }
}

class Circle {

    double radius;

    public double getLength() {
        return 2 * Math.PI * this.radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
}