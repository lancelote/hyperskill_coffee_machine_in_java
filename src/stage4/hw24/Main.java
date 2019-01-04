package stage4.hw24;

import java.util.Scanner;

/**
 * Write a program that prints a part of the sequence 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ... (the number is repeated as
 * many times, to what it equals to). The input to the program is a positive integer n: the number of the elements
 * of the sequence the program should print. Output the sequence of numbers, written in a single line, space-separated.
 * <p>
 * For example, if n = 7, then the program should output 1 2 2 3 3 3 4.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int currentNum = 1;
        int repeat = 1;

        while (num != 0) {
            if (repeat != 0) {
                repeat -= 1;
            } else {
                currentNum += 1;
                repeat = currentNum - 1;
            }
            num -= 1;
            System.out.println(currentNum);
        }
    }
}