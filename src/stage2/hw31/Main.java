package stage2.hw31;

import java.util.Scanner;

/**
 * Write a program that reads a three digit number, calculates the new number by reversing its digits,
 * and outputs a new number.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int first = num / 100;
        int second = (num - first * 100) / 10;
        int third = num - first * 100 - second * 10;

        System.out.print(third);
        System.out.print(second);
        System.out.print(first);
    }
}
