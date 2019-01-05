package stage4.hw27;

import java.util.Scanner;

/**
 * Given the sequence of integers, ending with number 0. Find the average value of all elements in this sequence.
 * <p>
 * The number 0 itself is not included in the sequence and serves just as a sign of cessation.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        double total = 1;
        double sum = num;

        while (num != 0) {
            num = scanner.nextDouble();
            sum += num;
            if (num != 0) {
                total += 1;
            }
        }
        System.out.println(sum / total);
    }
}