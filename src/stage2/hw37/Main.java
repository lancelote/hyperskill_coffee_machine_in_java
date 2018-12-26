package stage2.hw37;

import java.util.Scanner;

/**
 * Write a program that will help people who are going on vacation. The program should calculate the total
 * required sum (e.g. $) of money to have a good rest for a given duration.
 * <p>
 * There are four parameters which have to be considered:
 * <p>
 * duration in days
 * total food cost per a day
 * one-way flight cost
 * cost of one night in a hotel (the number of nights equal duration minus one)
 * <p>
 * Read values of these parameters from the standard input and then print the result.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = scanner.nextInt();
        int foodCost = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int nightCost = scanner.nextInt();

        int result = foodCost * days + flightCost * 2 + nightCost * (days - 1);
        System.out.println(result);
    }
}