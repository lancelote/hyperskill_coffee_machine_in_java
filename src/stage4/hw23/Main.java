package stage4.hw23;

import java.util.Scanner;

/**
 * Given a sequence of natural numbers, not exceeding 30000. Find the maximum element divisible by 4. As input,
 * the program gets the number of elements in the sequence, and then the elements themselves. In the sequence,
 * there is always an element divisible by 4. The number of elements does not exceed 1000. The program should print
 * a single number: the maximum element of the sequence divisible by 4.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        int biggestNumber = 0;

        while (numbers != 0) {
            int num = scanner.nextInt();
            if (num % 4 == 0 && num > biggestNumber) {
                biggestNumber = num;
            }
            numbers -= 1;
        }
        System.out.println(biggestNumber);
    }
}