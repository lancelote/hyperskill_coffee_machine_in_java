package stage4.hw40;

import java.util.Scanner;

/**
 * Write a method that tests the given number is composite or not. The composite number is a positive integer that
 * has at least one divisor other than 1 and itself.
 * <p>
 * The method should return a value of the boolean type.
 */
public class Main {

    public static boolean isComposite(long number) {
        for (long i = 2; i < number / 2 + 1; i++) {
            if (number % i == 0) {
                return true;
            }
        }
        return false;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long number = scanner.nextLong();
        System.out.println(isComposite(number));
    }
}