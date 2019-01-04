package stage4.hw22;

import java.util.Scanner;

/**
 * Given natural number n. Generate a sequence of integers, described in the Collatz conjecture:
 * <p>
 * If n is an even number, divide it in half, if it is odd, multiply it by 3 and add 1. Repeat this operation until
 * we get the number 1 as a result.
 * <p>
 * For example, if the number n = 17, then the sequence looks as the following:
 * <p>
 * 17 52 26 13 40 20 10 5 16 8 4 2 1
 * <p>
 * Such a sequence will stop at number 1 for any primary natural number n.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        while (num != 1) {
            System.out.print(num + " ");
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = 3 * num + 1;
            }
        }
        System.out.println(num);
    }
}