package stage4.hw21;

import java.util.Scanner;

/**
 * Print the sum of all integers from a to b (a < b).
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;

        for (int i = a; i <= b; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}