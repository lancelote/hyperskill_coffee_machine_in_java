package stage2.hw30;

import java.util.Scanner;

/**
 * Write a program that reads an integer value n from the standard input and outputs the result of the following
 * arithmetic expression:
 * <p>
 * ((n + 1) * n + 2) * n + 3
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = ((n + 1) * n + 2) * n + 3;
        System.out.println(result);
    }
}