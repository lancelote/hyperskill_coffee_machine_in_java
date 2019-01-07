package stage4.hw45;

import java.util.Scanner;

/**
 * Implement a method sumInRange for calculating the sum of numbers in the range from (inclusive), to (exclusive).
 */
public class Main {

    /**
     * The method calculates the sum of integers in a given range
     *
     * @param from inclusive
     * @param to   exclusive
     * @return the sum (long)
     */
    public static long sumInRange(int from, int to) {
        long sum = 0;
        for (int i = from; i < to; i++) {
            sum += i;
        }
        return sum;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int from = scanner.nextInt();
        int to = scanner.nextInt();

        System.out.println(sumInRange(from, to));
    }
}