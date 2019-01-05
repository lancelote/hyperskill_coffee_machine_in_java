package stage4.hw28;

import java.util.Scanner;

/**
 * Given the sequence of integer numbers (which ends with the number 0). Find the largest element of the sequence.
 * <p>
 * The number 0 itself is not included in the sequence but serves only as a sign of the sequence’s end.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largestNum = 0;
        int num;
        do {
            num = scanner.nextInt();
            if (num > largestNum) {
                largestNum = num;
            }
        } while (num != 0);
        System.out.println(largestNum);
    }
}