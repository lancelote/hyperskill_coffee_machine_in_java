package stage2.hw28;

import java.util.Scanner;

/**
 * Write a program that reads two lines and two numbers (in one line)
 * and outputs them in the same order, each in a new line.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(num1);
        System.out.println(num2);
    }
}