package stage4.hw20;

import java.util.Scanner;

/**
 * Given the numbers a, b, c, d. Output in ascending order all the integers between 0 and 1000 which are
 * the roots of the equation ax3+bx2+cx+d=0.
 * <p>
 * If the specified interval does not contain the roots of the equation, do not output anything.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        for (int x = 0; x < 1000; x++) {
            if (a * Math.pow(x, 3) + b * Math.pow(x, 2) + c * x + d == 0) {
                System.out.println(x);
            }
        }
    }
}