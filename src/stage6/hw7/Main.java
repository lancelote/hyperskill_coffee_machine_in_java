package stage6.hw7;

import java.util.Scanner;

/**
 * Given a string and two integer numbers. Output the substring enclosed in this range (inclusive). It's guaranteed
 * that both numbers greater than or equals to 0 and less than the string length.
 */
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        int from = scanner.nextInt();
        int to = scanner.nextInt();
        System.out.println(string.substring(from, to + 1));
    }
}