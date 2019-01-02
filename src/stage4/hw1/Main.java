package stage4.hw1;

import java.util.Scanner;

/**
 * Write a program that reads four numbers and decrements each of them.
 * The program must output the results in the same order separated by spaces.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        System.out.printf("%s %s %s %s", --num1, --num2, --num3, --num4);
    }
}