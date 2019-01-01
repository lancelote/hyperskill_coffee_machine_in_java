package stage3.hw1;

import java.util.Scanner;

/**
 * Write a program that reads a value and check it is less than 10.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num < 10);
    }
}