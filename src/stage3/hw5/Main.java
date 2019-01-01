package stage3.hw5;

import java.util.Scanner;

/**
 * Write a program that reads the numbers a, b, c and checks if any pair them sums to 20.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        boolean pair1 = num1 + num2 == 20;
        boolean pair2 = num2 + num3 == 20;
        boolean pair3 = num3 + num1 == 20;

        System.out.println(pair1 || pair2 || pair3);
    }
}