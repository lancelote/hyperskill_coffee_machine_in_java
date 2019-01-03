package stage4.hw11;

import java.util.Scanner;

/**
 * Write a program that prints the product of all integer numbers from a to b (a < b).
 * <p>
 * Include a and exclude b from the product.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long start = scanner.nextLong();
        long end = scanner.nextLong();

        long result = 1;

        for (long i = start; i < end; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}