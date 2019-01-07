package stage4.hw46;

import java.util.Scanner;

/**
 * Write a method with the name sign that takes an int number and checks the number is negative, positive or zero.
 * The method should return -1, +1 or 0 respectively.
 */
public class Main {

    public static int sign(int number) {
        if (number > 0) {
            return +1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(sign(n));
    }
}