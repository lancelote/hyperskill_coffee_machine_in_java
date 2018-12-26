package stage2.hw38;

import java.util.Scanner;

/**
 * Given a natural number, not greater than 10000. Output the even number following this number.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num + 2 - num % 2);
    }
}