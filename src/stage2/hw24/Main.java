package stage2.hw24;

import java.util.Scanner;

/**
 * Write a program that reads four integer numbers from one line and prints them each in a new line.
 * In the input line numbers are separated by one or more spaces.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
    }
}