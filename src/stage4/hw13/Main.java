package stage4.hw13;

import java.util.Scanner;

/**
 * Write a program that reads two numbers a and b from the keyboard and calculates and outputs to the console the
 * arithmetic average of all numbers from the interval [a; b], which are divisible by 3.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        double sum = 0;
        double count = 0;

        for (double i = start; i <= end; i++) {
            if (i % 3 == 0) {
                sum += i;
                count += 1;
            }
        }
        System.out.println(sum / count);
    }
}