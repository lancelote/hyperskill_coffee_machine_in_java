package stage4.hw43;

import java.util.Scanner;

/**
 * Given the method power that takes two int numbers n and m.
 * The method should return the value of n^m as a long value.
 */
public class Main {

    public static long power(int n, int m) {
        return (long) Math.pow(n, m);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        System.out.println(power(n, m));
    }
}