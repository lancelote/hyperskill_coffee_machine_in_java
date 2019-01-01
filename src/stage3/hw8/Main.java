package stage3.hw8;

import java.util.Scanner;

/**
 * Write a program that reads three integer numbers and prints true if the first number is between the second
 * and the third one (inclusive). Otherwise, it must print false.
 * <p>
 * The sorting order of two last arguments can be any.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.println(num1 >= num2 && num1 <= num3 || num1 >= num3 && num1 <= num2);
    }
}