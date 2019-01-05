package stage4.hw31;

import java.util.Scanner;

/**
 * Find the sum of all elements of a sequence, ending with the number 0.
 * <p>
 * The number 0 itself is not included into the sequence and serves as a sign of cessation.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum = 0;

        do {
            num = scanner.nextInt();
            sum += num;
        } while (num != 0);
        System.out.println(sum);
    }
}