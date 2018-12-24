package stage2.hw26;

import java.util.Scanner;

/**
 * Write a program that reads two integer numbers from the standard input
 * and outputs them in the reverse order separated by one space.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.printf("%s %s", num2, num1);
    }
}
