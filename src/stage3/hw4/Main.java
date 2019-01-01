package stage3.hw4;

import java.util.Scanner;

/**
 * Write a program that reads three numbers and checks that they are different
 * (i.e. no one number is not equal any other).
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.println(num1 != num2 && num2 != num3 && num3 != num1);
    }
}