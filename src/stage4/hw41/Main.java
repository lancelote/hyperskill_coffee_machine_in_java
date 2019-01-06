package stage4.hw41;

import java.util.Scanner;

/**
 * Given the method named divide that takes two long numbers and returns a double value.
 * <p>
 * Write a body of the method. It should return the result of the division the first argument by the second one.
 * It's guaranteed the second argument is not equal to zero.
 */
public class Main {

    public static double divide(long a, long b) {
        return a / (double) b;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final long a = scanner.nextLong();
        final long b = scanner.nextLong();
        System.out.println(divide(a, b));
    }
}