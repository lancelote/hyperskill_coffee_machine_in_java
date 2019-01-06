package stage4.hw39;

import java.util.Scanner;

/**
 * Write a method that calculates the factorial of a given number.
 * <p>
 * The factorial of n is calculated by the product of integer number from 1 to n (inclusive).
 * The factorial of 0 is equal to 1.
 */
public class Main {

    public static long factorial(long n) {
        long result = 1;
        while (n != 0) {
            result *= n;
            n -= 1;
        }
        return result;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}