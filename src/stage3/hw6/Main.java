package stage3.hw6;

import java.util.Scanner;

/**
 * Write a program that reads a value and checks it is less than 10 and greater than 0.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num < 10 && num > 0);
    }
}