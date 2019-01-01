package stage3.hw13;

import java.util.Scanner;

/**
 * Write a program that reads the number and prints YES if it is positive. Otherwise, the program should print NO.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}