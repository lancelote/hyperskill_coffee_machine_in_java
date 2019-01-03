package stage4.hw10;

import java.util.Scanner;

/**
 * Write a program that reads a, b, n and outputs the count of numbers divisible by n in the range from a to b (a < b)
 * inclusively.
 * <p>
 * Note:  it's possible to write this program more efficiently without any loops. Think about it after you write the
 * solution with a loop.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int n = scanner.nextInt();
        int result = 0;

        for (int i = start; i < end + 1; i++) {
            if (i % n == 0) {
                result++;
            }
        }
        System.out.println(result);
    }
}