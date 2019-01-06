package stage4.hw34;

import java.util.Scanner;

/**
 * Write a program that reads a sequence of integer numbers in a loop and adds up all numbers. If a new number is equal
 * to 0, the program must stop the loop and output the accumulated sum. If the sum is greater than or equal to 1000
 * (the barrier) the program also should stop the loop and output the value equal to sum - 1000.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        do {
            int num = scanner.nextInt();
            sum += num;
            if (num == 0) {
                break;
            } else if (sum >= 1000) {
                sum -= 1000;
                break;
            }
        } while (true);
        System.out.println(sum);
    }
}