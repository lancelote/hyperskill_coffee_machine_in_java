package stage4.hw19;

import java.util.Scanner;

/**
 * Given the sequence of natural numbers. Find the sum of numbers divisible by 6. The input is the number of elements
 * in the sequence, and then the elements themselves. In this sequence, there is always a number divisible by 6.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < total; i++) {
            int num = scanner.nextInt();
            if (num % 6 == 0) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}