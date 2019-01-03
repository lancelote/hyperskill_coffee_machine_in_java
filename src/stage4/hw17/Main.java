package stage4.hw17;

import java.util.Scanner;

/**
 * Given a sequence of natural numbers, not exceeding 30000. Find the maximum element divisible by 4. The program
 * receives the number of elements in the sequence and then the elements themselves as input. In the sequence, there
 * is always an element divisible by 4. The number of elements does not exceed 1000. The program should print a single
 * number: the maximum element of the sequence divisible by 4.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int maxNum = 0;

        for (int i = 0; i < total; i++) {
            int num = scanner.nextInt();
            if (num % 4 == 0 && num > maxNum) {
                maxNum = num;
            }
        }
        System.out.println(maxNum);
    }
}