package stage2.hw41;

import java.util.Scanner;

/**
 * Given a non-negative integer N (0 ≤ N ≤ 1000000), find the number of tens in it (i.e. next to last digit of the
 * number). If there is no next to last digit, you can consider that the number of tens equals to zero.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println((num % 100) / 10);
    }
}