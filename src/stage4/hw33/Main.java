package stage4.hw33;

import java.util.Scanner;

/**
 * Write a program that reads a sequence of integer numbers and outputs true if the sequence is ordered
 * (in ascending or descending order), otherwise, false. Keep in mind, if a number has the same value as the following
 * number, it does not break the order.
 * <p>
 * The sequence ends with 0. Do not consider this number as a part of the sequence. The sequence always has at least
 * one number (excluding 0).
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int prev = scanner.nextInt();

        boolean ascending = true;
        boolean switched = false;
        boolean ok = true;

        do {
            int num = scanner.nextInt();

            // Stop
            if (num == 0) {
                break;
            }

            // If ascending/descending is not yet clear
            if (!switched) {
                if (num < prev) {
                    ascending = false;
                    switched = true;
                } else if (num > prev) {
                    switched = true;
                }
            }

            // If next num is not ok
            if (ascending && num < prev || !ascending && num > prev) {
                ok = false;
            }

            prev = num;
        } while (true);

        System.out.println(ok);
    }
}