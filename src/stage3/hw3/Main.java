package stage3.hw3;

import java.util.Scanner;

/**
 * Write a program that reads three integer numbers and prints true if exactly one number is positive.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        boolean onlyNum1 = num1 > 0 && num2 <= 0 && num3 <= 0;
        boolean onlyNum2 = num2 > 0 && num1 <= 0 && num3 <= 0;
        boolean onlyNum3 = num3 > 0 && num1 <= 0 && num2 <= 0;

        System.out.println(onlyNum1 || onlyNum2 || onlyNum3);
    }
}