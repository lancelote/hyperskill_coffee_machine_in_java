package stage2.hw42;

import java.util.Scanner;

/**
 * Given a three-digit integer (i.e. an integer from 100 to 999). Find the sum of its digits.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int a = num / 100;
        int b = num % 100 / 10;
        int c = num % 10;
        System.out.println(a + b + c);
    }
}